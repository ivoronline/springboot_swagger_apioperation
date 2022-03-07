package com.ivoronline.springboot_swagger_apioperation.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {

  //=========================================================================
  // HELLO
  //=========================================================================
  @ApiOperation(
    value  = "This Endpoint says Hello",
    notes  = "It returns following string: Hello from Endpoint",
    hidden = false
  )
  @GetMapping("Hello")
    String hello() {
    return "Hello from Endpoint";
  }

  //=========================================================================
  // HIDDEN
  //=========================================================================
  @ApiOperation(value = "Some description", hidden = true)
  @GetMapping("Hidden")
    String hidden() {
    return "Hello from hidden Endpoint";
  }

}
