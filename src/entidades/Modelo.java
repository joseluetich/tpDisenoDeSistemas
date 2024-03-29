package entidades;

public class Modelo {
	
	int idModelo;
	String nombre;
	Float porcentajeRobo;
	AņoFabricacion aņoFabricacion;
	Marca marca;
	
	
	public Modelo() {
		
	}
	
	public Modelo(int idModelo, String nombre, Float porcentajeRobo, AņoFabricacion aņoFabricacion, Marca marca) {
		this.idModelo = idModelo;
		this.nombre = nombre;
		this.porcentajeRobo = porcentajeRobo;
		this.aņoFabricacion = aņoFabricacion;
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
	
	public AņoFabricacion getAņoFabricacion() {
		return aņoFabricacion;
	}
	
	public void setAņoFabricacion(AņoFabricacion aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
