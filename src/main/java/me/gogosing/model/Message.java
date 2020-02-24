package me.gogosing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by JinBum Jeong on 2020/02/24.
 */
public class Message {

    public Message() {}

    public Message(String message) {
        this.message = message;
    }

    @JsonProperty(value = "message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
