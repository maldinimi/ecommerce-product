package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import product.entity.ProductEntity;
import product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/viewProductDetail")
	public String viewProductDetail(@RequestBody ProductEntity request) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(this.productService.viewProductDetail(request.getProductCode()));
	}
}
