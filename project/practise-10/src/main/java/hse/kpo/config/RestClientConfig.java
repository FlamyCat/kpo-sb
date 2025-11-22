package hse.kpo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@EnableConfigurationProperties(NotificationIntegrationProperty.class)
public class RestClientConfig {

    private final NotificationIntegrationProperty notificationIntegrationProperty;

    public RestClientConfig(NotificationIntegrationProperty notificationIntegrationProperty) {
        this.notificationIntegrationProperty = notificationIntegrationProperty;
    }

    @Bean
    public RestClient notificationRestClient() {
        return RestClient.builder()
                .baseUrl(notificationIntegrationProperty.getBaseUrl())
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("Accept", "application/json")
                .requestTimeout(java.time.Duration.ofSeconds(30))
                .build();
    }
}