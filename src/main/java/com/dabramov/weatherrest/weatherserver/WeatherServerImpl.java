package com.dabramov.weatherrest.weatherserver;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class WeatherServerImpl implements WeatherServer {
    private final RestTemplate restTemplate;
    @Value("${weather.api.url: http://api.openweathermap.org/data/2.5/weather}")
    private String WEATHER_SERVICE_URL;
    @Value("${weather.api.key: c4ccfa07e4d6e24041c12c94a9c05b03}")
    private String WEATHER_SERVICE_KEY;

    public String getWeather(String lat, String lon, String units, String lang) {
        URI uri = UriComponentsBuilder
                .fromUriString(WEATHER_SERVICE_URL)
                .queryParam("lat", lat)
                .queryParam("lon", lon)
                .queryParam("appId", WEATHER_SERVICE_KEY)
                .queryParam("units", units)
                .queryParam("lang", lang)
                .build()
                .toUri();
        return restTemplate.getForObject(uri, String.class);
    }

}
