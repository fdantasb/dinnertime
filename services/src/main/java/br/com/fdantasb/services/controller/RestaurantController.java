package br.com.fdantasb.services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/restaurants")
public class RestaurantController {

    @RequestMapping
    public ResponseEntity<String> restaurants(){
        return ResponseEntity.ok("Hello World!");
    }
}
