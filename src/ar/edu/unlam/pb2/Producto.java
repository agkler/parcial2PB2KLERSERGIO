package ar.edu.unlam.pb2;

public class Producto {
	protected Integer codigo;
	protected String descripcion;
	protected Double precio;

	public Producto(Integer codigo, String descripcion, Double precio){
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.precio=precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Integer getCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}
	
	
}
