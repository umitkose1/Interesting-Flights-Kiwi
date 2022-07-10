package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class Hashtags (

  @SerializedName("count" ) var count : Int?    = null,
  @SerializedName("name"  ) var name  : String? = null

)