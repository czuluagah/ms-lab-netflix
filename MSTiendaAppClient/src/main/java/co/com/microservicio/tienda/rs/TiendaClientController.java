package co.com.microservicio.tienda.rs;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.microservicio.tienda.client.model.Producto;
import co.com.microservicio.tienda.client.service.TiendaService;

@Controller
public class TiendaClientController {
	
	protected TiendaService service;
	
	public TiendaClientController(TiendaService service) {
		this.service  = service;
	}
	
	
	@GetMapping("/")
	public String base() {
		return "index";

	}
		
	@GetMapping("/productos")
	public String listar(Model model) {
		List<Producto> productos = service.getProductos();
		model.addAttribute("productos", productos);
		return "productos";

	}
}

