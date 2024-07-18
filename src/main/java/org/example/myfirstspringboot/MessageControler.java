package org.example.myfirstspringboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")


public class MessageControler {
    List<Message> messages = new ArrayList<>();

    @PostMapping
    public String sendMessage(@RequestBody Message message) {
        messages.add(message);
        System.out.println(messages);
        return "Nachricht erfolgreich versendet";
    }


}

