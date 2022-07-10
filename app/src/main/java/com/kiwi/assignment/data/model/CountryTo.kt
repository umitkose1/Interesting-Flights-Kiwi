package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class CountryTo (

  @SerializedName("code" ) var code : String? = null,
  @SerializedName("name" ) var name : String? = null

)