package co.com.microservicio.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import co.com.microservicio.tienda.filter.CustoPremFilter;

@SpringBootApplication
@EnableZuulProxy
public class MsTiendaAppEdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTiendaAppEdgeServerApplication.class, args);
	}
	
	@Bean
	public CustoPremFilter preFilter() {
		return new CustoPremFilter();
	}

}
