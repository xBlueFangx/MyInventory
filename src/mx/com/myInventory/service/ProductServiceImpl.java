package mx.com.myInventory.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.myInventory.dao.ProductDAO;
import mx.com.myInventory.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	ProductDAO productDAO;
	
	@Autowired
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	@Transactional
	public void create(Product product) {
		productDAO.createProduct(product);
	}

	@Override
	@Transactional
	public Object read(int id) {
		return productDAO.readProduct(id);
	}

	@Override
	@Transactional
	public void update(Product product) {
		productDAO.updateProduct(product);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productDAO.deleteProduct(id);
	}

	@Override
	@Transactional
	public List<Product> list() {
		return productDAO.listProducts();
	}

}
