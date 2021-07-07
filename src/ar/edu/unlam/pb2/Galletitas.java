package ar.edu.unlam.pb2;


public class Galletitas extends Producto implements Comestible{

	private String fechaElaboracion;
	private String fechaVencimiento;
	private String marca;
	private Double precio;

	public Galletitas(Integer codigo, String descripcion, String fechaElaboracion, String fechaVencimiento, String marca, Double precio) {
		super(codigo, descripcion, precio);
		this.fechaElaboracion=fechaElaboracion;
		this.fechaVencimiento=fechaVencimiento;
		this.marca=marca;
		
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
	public String getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaVencimiento;
	}

	public Double getPrecio() {
		return precio;
	}

}
