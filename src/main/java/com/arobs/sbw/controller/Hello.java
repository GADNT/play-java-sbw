package com.arobs.sbw.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sbw
 *
 * @author gabriel.deaconu
 * @since August Patch 2020
 */

@Controller
@RestController
public class Hello {

  @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public String get(){
    return "{\"title\": \"Holla Arobs\"}";
  }
}
