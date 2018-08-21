package com.yizhou.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

// @AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Message {
    private String name;
    private String text;

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
