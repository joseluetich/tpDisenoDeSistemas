package entidades;

import java.util.Date;

import enumerados.EstadoCivil;
import enumerados.Sexo;

public class Hijo {

	int idHijo;
	Date fechaDeNacimiento;
	EstadoCivil estadoCivil;
	Sexo sexo;
	
	
	public int getIdHijo() {
		return idHijo;
	}
	
	public void setIdHijo(int idHijo) {
		this.idHijo = idHijo;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
}
