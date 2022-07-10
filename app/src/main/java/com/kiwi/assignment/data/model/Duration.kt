package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class Duration (

  @SerializedName("departure" ) var departure : Int? = null,
  @SerializedName("return"    ) var reTurn    : Int? = null,
  @SerializedName("total"     ) var total     : Int? = null

)