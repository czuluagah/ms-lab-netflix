package co.com.microservicio.tienda.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import co.com.microservicio.tienda.client.service.TiendaService;
import co.com.microservicio.tienda.rs.HomeController;
import co.com.microservicio.tienda.rs.TiendaClientController;

import org.springframework.boot.SpringApplication;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class TiendaAppClientServer {
	
	public static final String SERVICE_URL = "http://TIENDA-APP-SERVICE";


	public static void main(String[] args) {
		SpringApplication.run(TiendaAppClientServer.class, args);

	}


	//A customized RestTemplate that has the ribbon load balancer build in
    @LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}


	// The service encapsulates the interaction with the micro-service.
	@Bean
	public TiendaService tiendaService() {
		return new TiendaService(SERVICE_URL);
	}
	
	
	@Bean
	public TiendaClientController tiendaController() {
		return new TiendaClientController(tiendaService());
	}


	//Create the controller, passing it the ClientGreetingService to use.
	/*@Bean
	public HomeController home() {
		return new HomeController();
	}*/
}
