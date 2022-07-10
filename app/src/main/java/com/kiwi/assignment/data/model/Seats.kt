package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class Seats (

  @SerializedName("passengers" ) var passengers : Int? = null,
  @SerializedName("adults"     ) var adults     : Int? = null,
  @SerializedName("children"   ) var children   : Int? = null,
  @SerializedName("infants"    ) var infants    : Int? = null

)