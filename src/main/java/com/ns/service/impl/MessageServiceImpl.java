package com.ns.service.impl;

import com.ns.exception.NotFoundException;
import com.ns.model.Message;
import com.ns.repos.MessageRepository;
import com.ns.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alvin
 **/
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void delete(Message message) {
        messageRepository.delete(message);
    }

    @Override
    public void deleteById(long id) {
        messageRepository.deleteById(id);
    }

    @Override
    public Message findById(long id) {
        Message message = messageRepository.findById(id);
        if (message == null) {
            throw new NotFoundException();
        }
        return message;
    }

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }
}
