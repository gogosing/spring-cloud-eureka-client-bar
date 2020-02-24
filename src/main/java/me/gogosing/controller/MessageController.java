package me.gogosing.controller;

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

    @GetMapping("/message")
    public Message getMessage() {
        return new Message("Hello! I'm bar-service");
    }
}
