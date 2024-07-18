package org.example.myfirstspringboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")


public class MessageControler {
    List<Message> messages = new ArrayList<>();

    @PostMapping
    public String sendMessage(@RequestBody Message message) {
        messages.add(message);
        return "Nachricht erfolgreich versendet";
    }

    @GetMapping
    public List<Message> getMessages() {
        return messages;
    }


}

