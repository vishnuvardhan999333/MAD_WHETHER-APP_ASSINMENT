package com.example.a23012531040_mad_assignment_app

data class HourlyWeatherData(
    val hourly: List<HourlyForecast>
)

data class HourlyForecast(
    val dt: Long,   // Time of the forecasted data, unix, UTC
    val temp: Double,
    val humidity: Int
)