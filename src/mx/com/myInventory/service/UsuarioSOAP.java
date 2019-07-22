package mx.com.myInventory.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import mx.com.myInventory.dao.UsuarioDAO;
import mx.com.myInventory.entity.Usuario;

@WebService
public class UsuarioSOAP {
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	@WebMethod
	public void create(@WebParam(name="nombre") String nombre,
					   @WebParam(name="correo") String correo,
					   @WebParam(name="password") String password) {
		
		usuarioDAO.inicializar();
		usuarioDAO.crearUsuario(nombre, correo, password);
		usuarioDAO.destruir();
	}
	
	@WebMethod
	public Usuario read(@WebParam(name="idUsuario") int idUsuario) {
		usuarioDAO.inicializar();
		Usuario usuario = usuarioDAO.leerUsuario(idUsuario);
		usuarioDAO.destruir();
		return usuario;
	}
	
	@WebMethod
	public void update(@WebParam(name="idUsuario") int idUsuario, 
					   @WebParam(name="nombre") String nombre, 
					   @WebParam(name="correo") String correo,
					   @WebParam(name="password") String password) {
		
		usuarioDAO.inicializar();
		usuarioDAO.actualizarUsuario(idUsuario, nombre, correo, password);
		usuarioDAO.destruir();
	}
	
	@WebMethod
	public void delete(@WebParam(name="idUsuario") int idUsuario) {
		usuarioDAO.inicializar();
		usuarioDAO.eliminarUsuario(idUsuario);
		usuarioDAO.destruir();
	}
}
