package mx.com.myInventory.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import mx.com.myInventory.entity.Usuario;

@Repository
public class UsuarioDAO {
	private SessionFactory sessionFactory;
	
	{inicializar();}
	
	public void inicializar() {//init
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		try {
			//sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch(Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("Error al iniciar el session factory: "+e.toString());
		}
	}
	
	public void destruir() {//destroy
		sessionFactory.close();
	}
	
	public void crearUsuario(String nombre, String correo, String password) {
		Usuario usuario = new Usuario(nombre, correo, password);
		databaseOperation("crear", usuario);
	}
	
	public void actualizarUsuario(int idUsuario, String nombre, String correo, String password) {
		Usuario usuario = new Usuario(nombre, correo, password);
		usuario.setIdUsuario(idUsuario);
		databaseOperation("actualizar", usuario);
	}
	
	public void eliminarUsuario(int idUsuario) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(idUsuario);
		databaseOperation("eliminar", usuario);
	}
	
	public Usuario leerUsuario(int idUsuario) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Usuario usuario = (Usuario) session.get(Usuario.class, idUsuario);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}
	
	
	public void databaseOperation(String flag, Usuario usuario) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		switch(flag){
		case "crear":
			session.save(usuario);
			break;
		case "actualizar":
			session.update(usuario);
			break;
		case "eliminar":
			session.delete(usuario);
			break;
		}
		session.getTransaction().commit();
		session.close();
	}
	
}
