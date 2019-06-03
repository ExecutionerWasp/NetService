package com.ns.service;

import com.ns.model.User;

import java.util.Optional;

/**
 * @author Alvin
 **/

public interface UserService {

    Optional<User> findById(String id);

    User save(User user);
}
