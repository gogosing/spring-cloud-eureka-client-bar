package me.gogosing.controller;

import me.gogosing.config.ApplicationConfiguration;
import me.gogosing.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JinBum Jeong on 2020/02/24.
 */
@RestController
@RequestMapping("/v1")
public class MessageController {

    private final ApplicationConfiguration applicationConfiguration;

    public MessageController(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    @GetMapping("/message")
    public Message getMessage() {
        return new Message("Hello! I'm bar-service: " + applicationConfiguration.getMessage());
    }
}
