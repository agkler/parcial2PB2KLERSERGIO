package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	
	public Supermercado(String nombre) {
		this.nombre=nombre;
		productosExistentes= new HashSet<Producto>();
		productosDisponibles= new ArrayList<Producto>();
		ventasRealizadas= new HashMap<Integer, Venta>();
		contadorDeVentas=0;
	}

	public void ingresarProducto(Producto nuevo) {
		productosExistentes.add(nuevo);	
		productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		Integer stock = 0;
		for (Producto producto : productosDisponibles) {
			if (producto.getCodigo().equals(codigo)) {
				stock++;
			}
		}
		return stock;
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		for (Producto producto : productosExistentes) {
			if(producto.getCodigo().equals(codigoDeProducto))
				return true;
		}
		return false;
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		for (Producto producto : productosDisponibles) {
			if(producto.getCodigo().equals(codigoDeProducto)) {
				return producto;
			}
		}
		return null;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer numeroDeVenta) {
		return ventasRealizadas.get(numeroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"

		Venta nuevaVenta = getVenta(numeroDeVenta);
		if (this.getProductoPorCodigo(codigoDeProducto) != null) {
			nuevaVenta.agregarVenta(this.getProductoPorCodigo(codigoDeProducto));
			productosDisponibles.remove(this.getProductoPorCodigo(codigoDeProducto));
		} else {
			throw new ProductoSinStock();
		}

		throw new ProductoInexistente();
	}

}


	


