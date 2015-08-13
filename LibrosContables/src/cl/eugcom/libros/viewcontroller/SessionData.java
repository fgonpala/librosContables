package cl.eugcom.libros.viewcontroller;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import cl.eugcom.libros.model.EmpresaVO;

@ManagedBean
@SessionScoped
public class SessionData {
	private EmpresaVO empresaSeleccionada;

	public EmpresaVO getEmpresaSeleccionada() {
		return empresaSeleccionada;
	}

	public void setEmpresaSeleccionada(EmpresaVO empresaSeleccionada) {
		this.empresaSeleccionada = empresaSeleccionada;
	}
	

}
