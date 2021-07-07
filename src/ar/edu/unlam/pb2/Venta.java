package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Venta {

	private Integer dniDelComprador;
	private String nombreDelComprador;
	private ArrayList<Producto> productosVendidos;
	private Double importeTotal;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador=dniDelComprador;
		this.nombreDelComprador=nombreDelComprador;
		productosVendidos= new ArrayList<Producto>();
		this.importeTotal=0.0;
	}

	public void agregarVenta(Producto nuevoProducto) {
		productosVendidos.add(nuevoProducto);
		importeTotal+= nuevoProducto.getPrecio();
		
	}

	public Double getImporte() {
		// TODO Auto-generated method stub
		return importeTotal;
	}

}
