package entidades;

public class Localidad {
	
	int idLocalidad;
	String nombre;
	Float porcentajeRobo;
	Provincia provincia;
	
	public int getIdLocalidad() {
		return idLocalidad;
	}
	
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
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
	
	public Provincia getProvincia() {
		return provincia;
	}
	
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
}
