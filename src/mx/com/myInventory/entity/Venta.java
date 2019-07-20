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
@Table(name="Venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(updatable=false, nullable=false)
	private int idVenta;
	
	@Column(nullable=false)
	private Date fecha;
	
	@Column(nullable=false)
	private String nombreCliente;
	private String apellidoPaternoCliente;
	private String apellidoMaternoCliente;
	
	@OneToMany(
				mappedBy = "Venta",
				cascade = CascadeType.ALL,
				orphanRemoval=true
			)
	private List<VentaProducto> productos = new ArrayList<>();
	
	public Venta() {
		
	}


	public Venta(int idVenta, Date fecha, String nombreCliente, String apellidoPaternoCliente,
			String apellidoMaternoCliente) {
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.apellidoPaternoCliente = apellidoPaternoCliente;
		this.apellidoMaternoCliente = apellidoMaternoCliente;
	}


	public int getIdVenta() {
		return idVenta;
	}


	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getApellidoPaternoCliente() {
		return apellidoPaternoCliente;
	}


	public void setApellidoPaternoCliente(String apellidoPaternoCliente) {
		this.apellidoPaternoCliente = apellidoPaternoCliente;
	}


	public String getApellidoMaternoCliente() {
		return apellidoMaternoCliente;
	}


	public void setApellidoMaternoCliente(String apellidoMaternoCliente) {
		this.apellidoMaternoCliente = apellidoMaternoCliente;
	}
	
	public List<VentaProducto> getProductos() {
		return productos;
	}


	public void setProductos(List<VentaProducto> productos) {
		this.productos = productos;
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) 
        	return true;
        
        if (o == null || getClass() != o.getClass()) 
        	return false;
        
        Venta venta = (Venta) o;
        return Objects.equals(idVenta, venta.getIdVenta());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(idVenta, fecha, nombreCliente);
    }
}
