package com.website.sportyshoes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.sportyshoes.entity.Product;
import com.website.sportyshoes.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
    private ProductRepository productRepository;
	

	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}
	
	public List<Product> findProductByName(String productName) {
		List<Product> list = (List<Product>) productRepository.findAll();
		List<Product> listByName = new ArrayList<Product>();
		for (Product p : list) {
			if(p.getPname().toLowerCase().contains(productName.toLowerCase())) {
				listByName.add(p);
			}
		}
		return listByName;
	}
	
	public List<Product> findProductByVendor(String VendorName) {
		List<Product> list = (List<Product>) productRepository.findAll();
		List<Product> listByVendor = new ArrayList<Product>();
		for (Product p : list) {
			if(p.getVendorInfo().toLowerCase().contains(VendorName.toLowerCase())) {
				listByVendor.add(p);
			}
		}
		return listByVendor;
	}
	
	public Product findProductById(int productId) {
		return productRepository.findById(productId).get();
	}

	public void deleteProduct(int pId) {
		productRepository.deleteById(pId);
	}

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public boolean changePname(int id, String updatedName) {
		Product pr = productRepository.findById(id).get();
		pr.setPname(updatedName);
		productRepository.save(pr);
		
		if(productRepository.findById(id).get().getPname().equals(updatedName)) {
			return true;
		}else return false;
	}

	public boolean changeMRP(int id, double updatedMRP) {
		Product pr = productRepository.findById(id).get();
		pr.setMrp(updatedMRP);
		productRepository.save(pr);
		
		if(productRepository.findById(id).get().getMrp()== updatedMRP) {
			return true;
		}else return false;
	}

	public boolean changeVendorInfo(int id, String newVendor) {
		Product pr = productRepository.findById(id).get();
		pr.setVendorInfo(newVendor);
		productRepository.save(pr);
		
		if(productRepository.findById(id).get().getVendorInfo().equals(newVendor)) {
			return true;
		}else return false;
		
	}

	
}
