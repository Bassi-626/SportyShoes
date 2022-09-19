package com.website.sportyshoes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private int productId;
	
	@Column(name = "MRP")
	private double mrp;
	
	@Column(name = "PRODUCT_NAME ")
	private String pname;
	
	@Column(name = "VENDOR_INFO")
	private String vendorInfo;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", mrp=" + mrp + ", pname=" + pname + ", vendorInfo=" + vendorInfo
				+ "]";
	}
	
}
