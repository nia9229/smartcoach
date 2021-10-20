package smartcoachIbatis.model;

import java.time.LocalTime;

public class PerfilDeportivo {
	private String codDeportivo;
	private String experiencia;
	private LocalTime horaIniTrabajo;
	private LocalTime horaFinTrabajo;
	private String patologias;
	private String codProfesion;
	
	public String getCodDeportivo() {
		return codDeportivo;
	}
	public void setCodDeportivo(String codDeportivo) {
		this.codDeportivo = codDeportivo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public LocalTime getHoraIniTrabajo() {
		return horaIniTrabajo;
	}
	public void setHoraIniTrabajo(LocalTime horaIniTrabajo) {
		this.horaIniTrabajo = horaIniTrabajo;
	}
	public LocalTime getHoraFinTrabajo() {
		return horaFinTrabajo;
	}
	public void setHoraFinTrabajo(LocalTime horaFinTrabajo) {
		this.horaFinTrabajo = horaFinTrabajo;
	}
	public String getPatologias() {
		return patologias;
	}
	public void setPatologias(String patologias) {
		this.patologias = patologias;
	}
	public String getCodProfesion() {
		return codProfesion;
	}
	public void setCodProfesion(String codProfesion) {
		this.codProfesion = codProfesion;
	}
	@Override
	public String toString() {
		return "PerfilDeportivo [codDeportivo=" + codDeportivo + ", experiencia=" + experiencia + ", horaIniTrabajo="
				+ horaIniTrabajo + ", horaFinTrabajo=" + horaFinTrabajo + ", patologias=" + patologias
				+ ", codProfesion=" + codProfesion + "]";
	}
}
