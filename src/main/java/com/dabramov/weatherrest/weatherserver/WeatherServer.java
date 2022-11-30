package com.dabramov.weatherrest.weatherserver;

public interface WeatherServer {
    String getWeather(String lat, String lon, String units, String lang);
}
