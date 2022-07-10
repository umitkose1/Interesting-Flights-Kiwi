package com.kiwi.assignment.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val kiwiApi: KiwiApi) :
    BaseDataSource() {

    suspend fun getKiwiFlights(dateFrom: String, dateTo: String) =
        getResult { kiwiApi.getFlights(dateFrom = dateFrom, dateTo = dateTo) }

}