package cl.eugcom.libros.viewcontroller;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseStream;
import javax.faces.context.ResponseWriter;
import javax.faces.render.RenderKit;
@ManagedBean
public class UsuarioViewController {
	private String usuario;
	private String clave;
	
	public UsuarioViewController(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	public UsuarioViewController() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	public String ChequearUsuarios()
	{
		String mensaje =null;
		if(usuario != null && usuario.equals("Jorge") && clave != null && clave.equals("123"))
		{
			return mensaje="Index";
			
		}
		else
		{
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, Ingrese Usuario y Password Correcto",  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	        
		}
		return mensaje;
	}
	public void Limpiar()
	{
		this.usuario.equals("");
		this.clave.equals("");
	}
}
