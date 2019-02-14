package org.springframework.samples.petclinic.system;


import org.openapitools.client.ApiException;
import org.openapitools.client.api.CurrentWeatherDataApi;
import org.openapitools.client.model.Model200;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
class WelcomeController {
    private final CurrentWeatherDataApi currentWeatherDataApi;

    WelcomeController(CurrentWeatherDataApi currentWeatherDataApi) {
        this.currentWeatherDataApi = currentWeatherDataApi;
    }

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        String temp = "9";
        String min = "8";
        String max = "7";
        try {
            Model200 weatherData = currentWeatherDataApi.currentWeatherData("Mumbai", null, null, null, null, "metric", null, null);
            temp = weatherData.getMain().getTemp() + "";
            min = weatherData.getMain().getTempMin() + "";
            max = weatherData.getMain().getTempMax() + "";
        } catch (ApiException e) {}

        model.put("temp", temp);
        model.put("min", min);
        model.put("max", max);
        return "welcome";
    }
}
