package com.kiwi.assignment.data.repository

import com.kiwi.assignment.data.remote.RemoteDataSource
import javax.inject.Inject

class FlightsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {

    suspend fun getFlights(dateFrom: String, dateTo: String) =
        remoteDataSource.getKiwiFlights(dateFrom, dateTo)
}