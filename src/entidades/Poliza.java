package entidades;

import java.util.ArrayList;
import java.util.Date;

import enumerados.EstadoPoliza;
import enumerados.FormaDePago;

public class Poliza {

	String numeroDePoliza;
	Date fechaInicioVigencia;
	Date fechaFinVigencia;
	Date fechaDeEmision;
	String motorVehiculo;
	String chasisVehiculo;
	Float sumaAsegurada;
	String patente;
	int kilometrosPorA�o;
	FormaDePago formaDePago;
	int a�oVehiculo;
	EstadoPoliza estado;
	Cliente cliente;
	Modelo modelo;
	Premio premio;
	Descuentos descuentos;
	MedidasDeSeguridad medidasDeSeguridad;
	Cobertura cobertura;
	ArrayList<Hijo> hijos = new ArrayList<>();
	Localidad domicilioDeRiesgo;
	
	public Poliza() {
		
	}
	
	public Poliza(String numeroDePoliza, Date fechaInicioVigencia, Date fechaFinVigencia, Date fechaDeEmision,
			String motorVehiculo, String chasisVehiculo, Float sumaAsegurada, String patente, int kilometrosPorA�o,
			FormaDePago formaDePago, int a�oVehiculo, EstadoPoliza estado, Cliente cliente, Modelo modelo,
			Premio premio, Descuentos descuentos, MedidasDeSeguridad medidasDeSeguridad, Cobertura cobertura,
			ArrayList<Hijo> hijos, Localidad domicilioDeRiesgo) {
		this.numeroDePoliza = numeroDePoliza;
		this.fechaInicioVigencia = fechaInicioVigencia;
		this.fechaFinVigencia = fechaFinVigencia;
		this.fechaDeEmision = fechaDeEmision;
		this.motorVehiculo = motorVehiculo;
		this.chasisVehiculo = chasisVehiculo;
		this.sumaAsegurada = sumaAsegurada;
		this.patente = patente;
		this.kilometrosPorA�o = kilometrosPorA�o;
		this.formaDePago = formaDePago;
		this.a�oVehiculo = a�oVehiculo;
		this.estado = estado;
		this.cliente = cliente;
		this.modelo = modelo;
		this.premio = premio;
		this.descuentos = descuentos;
		this.medidasDeSeguridad = medidasDeSeguridad;
		this.cobertura = cobertura;
		this.hijos = hijos;
		this.domicilioDeRiesgo = domicilioDeRiesgo;
	}

	public String getNumeroDePoliza() {
		return numeroDePoliza;
	}
	
	public void setNumeroDePoliza(String numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}
	
	public Date getFechaInicioVigencia() {
		return fechaInicioVigencia;
	}
	
	public void setFechaInicioVigencia(Date fechaInicioVigencia) {
		this.fechaInicioVigencia = fechaInicioVigencia;
	}
	
	public Date getFechaFinVigencia() {
		return fechaFinVigencia;
	}
	
	public void setFechaFinVigencia(Date fechaFinVigencia) {
		this.fechaFinVigencia = fechaFinVigencia;
	}
	
	public Date getFechaDeEmision() {
		return fechaDeEmision;
	}
	
	public void setFechaDeEmision(Date fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}
	
	public String getMotorVehiculo() {
		return motorVehiculo;
	}
	
	public void setMotorVehiculo(String motorVehiculo) {
		this.motorVehiculo = motorVehiculo;
	}
	
	public String getChasisVehiculo() {
		return chasisVehiculo;
	}
	
	public void setChasisVehiculo(String chasisVehiculo) {
		this.chasisVehiculo = chasisVehiculo;
	}
	
	public Float getSumaAsegurada() {
		return sumaAsegurada;
	}
	
	public void setSumaAsegurada(Float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public int getKilometrosPorA�o() {
		return kilometrosPorA�o;
	}
	
	public void setKilometrosPorA�o(int kilometrosPorA�o) {
		this.kilometrosPorA�o = kilometrosPorA�o;
	}
	
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	public int getA�oVehiculo() {
		return a�oVehiculo;
	}
	
	public void setA�oVehiculo(int a�oVehiculo) {
		this.a�oVehiculo = a�oVehiculo;
	}
	
	public EstadoPoliza getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoPoliza estado) {
		this.estado = estado;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Modelo getModelo() {
		return modelo;
	}
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	public Premio getPremio() {
		return premio;
	}
	
	public void setPremio(Premio premio) {
		this.premio = premio;
	}
	
	public Descuentos getDescuentos() {
		return descuentos;
	}
	
	public void setDescuentos(Descuentos descuentos) {
		this.descuentos = descuentos;
	}
	
	public MedidasDeSeguridad getMedidasDeSeguridad() {
		return medidasDeSeguridad;
	}
	
	public void setMedidasDeSeguridad(MedidasDeSeguridad medidasDeSeguridad) {
		this.medidasDeSeguridad = medidasDeSeguridad;
	}
	
	public Cobertura getCobertura() {
		return cobertura;
	}
	
	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	public ArrayList<Hijo> getHijos() {
		return hijos;
	}
	
	public void setHijos(ArrayList<Hijo> hijos) {
		this.hijos = hijos;
	}

	public Localidad getDomicilioDeRiesgo() {
		return domicilioDeRiesgo;
	}

	public void setDomicilioDeRiesgo(Localidad domicilioDeRiesgo) {
		this.domicilioDeRiesgo = domicilioDeRiesgo;
	}

	
}
