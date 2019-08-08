package mx.com.myInventory.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="idProducto", nullable=false, updatable=false)
	private int id;
	
	@Column(name="nombre", nullable=false)
	private String name;
	
	@Column(name="etiqueta", nullable=false)
	private String tag;
	
	@Column(name="numero", nullable=false)
	private String number;
	
	@Column(name="existencia", nullable=false)
	private int amount;
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

	public Product(int id, String name, String tag, String number, int amount) {
		this.id = id;
		this.name = name;
		this.tag = tag;
		this.number = number;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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
        
        Product product = (Product) o;
        return Objects.equals(id, product.getId());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
