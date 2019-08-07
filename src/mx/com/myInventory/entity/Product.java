package mx.com.myInventory.entity;

import java.util.ArrayList;
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
@Table(name="Producto")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable=false, updatable=false)
	private int idProducto;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String etiqueta;
	
	@Column(nullable=false)
	private String numero;
	
	@Column(nullable=false)
	private int existencia;
	/*
	@OneToMany(
				mappedBy ="Producto",
				cascade = CascadeType.ALL,
				orphanRemoval = true
			)
	private List<VentaProducto> ventas = new ArrayList<>();
	
	@OneToMany(
				mappedBy ="Producto",
				cascade = CascadeType.ALL,
				orphanRemoval = true
			)
	private List<CompraProducto> compras = new ArrayList<>();	*/
	
	
	public Product() {
		
	}

	public Product(int idProducto, String nombre, String etiqueta, String numero, int existencia) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.etiqueta = etiqueta;
		this.numero = numero;
		this.existencia = existencia;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	/*
	public List<VentaProducto> getVentas() {
		return ventas;
	}

	public void setVentas(List<VentaProducto> ventas) {
		this.ventas = ventas;
	}

	public List<CompraProducto> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraProducto> compras) {
		this.compras = compras;
	}*/

	@Override
    public boolean equals(Object o) {
        if (this == o) 
        	return true;
        
        if (o == null || getClass() != o.getClass())
        	return false;
        
        Product producto = (Product) o;
        return Objects.equals(idProducto, producto.getIdProducto());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(idProducto);
    }
}
