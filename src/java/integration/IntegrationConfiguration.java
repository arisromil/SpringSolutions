package integration;

import jakarta.jms.ConnectionFactory;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.jms.dsl.Jms;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;


@Configuration
@EnableIntegration
public class IntegrationConfiguration {

	public class Main {
		public static void main(String[] args) {
			var cfg = IntegrationConfiguration.class;
			try (var ctx = new AnnotationConfigApplicationContext(cfg)) {
			}
		}
	}
	
}
