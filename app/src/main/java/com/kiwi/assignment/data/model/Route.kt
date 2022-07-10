package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class Route (

  @SerializedName("id"                    ) var id                  : String?  = null,
  @SerializedName("combination_id"        ) var combinationId       : String?  = null,
  @SerializedName("flyFrom"               ) var flyFrom             : String?  = null,
  @SerializedName("flyTo"                 ) var flyTo               : String?  = null,
  @SerializedName("cityFrom"              ) var cityFrom            : String?  = null,
  @SerializedName("cityCodeFrom"          ) var cityCodeFrom        : String?  = null,
  @SerializedName("cityTo"                ) var cityTo              : String?  = null,
  @SerializedName("cityCodeTo"            ) var cityCodeTo          : String?  = null,
  @SerializedName("dTime"                 ) var dTime               : Int?     = null,
  @SerializedName("dTimeUTC"              ) var dTimeUTC            : Int?     = null,
  @SerializedName("aTime"                 ) var aTime               : Int?     = null,
  @SerializedName("aTimeUTC"              ) var aTimeUTC            : Int?     = null,
  @SerializedName("airline"               ) var airline             : String?  = null,
  @SerializedName("flight_no"             ) var flightNo            : Int?     = null,
  @SerializedName("operating_carrier"     ) var operatingCarrier    : String?  = null,
  @SerializedName("operating_flight_no"   ) var operatingFlightNo   : String?  = null,
  @SerializedName("fare_basis"            ) var fareBasis           : String?  = null,
  @SerializedName("fare_category"         ) var fareCategory        : String?  = null,
  @SerializedName("fare_classes"          ) var fareClasses         : String?  = null,
  @SerializedName("fare_family"           ) var fareFamily          : String?  = null,
  @SerializedName("return"                ) var reTurn              : Int?     = null,
  @SerializedName("latFrom"               ) var latFrom             : Double?  = null,
  @SerializedName("lngFrom"               ) var lngFrom             : Double?  = null,
  @SerializedName("latTo"                 ) var latTo               : Double?  = null,
  @SerializedName("lngTo"                 ) var lngTo               : Double?  = null,
  @SerializedName("mapIdfrom"             ) var mapIdfrom           : String?  = null,
  @SerializedName("mapIdto"               ) var mapIdto             : String?  = null,
  @SerializedName("bags_recheck_required" ) var bagsRecheckRequired : Boolean? = null,
  @SerializedName("vi_connection"         ) var viConnection        : Boolean? = null,
  @SerializedName("guarantee"             ) var guarantee           : Boolean? = null,
  @SerializedName("equipment"             ) var equipment           : String?  = null,
  @SerializedName("vehicle_type"          ) var vehicleType         : String?  = null,
  @SerializedName("original_return"       ) var originalReturn      : Int?     = null

)