package mx.com.myInventory.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.com.myInventory.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void createProduct(Product p) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(p);
	}
	
	@Override
	public Product readProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (Product) session.get(Product.class, new Integer(id));//Load no funcion�
		
	}
	
	@Override
	public void updateProduct(Product p) {
		Session session = sessionFactory.getCurrentSession();
		session.update(p);
	}

	@Override
	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product p = (Product)session.get(Product.class, new Integer(id));//Load no funcion�
		if(p!=null)
			session.delete(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listProducts() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Product>)session.createQuery("from Product").list();
	}
	
}
