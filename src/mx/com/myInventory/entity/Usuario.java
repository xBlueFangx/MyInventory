	package mx.com.myInventory.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable=false, updatable=false)
	private int idUsuario;
	private String nombre;
	private String correo;
	private String password;
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String correo, String password) {
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) 
        	return true;
        
        if (o == null || getClass() != o.getClass()) 
        	return false;
        
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(correo, password);
    }
}
