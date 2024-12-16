package com.igr.postgre.repo;

import org.springframework.data.repository.CrudRepository;

import com.igr.postgre.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
