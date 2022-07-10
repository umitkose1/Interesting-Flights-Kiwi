package com.kiwi.assignment.data.model

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("id"                            ) var id                          : String?           = null,
  @SerializedName("flyFrom"                       ) var flyFrom                     : String?           = null,
  @SerializedName("flyTo"                         ) var flyTo                       : String?           = null,
  @SerializedName("cityFrom"                      ) var cityFrom                    : String?           = null,
  @SerializedName("cityCodeFrom"                  ) var cityCodeFrom                : String?           = null,
  @SerializedName("cityTo"                        ) var cityTo                      : String?           = null,
  @SerializedName("cityCodeTo"                    ) var cityCodeTo                  : String?           = null,
  @SerializedName("countryFrom"                   ) var countryFrom                 : CountryFrom?      = CountryFrom(),
  @SerializedName("countryTo"                     ) var countryTo                   : CountryTo?        = CountryTo(),
  @SerializedName("dTime"                         ) var dTime                       : Int?              = null,
  @SerializedName("dTimeUTC"                      ) var dTimeUTC                    : Int?              = null,
  @SerializedName("aTime"                         ) var aTime                       : Int?              = null,
  @SerializedName("aTimeUTC"                      ) var aTimeUTC                    : Int?              = null,
  @SerializedName("nightsInDest"                  ) var nightsInDest                : String?           = null,
  @SerializedName("quality"                       ) var quality                     : Double?           = null,
  @SerializedName("popularity"                    ) var popularity                  : Int?              = null,
  @SerializedName("distance"                      ) var distance                    : Double?              = null,
  @SerializedName("duration"                      ) var duration                    : Duration?         = Duration(),
  @SerializedName("fly_duration"                  ) var flyDuration                 : String?           = null,
  @SerializedName("price"                         ) var price                       : Int?              = null,
  @SerializedName("conversion"                    ) var conversion                  : Conversion?       = Conversion(),
  @SerializedName("baglimit"                      ) var baglimit                    : Baglimit?         = Baglimit(),
  @SerializedName("availability"                  ) var availability                : Availability?     = Availability(),
  @SerializedName("airlines"                      ) var airlines                    : ArrayList<String> = arrayListOf(),
  @SerializedName("route"                         ) var route                       : ArrayList<Route>  = arrayListOf(),
  @SerializedName("booking_token"                 ) var bookingToken                : String?           = null,
  @SerializedName("deep_link"                     ) var deepLink                    : String?           = null,
  @SerializedName("tracking_pixel"                ) var trackingPixel               : String?           = null,
  @SerializedName("facilitated_booking_available" ) var facilitatedBookingAvailable : Boolean?          = null,
  @SerializedName("pnr_count"                     ) var pnrCount                    : Int?              = null,
  @SerializedName("has_airport_change"            ) var hasAirportChange            : Boolean?          = null,
  @SerializedName("technical_stops"               ) var technicalStops              : Int?              = null,
  @SerializedName("throw_away_ticketing"          ) var throwAwayTicketing          : Boolean?          = null,
  @SerializedName("hidden_city_ticketing"         ) var hiddenCityTicketing         : Boolean?          = null,
  @SerializedName("virtual_interlining"           ) var virtualInterlining          : Boolean?          = null,
  @SerializedName("mapIdfrom"                     ) var mapIdfrom                   : String?           = null,
  @SerializedName("mapIdto"                       ) var mapIdto                     : String?           = null,
  @SerializedName("hashtags"                      ) var hashtags                    : ArrayList<String> = arrayListOf()

)