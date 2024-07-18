package org.example.myfirstspringboot;

import lombok.Data;

@Data
public class Message {
    String name;
    String message;
    String id;

    public Message(String name, String message, String id) {
        this.name = name;
        this.message = message;
        this.id = id;
    }

}

