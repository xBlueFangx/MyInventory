package mx.com.myInventory.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class VentaProductoId implements Serializable{
	/*@Column(name="Venta_idVenta")
	private int idVenta;
	@Column(name="Producto_idProducto")
	private int idProducto;
	
	public VentaProductoId() {
		
	}

	public VentaProductoId(int venta_idVenta, int producto_idProducto) {
		super();
		this.idVenta = venta_idVenta;
		this.idProducto = producto_idProducto;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	 public boolean equals(Object o) {
		 if (this == o)
			 return true;
	 
		 if (o == null || getClass() != o.getClass())
			 return false;
	 
		 VentaProductoId that = (VentaProductoId) o;
		 return Objects.equals(idVenta, that.idVenta) &&
				 Objects.equals(idProducto, that.idProducto);
	}
	
	@Override
	public int hashCode() {
       return Objects.hash(idVenta, idProducto);
   }*/
}
