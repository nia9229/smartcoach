package smartcoachIbatis.model;

import java.util.Date;

public class Objetivo {
	private String codObjetivo;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaPrevistaFin;
	private Date fechaFin;
	private String codDeportivo;
	
	public String getCodObjetivo() {
		return codObjetivo;
	}
	public void setCodObjetivo(String codObjetivo) {
		this.codObjetivo = codObjetivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaPrevistaFin() {
		return fechaPrevistaFin;
	}
	public void setFechaPrevistaFin(Date fechaPrevistaFin) {
		this.fechaPrevistaFin = fechaPrevistaFin;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getCodDeportivo() {
		return codDeportivo;
	}
	public void setCodDeportivo(String codDeportivo) {
		this.codDeportivo = codDeportivo;
	}
	
	@Override
	public String toString() {
		return "Objetivo [codObjetivo=" + codObjetivo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", fechaInicio=" + fechaInicio + ", fechaPrevistaFin=" + fechaPrevistaFin + ", fechaFin=" + fechaFin
				+ ", codDeportivo=" + codDeportivo + "]";
	}
}
