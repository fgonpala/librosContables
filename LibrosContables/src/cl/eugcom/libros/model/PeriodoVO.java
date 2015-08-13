package cl.eugcom.libros.model;

import java.io.Serializable;

public class PeriodoVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer mes;
	private String glosaMes;
	private Integer year;
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getGlosaMes() {
		return glosaMes;
	}
	public void setGlosaMes(String glosaMes) {
		this.glosaMes = glosaMes;
	}
	
	

}
