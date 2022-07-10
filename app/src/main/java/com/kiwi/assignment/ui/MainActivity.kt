package com.kiwi.assignment.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.CalendarConstraints.DateValidator
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.kiwi.assignment.adapter.FlightListAdapter
import com.kiwi.assignment.databinding.ActivityMainBinding
import com.kiwi.assignment.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
@WithFragmentBindings
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var adapterFlights: FlightListAdapter

    private val viewModel: MainActivityViewModel by viewModels()

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            initializeRecycler()
        }
        viewModel.response.observe(this) {
            when (it.status) {
                Resource.Status.LOADING -> {
                    showAnimation()
                    binding.emptyView.visibility = GONE
                    binding.rvList.visibility = GONE
                }

                Resource.Status.SUCCESS -> {
                    binding.emptyView.visibility = GONE
                    binding.rvList.visibility = VISIBLE
                    adapterFlights = it.data?.let { it1 -> FlightListAdapter(it1.data) }!!
                    binding.rvList.adapter = adapterFlights
                    pauseAnimation()
                }

                Resource.Status.ERROR -> binding.emptyView.visibility = VISIBLE
            }

        }

        binding.buttonDatePicker.setOnClickListener {
            createDatePicker()
        }

    }

    private fun initializeRecycler() {
        binding.rvList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun createDatePicker() {
        val sdf = SimpleDateFormat(DATE_FORMAT)
        val dateValidator: DateValidator = DateValidatorPointForward.now()

        val constraintBuilder = CalendarConstraints.Builder()
            .setValidator(dateValidator).build()

        val picker = MaterialDatePicker.Builder.datePicker()
            .setTitleText(TITLE_TEXT)
            .setCalendarConstraints(constraintBuilder)
            .build()

        picker.addOnPositiveButtonClickListener {
            val date = Date(it)
            val formattedDate = sdf.format(date)
            binding.buttonDatePicker.text = formattedDate
            viewModel.fetchKiwiFlights(formattedDate, formattedDate)
        }
        picker.show(this.supportFragmentManager, TAG)
    }

    private fun showAnimation() {
        binding.animationLoading.visibility = VISIBLE
        binding.animationLoading.playAnimation()
    }

    private fun pauseAnimation() {
        binding.animationLoading.visibility = GONE
        binding.animationLoading.pauseAnimation()
    }

    companion object {
        const val DATE_FORMAT = "dd/MM/yyyy"
        const val TITLE_TEXT = "Select Date"
        const val TAG = "materialDatePicker"
    }
}