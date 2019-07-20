package mx.com.myInventory.entity;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CompraProducto")
public class CompraProducto {
	@EmbeddedId
	private CompraProductoId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Compra compra;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Producto producto;
	
	private int cantidad;
	
	public CompraProducto() {
		
	}

	public CompraProducto(CompraProductoId id, Compra compra, Producto producto, int cantidad) {
		this.id = new CompraProductoId(compra.getIdCompra(), producto.getIdProducto());
		this.compra = compra;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public CompraProductoId getId() {
		return id;
	}

	public void setId(CompraProductoId id) {
		this.id = id;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        CompraProducto that = (CompraProducto) o;
        return Objects.equals(compra, that.compra) &&
               Objects.equals(producto, that.producto);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(compra, producto);
    }
}
