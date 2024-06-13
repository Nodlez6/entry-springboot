package com.sebastian.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebastian.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
/* Agregamos requestmapping como una ruta raiz para los demas endpoints */
public class UserRestController {

  @GetMapping(path = "/detailsRest")
  public Map<String, Object> details() {
    User user = new User("Sebastian", "Gallardo");
    Map<String, Object> response = new HashMap<>();

    response.put("title", "Hola Mundo Spring boot");
    response.put("user", user);

    return response;
  }

}
