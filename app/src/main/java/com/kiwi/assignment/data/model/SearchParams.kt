package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class SearchParams (

  @SerializedName("flyFrom_type" ) var flyFromType : String? = null,
  @SerializedName("to_type"      ) var toType      : String? = null,
  @SerializedName("seats"        ) var seats       : Seats?  = Seats()

)