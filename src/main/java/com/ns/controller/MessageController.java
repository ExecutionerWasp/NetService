package com.ns.controller;

import com.ns.model.Message;
import com.ns.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alvin
 **/
@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/list")
    public List<Message> findAll(){
        return messageService.findAll();
    }

    @GetMapping("{id}")
    public Message findById(@PathVariable String id){
        return messageService.findById(id);
    }

    @PostMapping
    public Message create(@RequestBody Message message){
        return messageService.save(message);
    }

    @PutMapping("{id}")
    public Message update(@PathVariable String id, @RequestBody Message message){
        Message messageFromDb = messageService.findById(id);

        messageFromDb.setText(message.getText());
        messageService.save(messageFromDb);
        return messageFromDb;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        messageService.deleteById(id);
    }

    @PostMapping("/clear")
    public void clear(){
        messageService.findAll().forEach(messageService::delete);
    }
}
