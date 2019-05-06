package co.com.czuluaga.poc.ms.tienda.rs;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.com.czuluaga.poc.ms.tienda.model.Producto;
import co.com.czuluaga.poc.ms.tienda.service.TiendaGateway;

@RestController
public class TiendaController {
	
	@GetMapping("/productos/{nombre}")
	public String hola( @PathVariable("nombre") String nombre ) {
		return "Hola! " +  nombre + " esta es tu tienda online";
	}
	
	
	@GetMapping("/productos")
	public List<Producto> productos() {
		System.out.println("Obteniendo listado de servicios");
		return TiendaGateway.getInstance().getProductos();
	}
	
	@GetMapping("/productosByMarca/{marca}")
	public List<Producto> productosByMarca(@PathVariable("marca") String marca) {
		return TiendaGateway.getInstance().getProductos();
	}
	
	@GetMapping("/productosByClase/{clase}")
	public List<Producto> productosByClase(@PathVariable("clase") String clase) {
		return TiendaGateway.getInstance().getProductos();
	}

}
