package com.sebastian.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebastian.curso.springboot.webapp.springboot_web.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola", name = "otro") String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;
  }

  @GetMapping("/bar")
  public ParamDto bar(@RequestParam String text, @RequestParam Integer code) {
    ParamDto params = new ParamDto();
    params.setMessage(text);
    params.setCode(code);
    return params;
  }

}
