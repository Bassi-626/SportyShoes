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
@Table(name = "Admin")
public class Admin {

	@Column(name="NAME")
	private String adminName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ADMIN_ID")
	private int adminId;
	
	@Column(name="PASSWORD")
	private String adminPwd;

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminId=" + adminId + ", adminPwd=" + adminPwd + "]";
	}
	
	
}
