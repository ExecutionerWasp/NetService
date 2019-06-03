package com.ns.controller;

import com.ns.model.User;
import com.ns.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alvin
 **/
@Controller
@RequestMapping("/")
public class MainController {

    @Value("${spring.profiles.active}")
    private String profile;

    private final MessageService messageService;

    @Autowired
    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String main(Model model, @AuthenticationPrincipal User user){
        Map<Object, Object> data = new HashMap<>();
        data.put("profile", user);
        data.put("messages", messageService.findAll());

        model.addAttribute("frontData", data);
        model.addAttribute("isDevMode", "dev".equals(profile));
        return "index";
    }
}
