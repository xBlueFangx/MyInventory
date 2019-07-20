package mx.com.myInventory.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Compra")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable=false, updatable=false)
	private int idCompra;
	
	private Date fecha;
	private String proveedor;
	
	@OneToMany(
				mappedBy="Compra",
				cascade = CascadeType.ALL,
				orphanRemoval=true
			)
	private List<CompraProducto> productos = new ArrayList<>();
	
	public Compra() {
		
	}

	public Compra(int idCompra, Date fecha, String proveedor) {
		this.idCompra = idCompra;
		this.fecha = fecha;
		this.proveedor = proveedor;
	}


	public int getIdCompra() {
		return idCompra;
	}


	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) 
        	return true;
        
        if (o == null || getClass() != o.getClass()) 
        	return false;
        
        Compra compra = (Compra) o;
        return Objects.equals(idCompra, compra.getIdCompra());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(idCompra, fecha, proveedor);
    }
}
