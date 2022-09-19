package com.website.sportyshoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.sportyshoes.entity.Product;
import com.website.sportyshoes.entity.Purchase;
import com.website.sportyshoes.entity.User;
import com.website.sportyshoes.repository.ProductRepository;
import com.website.sportyshoes.repository.PurchaseRepository;
import com.website.sportyshoes.repository.UserRepository;

@Service
public class PurchaseService {
	
	@Autowired
    private ProductRepository productRepository;
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Autowired
	private UserRepository uRepository;
	
	public boolean buyProduct(int pid,int uid) {
		Product pr = productRepository.findById(pid).get();
		User us = uRepository.findById(uid).get();
		Purchase od = new Purchase();
		od.setProduct(pr);
		od.setUser(us);
		od.getDate();
		od.getOrderNum();
	    purchaseRepository.save(od);
		
		if(od.getProduct().equals(pr) && od.getUser().equals(us)) return true;
		else return false;
		
	}
	
	public String getAllOrders() {
		return purchaseRepository.findAll().toString();
	}


}
