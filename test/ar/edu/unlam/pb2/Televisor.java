package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {

	private Integer pulgadas;
	private Integer garantia;
	private String marca;
	private Double precio;

	public Televisor(Integer codigo, String descripcion, Integer pulgadas, Integer garantia, String marca,
			Double precio) {
		super(codigo, descripcion, precio);
		this.pulgadas = pulgadas;
		this.garantia = garantia;
		this.marca = marca;
	
	}

	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}

	public Integer getPulgadas() {
		// TODO Auto-generated method stub
		return this.pulgadas;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;

	}

	public Double getPrecio() {
		return precio;
	}

}
