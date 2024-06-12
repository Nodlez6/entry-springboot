package com.sebastian.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

  @GetMapping("/detailsRest")
  public Map<String, Object> details() {
    Map<String, Object> response = new HashMap<>();

    response.put("title", "Hola Mundo Spring boot");
    response.put("first_name", "Sebastian");
    response.put("last_name", "Gallardo");

    return response;
  }

}
