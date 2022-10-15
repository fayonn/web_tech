package com.labs.web_tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

    @GetMapping("/item")
    public Item getItem(){
        return new Item("Sviatoslav", "Kytsara", 20, 414);
    }

    @GetMapping("/items")
    public List<Item> getItems(){
        return List.of(
                new Item("Sviatoslav", "Kytsara", 20, 414),
                new Item("Yaroslav", "Rohan", 20, 413),
                new Item("Rostyslav", "Lukaviy", 20, 414),
                new Item("Maryian", "Lukaviy", 20, 414)
        );
    }

    @GetMapping("/message")
    public String getMessage(){
        return "Hello, World!";
    }
}
