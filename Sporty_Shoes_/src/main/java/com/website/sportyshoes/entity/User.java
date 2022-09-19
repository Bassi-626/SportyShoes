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
@Table(name = "User")
public class User {

	@Column(name = "NAME")
	private String uname;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "PASSWORD")
	private String userpwd;

	@Override
	public String toString() {
		return "User [uname=" + uname + ", userId=" + userId + ", userpwd=" + userpwd + "]";
	}
	
	
}
