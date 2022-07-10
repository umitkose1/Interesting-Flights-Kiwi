package com.kiwi.assignment.data.remote

import com.kiwi.assignment.data.model.BaseResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


const val API = "flights"

const val V = "3"
const val SORT = "popularity"
const val ASC = "0"
const val LOCALE = "en"
const val FLYFROM = "49.2-16.61-250km"
const val TO = "anywhere"
const val TYPEFLIGHT = "oneway"
const val ONEPERDATE = "0"
const val ONEFORCITY = "1"
const val WAITFORREFRESH = "0"
const val ADULTS = "1"
const val LIMIT = "5"
const val PARTNER = "skypicker-android"


interface KiwiApi {

    @GET(API)
    suspend fun getFlights(
        @Query("v") v: String = V,
        @Query("sort") sort: String = SORT,
        @Query("asc") asc: String = ASC,
        @Query("locale") locale: String = LOCALE,
        @Query("flyFrom") flyFrom: String = FLYFROM,
        @Query("to") to: String = TO,
        @Query("dateFrom") dateFrom: String,
        @Query("dateTo") dateTo: String,
        @Query("typeFlight") typeFlight: String = TYPEFLIGHT,
        @Query("one_per_date") onePerDate: String = ONEPERDATE,
        @Query("oneforcity") oneForCity: String = ONEFORCITY,
        @Query("wait_for_refresh") waitForRefresh: String = WAITFORREFRESH,
        @Query("adults") adults: String = ADULTS,
        @Query("limit") limit: String = LIMIT,
        @Query("partner") partner: String = PARTNER

    ): Response<BaseResponse>

}