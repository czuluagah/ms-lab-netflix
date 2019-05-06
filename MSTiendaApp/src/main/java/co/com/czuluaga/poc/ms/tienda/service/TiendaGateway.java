package co.com.czuluaga.poc.ms.tienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.czuluaga.poc.ms.tienda.model.Producto;

@Service
public class TiendaGateway {

	final static Producto prod1 = new Producto("TV", "900000", "32 pulgadas, 4k, HDR","LG" );
	final static Producto prod2 = new Producto("TV", "1900000", "43 pulgadas, 4k, HDR","LG" );
	final static Producto prod3 = new Producto("TV", "900000", "32 pulgadas, 4k, HDR","SONY" );
	final static Producto prod4 = new Producto("TV", "1900000", "43 pulgadas, 4k, HDR","SONY" );
	
	final static Producto prod5 = new Producto("CONSOLA", "1200000", "Play Station 4","SONY" );
	final static Producto prod6 = new Producto("CONSOLA", "1300000", "XBOX ONE","MICROSFOT" );
	
	final static List<Producto> productos = new ArrayList<Producto>();
	static TiendaGateway gateway = null;
	

	public static TiendaGateway getInstance() {
		if(gateway == null) {
			gateway = new TiendaGateway();
			gateway.productos.add(prod1);
			gateway.productos.add(prod2);
			gateway.productos.add(prod3);
			gateway.productos.add(prod4);
			gateway.productos.add(prod5);
			gateway.productos.add(prod6);
			
		}
		return gateway;
	}
	
	
	public List<Producto> getProductos(){
		return gateway.productos;
	}
	
}
