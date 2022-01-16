package com.m.x.mall;

import com.m.x.mall.mangage.TestManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootTest
class MXMallApplicationTests {

  @Test
  void contextLoads() {

  }

  public static void main(String[] args) {
//    ClassPathXmlApplicationContext
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestManager.class);
//    applicationContext.setAllowBeanDefinitionOverriding(true);
    TestManager testManager = applicationContext.getBean(TestManager.class);


  }

}
