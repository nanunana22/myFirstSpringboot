package org.example.myfirstspringboot;

import org.springframework.web.bind.annotation.*;

//Schritt 3: Verwenden Sie Pfadvariablen, um den Namen in der Nachricht anzupassen.
//Beispiel: „/api/hello/John“ gibt „Hallo, John!“ zurück.

//Schritt 1: Erstellen Sie eine neue Klasse „Message“ mit den Feldern „name“, „message“ und „id“
// vom Typ String.
//
//Schritt 2: Der Controller sollte nun eine Liste von Message-Objekten haben.
//
//Schritt 3: Implementieren Sie eine zusätzliche Controller-Methode, die eine POST-Anfrage an
// '/api/messages' verarbeitet. Diese Methode sollte eine id, einen Namen und eine Nachricht
// im Request Body akzeptieren und in der Liste speichern.
//Schritt 4: Implementieren Sie eine zusätzliche Controller-Methode, die eine GET-Anforderung an
// „/api/messages“ verarbeitet. Diese Methode sollte die Liste der Nachrichten zurückgeben.

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public String helloWorld(@PathVariable String name){
        return name;
    }
    @PostMapping
    public String text(@RequestBody String requestBody){
        System.out.println(requestBody);
        return requestBody;
    }
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable String id){
//
//    }

}
