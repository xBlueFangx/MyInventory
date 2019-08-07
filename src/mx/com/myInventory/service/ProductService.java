package mx.com.myInventory.service;

import java.util.List;

import mx.com.myInventory.entity.Product;

public interface ProductService {
	public void create(Product product);
	public Object read(int id);
	public void update(Product product);
	public void delete(int id);
	public List<Product> list();
}
