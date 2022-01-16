package com.m.x.mall.mangage;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Administrator
 * @date 2021/4/16 0016
 * @remark
 */
@FeignClient(name = "mall", path = "mall")
public interface TestManager {

  String test1(String test);

  default String test(){
    return "success";
  }

}