package cl.eugcom.libros.model;

import java.io.Serializable;

public class EmpresaVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String rut;
	private String nombre;
	private String direccion;
	private String comuna;
	private String rubro;
	private boolean seleccionar;
	
	public EmpresaVO(String rut, String nombre, String direccion, String comuna,
			String rubro) {
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.comuna = comuna;
		this.rubro = rubro;
	}

	public EmpresaVO() {
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public boolean isSeleccionar() {
		return seleccionar;
	}

	public void setSeleccionar(boolean seleccionar) {
		this.seleccionar = seleccionar;
	}
	
}