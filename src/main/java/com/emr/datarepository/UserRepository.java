package com.emr.datarepository;

import org.springframework.data.repository.CrudRepository;

import com.emr.security.model.User;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
