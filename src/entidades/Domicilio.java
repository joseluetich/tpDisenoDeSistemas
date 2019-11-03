package entidades;

public class Domicilio {
	
	int idDomicilio;
	String calle;
	int numero;
	int piso;
	char departamento;
	int codigoPostal;
	Localidad localidad;
	
	public int getIdDomicilio() {
		return idDomicilio;
	}
	
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	public char getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(char departamento) {
		this.departamento = departamento;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public Localidad getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
	
}
