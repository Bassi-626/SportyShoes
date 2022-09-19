package com.website.sportyshoes.repository;

import org.springframework.data.repository.CrudRepository;

import com.website.sportyshoes.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
