package com.website.sportyshoes.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "Purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_NUMBER")
	private int orderNum;
	

	@Column(name="DATE", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@UpdateTimestamp
	private Timestamp date;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BY_USER", referencedColumnName = "USER_ID")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    private Product product;

	@Override
	public String toString() {
		return "Purchase [orderNum=" + orderNum + ", date=" + date + ", user=" + user + ", product=" + product + "]";
	}
    
    
}
