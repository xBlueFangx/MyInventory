package mx.com.myInventory.entity;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*@Entity
@Table(name="VentaProducto")*/
public class VentaProducto {
	/*@EmbeddedId
	private VentaProductoId id;
	
	@ManyToOne(fetch = FetchType.LAZY	)
	private Venta venta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Producto producto;
	
	private int cantidad;
	
	public VentaProducto() {
		
	}

	public VentaProducto(VentaProductoId id, Venta venta, Producto producto, int cantidad) {
		this.id = new VentaProductoId(venta.getIdVenta(), producto.getIdProducto());
		this.venta = venta;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public VentaProductoId getId() {
		return id;
	}

	public void setId(VentaProductoId id) {
		this.id = id;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
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
 
        VentaProducto that = (VentaProducto) o;
        return Objects.equals(venta, that.venta) &&
               Objects.equals(producto, that.producto);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(venta, producto);
    }*/
}
