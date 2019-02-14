package org.springframework.samples.petclinic.system;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.CurrentWeatherDataApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherApiConfiguration {
    @Bean
    public CurrentWeatherDataApi currentWeatherDataApi() {
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey("53553e1d9785fa21498dff1fdbc417f5");
        return new CurrentWeatherDataApi(apiClient);
    }
}
