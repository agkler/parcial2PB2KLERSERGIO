package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {

	private String fechaElaboracion;
	private String fechaVencimiento;
	private Double kilos;
	private String marca;
	private Double precio;

	public Carne(Integer codigo, String descripcion,  String fechaElaboracion, String fechaVencimiento, Double kilos, String marca, Double precio) {
		super(codigo, descripcion, precio);
		this.fechaElaboracion=fechaElaboracion;
		this.fechaVencimiento=fechaVencimiento;
		this.kilos=kilos;
		this.marca=marca;
		
	}

	@Override
	public String getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaVencimiento;
	}

	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}

	public Double getKilos() {
		// TODO Auto-generated method stub
		return this.kilos;
	}

	public String getMarca() {
		return marca;
	}

	public Double getPrecio() {
		return precio;
	}

}
