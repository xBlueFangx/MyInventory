package mx.com.myInventory.dao;

import java.util.List;

import mx.com.myInventory.entity.Product;

public interface ProductDAO {
	public void createProduct(Product p);
	public Product readProduct(int id);
	public void updateProduct(Product p);
	public void deleteProduct(int id);
	public List<Product> listProducts();
}
