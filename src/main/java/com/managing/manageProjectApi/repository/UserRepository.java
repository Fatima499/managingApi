package com.managing.manageProjectApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.managing.manageProjectApi.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
