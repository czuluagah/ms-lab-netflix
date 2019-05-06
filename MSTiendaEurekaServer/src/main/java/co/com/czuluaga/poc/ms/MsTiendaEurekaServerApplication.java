package co.com.czuluaga.poc.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsTiendaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTiendaEurekaServerApplication.class, args);
	}

}
