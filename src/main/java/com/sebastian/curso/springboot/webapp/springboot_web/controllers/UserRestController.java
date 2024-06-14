package com.sebastian.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebastian.curso.springboot.webapp.springboot_web.models.User;
import com.sebastian.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
/* Agregamos requestmapping como una ruta raiz para los demas endpoints */
public class UserRestController {
  @GetMapping(path = "/detailsRest")
  public UserDto details() {
    UserDto userDto = new UserDto();
    User user = new User("Sebastian", "Gallardo");
    userDto.setUser(user);
    userDto.setTitle("Hola Mundo Spring boot");

    return userDto;
  }

  @GetMapping(path = "/list")
  public List<User> list() {

    User user = new User("Sebastian", "Gallardo");
    User user1 = new User("Maria", "Jose");

    // List<User> users = new ArrayList<>();
    // users.add(user);
    // users.add(user1);
    List<User> users = Arrays.asList(user, user1);

    return users;
  }

  // @GetMapping(path = "/detailsRest")
  // public Map<String, Object> details() {
  // User user = new User("Sebastian", "Gallardo");
  // Map<String, Object> response = new HashMap<>();

  // response.put("title", "Hola Mundo Spring boot");
  // response.put("user", user);

  // return response;
  // }

}
