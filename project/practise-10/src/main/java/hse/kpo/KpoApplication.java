package hse.kpo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import hse.kpo.config.NotificationIntegrationProperty;

/**
 * Точка входа в приложение.
 */
@SpringBootApplication
@EnableConfigurationProperties(NotificationIntegrationProperty.class)
public class KpoApplication {
	public static void main(String[] args) {
		SpringApplication.run(KpoApplication.class, args);
	}
}
