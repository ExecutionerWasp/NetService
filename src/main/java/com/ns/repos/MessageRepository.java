package com.ns.repos;

import com.ns.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alvin
 **/
@Repository
public interface MessageRepository extends MongoRepository<Message, Long> {

    Message findById(long id);

    void deleteById(long id);
}
