package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName
import com.kiwi.assignment.data.model.AirlinesList


data class BaseResponse (

    @SerializedName("search_id"              ) var searchId             : String?                 = null,
    @SerializedName("currency"               ) var currency             : String?                 = null,
    @SerializedName("fx_rate"                ) var fxRate               : Int?                    = null,
    @SerializedName("data"                   ) var data                 : ArrayList<Data>         = arrayListOf(),
    @SerializedName("_results"               ) var Results              : Int?                    = null,
    @SerializedName("best_results"           ) var bestResults          : ArrayList<String>       = arrayListOf(),
    @SerializedName("search_params"          ) var searchParams         : SearchParams?           = SearchParams(),
    @SerializedName("hashtags"               ) var hashtags             : ArrayList<Hashtags>     = arrayListOf(),
    @SerializedName("location_hashtags"      ) var locationHashtags     : ArrayList<String>       = arrayListOf(),
    @SerializedName("airlinesList"           ) var airlinesList         : ArrayList<AirlinesList> = arrayListOf(),
    @SerializedName("airportsList"           ) var airportsList         : ArrayList<AirportsList> = arrayListOf(),
    @SerializedName("all_airlines"           ) var allAirlines          : ArrayList<String>       = arrayListOf(),
    @SerializedName("all_stopover_airports"  ) var allStopoverAirports  : ArrayList<String>       = arrayListOf(),
    @SerializedName("all_stopover_countries" ) var allStopoverCountries : ArrayList<String>       = arrayListOf(),
    @SerializedName("sort_version"           ) var sortVersion          : Int?                    = null

)