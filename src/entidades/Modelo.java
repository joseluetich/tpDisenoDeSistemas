package entidades;

public class Modelo {
	
	int idModelo;
	String nombre;
	Float porcentajeRobo;
	A�oFabricacion a�oFabricacion;
	Marca marca;
	
	
	public Modelo() {
		
	}
	
	public Modelo(int idModelo, String nombre, Float porcentajeRobo, A�oFabricacion a�oFabricacion, Marca marca) {
		this.idModelo = idModelo;
		this.nombre = nombre;
		this.porcentajeRobo = porcentajeRobo;
		this.a�oFabricacion = a�oFabricacion;
		this.marca = marca;
	}

	public int getIdModelo() {
		return idModelo;
	}
	
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Float getPorcentajeRobo() {
		return porcentajeRobo;
	}
	
	public void setPorcentajeRobo(Float porcentajeRobo) {
		this.porcentajeRobo = porcentajeRobo;
	}
	
	public A�oFabricacion getA�oFabricacion() {
		return a�oFabricacion;
	}
	
	public void setA�oFabricacion(A�oFabricacion a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
