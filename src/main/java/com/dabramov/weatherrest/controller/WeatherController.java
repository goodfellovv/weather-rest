package com.dabramov.weatherrest.controller;

import com.dabramov.weatherrest.weatherserver.WeatherServer;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherServer weatherServer;

    @Cacheable("weather")
    @GetMapping(value = "/current", produces= MediaType.APPLICATION_JSON_VALUE)
    public String getWeather(@RequestParam(name = "lat", required = true) String lat,
                             @RequestParam(name = "lon", required = true) String lon,
                             @RequestParam(name = "units", required = false, defaultValue = "metric") String units,
                             @RequestParam(name = "lang", required = false) String lang) {
        return weatherServer.getWeather(lat, lon, units, lang);
    }
}
