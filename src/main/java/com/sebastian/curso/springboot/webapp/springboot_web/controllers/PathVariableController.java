package com.sebastian.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebastian.curso.springboot.webapp.springboot_web.models.User;
import com.sebastian.curso.springboot.webapp.springboot_web.models.dto.ParamDto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

  @GetMapping("/baz/{message}")
  public ParamDto baz(@PathVariable() String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;
  }

  @GetMapping("/mix/{message}/{id}")
  public Map<String, Object> mixPathVar(@PathVariable() String message, @PathVariable Long id) {
    Map<String, Object> json = new HashMap<>();
    json.put("message", message);
    json.put("id", id);

    return json;
  }

  @PostMapping("/create")
  public User create(@RequestBody User user) {
    // Hacer algo con el usuario

    return user;
  }

}
