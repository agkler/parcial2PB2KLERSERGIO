package ar.edu.unlam.pb2;

public class Zapatilla extends Producto implements Indumentaria {

	private String talle;
	private String marca;
	private String color;
	private Double precio;

	public Zapatilla(Integer codigo, String descripcion, String talle, String marca, String color, Double precio) {
		super(codigo, descripcion, precio);
		this.talle=talle;
		this.marca=marca;
		this.color=color;

	}

	@Override
	public String getTalle() {
		// TODO Auto-generated method stub
		return this.talle;
	}

	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

}
