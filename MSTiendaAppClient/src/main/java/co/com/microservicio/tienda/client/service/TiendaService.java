package co.com.microservicio.tienda.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.com.microservicio.tienda.client.model.Producto;

@Service
public class TiendaService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	protected String url;
	
	public TiendaService(String url) {
		this.url = url.startsWith("http") ? url: "http://" + url;

	}


	//invoke to greeting-service and return a Greeting object
	public List<Producto> getProductos () {
		System.out.println("llamo al getProductos del Service");
		List<Producto> productos =  restTemplate.getForObject(url + "/productos",List.class);
		return productos;
	}

}
