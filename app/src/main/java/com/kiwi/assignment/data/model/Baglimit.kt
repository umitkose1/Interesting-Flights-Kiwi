package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class Baglimit (

  @SerializedName("hand_height"         ) var handHeight        : Int? = null,
  @SerializedName("hand_length"         ) var handLength        : Int? = null,
  @SerializedName("hand_weight"         ) var handWeight        : Int? = null,
  @SerializedName("hand_width"          ) var handWidth         : Int? = null,
  @SerializedName("hold_dimensions_sum" ) var holdDimensionsSum : Int? = null,
  @SerializedName("hold_height"         ) var holdHeight        : Int? = null,
  @SerializedName("hold_length"         ) var holdLength        : Int? = null,
  @SerializedName("hold_weight"         ) var holdWeight        : Int? = null,
  @SerializedName("hold_width"          ) var holdWidth         : Int? = null

)