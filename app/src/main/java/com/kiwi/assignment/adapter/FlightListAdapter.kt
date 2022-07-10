package com.kiwi.assignment.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.kiwi.assignment.BuildConfig
import com.kiwi.assignment.data.model.Data
import com.kiwi.assignment.databinding.FlightListItemBinding

class FlightListAdapter(
    private var flightList: ArrayList<Data>,
) : RecyclerView.Adapter<FlightListAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: FlightListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FlightListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(flightList[position]) {
                binding.countryCode.text = "${countryFrom?.code} - ${countryTo?.code}"
                binding.flightDepartureStation.text = cityFrom
                binding.flightArrivalStation.text = cityTo
                binding.flightTotalDuration.text = flyDuration
                binding.flightPrice.text = "$price €"

                Glide.with(itemView).load(BuildConfig.BASE_IMAGE + mapIdto + ".jpg")
                    .apply(
                        RequestOptions().centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL)
                            .dontAnimate()
                    )
                    .into(binding.imgAirline)
            }

        }
    }

    override fun getItemCount(): Int {
        return flightList.size
    }
}