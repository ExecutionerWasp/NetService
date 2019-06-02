package com.ns.service;

import com.ns.model.Message;

import java.util.List;

/**
 * @author Alvin
 **/

public interface MessageService {

    Message save(Message message);

    void delete(Message message);

    void deleteById(long id);

    default void deleteById(String id){
        this.deleteById(Long.valueOf(id));
    }

    Message findById(long id);

    List<Message> findAll();

    default Message findById(String id) {
        return this.findById(Long.valueOf(id));
    }
}
