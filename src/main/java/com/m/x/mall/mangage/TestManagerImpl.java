package com.m.x.mall.mangage;

import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2021/10/3 0003
 * @remark
 */
@Service
public class TestManagerImpl implements TestManager{
  @Override
  public String test1(String test) {
    return test;
  }
}