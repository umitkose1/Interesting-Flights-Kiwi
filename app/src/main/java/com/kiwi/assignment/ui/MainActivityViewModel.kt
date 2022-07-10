package com.kiwi.assignment.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kiwi.assignment.data.model.BaseResponse
import com.kiwi.assignment.data.repository.FlightsRepository
import com.kiwi.assignment.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private var repository: FlightsRepository) :
    ViewModel() {


    private val _response: MutableLiveData<Resource<BaseResponse>> = MutableLiveData()
    val response: LiveData<Resource<BaseResponse>> = _response


    fun fetchKiwiFlights(dateFrom: String, dateTo: String) = viewModelScope.launch {
        _response.postValue(Resource(Resource.Status.LOADING, null, null))
        repository.getFlights(dateFrom, dateTo).let {

            _response.postValue(Resource(Resource.Status.SUCCESS, it.data, null))
        }
    }
}