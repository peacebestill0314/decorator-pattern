package com.bang.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MookController {

  @RequestMapping("mookBbang")
  public String userbang() {

    return "남편 창묵";
  }
}

