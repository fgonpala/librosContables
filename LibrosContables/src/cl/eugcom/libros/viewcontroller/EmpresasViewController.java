package cl.eugcom.libros.viewcontroller;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import cl.eugcom.libros.model.EmpresaVO;

@ManagedBean
@ViewScoped
public class EmpresasViewController {
	
	private List<EmpresaVO> listar_empresas = new ArrayList<EmpresaVO>();
	private EmpresaVO empresaSeleccionada;
	
	public EmpresasViewController() 
	{
		System.out.println("Login");
        IniciarEmpresas();
	}
	private void IniciarEmpresas()
	{
		EmpresaVO empA = new EmpresaVO("82771800-9", "IMPORTADORA ORLEANS LTDA.", "teatinos 234", "Santiago Centro", "Compra");
		EmpresaVO empA1 = new EmpresaVO("90635000-9", "TELEFONICA CHILE S.A.", "providencia 5987", "Providencia", "Compra");
		EmpresaVO empA2 = new EmpresaVO("82771800-9", "AGUAS ANDINAS S.A.", "camino melipilla 9800", "Cerrillo","Compra");
		EmpresaVO empA3 = new EmpresaVO("76141975-7", "INSUFER S.A.", "San Ignacio 8479", "Quilicura", "Ventas");
		EmpresaVO empA4 = new EmpresaVO("76549080-4", "FIBRASPORT S.A.", "bosque sur 2450", "Las Condes", "Ventas");
		EmpresaVO empA5 = new EmpresaVO("76071594-8", "DOMOTEC LTDA", "macul 7256", "Macul", "Ventas");
		listar_empresas.add(empA);
		listar_empresas.add(empA1);
		listar_empresas.add(empA2);
		listar_empresas.add(empA3);
		listar_empresas.add(empA4);
		listar_empresas.add(empA5);
	}
	
	public List<EmpresaVO> getListar_empresas() {
		return listar_empresas;
	}
	public void setListar_empresas(List<EmpresaVO> listar_empresas) {
		this.listar_empresas = listar_empresas;
	}
	
	//public void seleccionar(){
	//	System.out.println("TAMOS;");
	//}
	public EmpresaVO getEmpresaSeleccionada() {
		return empresaSeleccionada;
	}
	public void setEmpresaSeleccionada(EmpresaVO empresaSeleccionada) {
		this.empresaSeleccionada = empresaSeleccionada;
	}
	
	 public void onRowSelect(SelectEvent event) {
	        
	        FacesMessage msg2 = new FacesMessage("Empresa Seleccionada", ((EmpresaVO) event.getObject()).getNombre());
	        FacesContext.getCurrentInstance().addMessage(null, msg2);
	    }
	 
	 public void onRowUnselect(UnselectEvent event) {
	        FacesMessage msg2 = new FacesMessage("Empresa Seleccionada", ((EmpresaVO) event.getObject()).getNombre());
	        FacesContext.getCurrentInstance().addMessage(null, msg2);
	    }
	 
    public void mostrarSeleccion(){
    	 FacesMessage msg = new FacesMessage("Empresa", this.empresaSeleccionada.getRut());
         FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public String verDetalle(){
    	return "Libros";
   }
}   
