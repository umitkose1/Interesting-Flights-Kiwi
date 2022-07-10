package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class AirportsList (

  @SerializedName("filterName" ) var filterName : String? = null,
  @SerializedName("name"       ) var name       : String? = null

)