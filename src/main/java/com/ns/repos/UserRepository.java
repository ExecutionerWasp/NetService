package com.ns.repos;

import com.ns.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alvin
 **/
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
