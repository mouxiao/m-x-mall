package com.m.x.mall.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2021/4/14 0014
 * @remark
 */
@RestController
@Slf4j
public class IndexController {

  @Value("${test.name}")
  private String test;

  @GetMapping(path = {"index", "hello"})
  public String index(){
    log.info("请求进来了");
    return test;
  }

  @GetMapping(value = "actuator/health")
  public String health(){
    return "ok";
  }

}