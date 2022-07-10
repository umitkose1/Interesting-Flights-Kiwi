package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class CountryFrom (

  @SerializedName("code" ) var code : String? = null,
  @SerializedName("name" ) var name : String? = null

)