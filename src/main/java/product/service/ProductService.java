package product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.entity.ProductEntity;
import product.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public ProductEntity viewProductDetail(String productCode) {
		return this.productRepo.findByProductCode(productCode);
	}
}
