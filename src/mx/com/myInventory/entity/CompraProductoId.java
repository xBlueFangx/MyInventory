package mx.com.myInventory.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompraProductoId implements Serializable{
	@Column(name="Compra_idCompra")
	private int idCompra;
	@Column(name="Producto_idProducto")
	private int idProducto;
	
	public CompraProductoId() {
		
	}

	public CompraProductoId(int idCompra, int idProducto) {
		this.idCompra = idCompra;
		this.idProducto = idProducto;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
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
	 
		 CompraProductoId that = (CompraProductoId) o;
		 return Objects.equals(idCompra, that.idCompra) &&
				 Objects.equals(idProducto, that.idProducto);
	}
	
	@Override
	public int hashCode() {
      return Objects.hash(idCompra, idProducto);
  }
}
