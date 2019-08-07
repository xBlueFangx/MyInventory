package mx.com.myInventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import mx.com.myInventory.service.ProductService;

@Controller
public class ProductsController {

	//Interfaz del servicio
	ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping("products")
	public String productsList(Model model) {
		model.addAttribute("producto", productService.read(61));
		return "products"; 
	}

}
