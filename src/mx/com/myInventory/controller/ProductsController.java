package mx.com.myInventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.com.myInventory.entity.Product;
import mx.com.myInventory.service.ProductService;

@Controller
public class ProductsController {

	ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping("/products")
	public String productsList(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("products", productService.list());
		return "products";
	}
	
	@RequestMapping(value="products/add", method=RequestMethod.POST)
	public String createProduct(@ModelAttribute("id") int id,//Mejor ModelAttribute que RequestAttribute (Investigar diferencias)
								@ModelAttribute("name") String name,
								@ModelAttribute("tag") String tag,
								@ModelAttribute("number") String number,
								@ModelAttribute("amount") int amount) {
		Product product = new Product(id, name, tag, number, amount);
		if (product.getId()==0) {
			if(name!="" && tag!="" && number!="" && amount!=0)
				productService.create(product);
		} else {
			if(name!="" && tag!="" && number!="" && amount!=0)
				productService.update(product);
		}
		return "redirect:products";
	}
	
	@RequestMapping(value="products/delete/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		productService.delete(id);
		return "redirect:products";
	}
	
	@RequestMapping(value="products/edit/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {
		model.addAttribute("product", productService.read(id));
		model.addAttribute("products", productService.list());
		return "products";
	}
}
