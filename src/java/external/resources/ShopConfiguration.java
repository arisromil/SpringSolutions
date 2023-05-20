package external.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:discounts.properties")
public class ShopConfiguration {
	
	@Value("${endofyear.discount:0}")
	private double specialEndofyearDiscountField;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer pspc() {
	return new PropertySourcesPlaceholderConfigurer();
	}
	
	
}
