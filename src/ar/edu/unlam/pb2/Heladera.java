package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {

	private Boolean esNoFrost;
	private Integer garantia;
	private String marca;
	private Double precio;

	public Heladera(Integer codigo, String descripcion, Boolean esNoFrost, Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, precio);
		this.esNoFrost=esNoFrost;
		this.garantia=garantia;
		this.marca=marca;
		
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}

	public Boolean isNoFrost() {
		// TODO Auto-generated method stub
		return this.esNoFrost;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

}
