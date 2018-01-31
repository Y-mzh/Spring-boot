package com.example.demo.SpringBootDemoText;

import com.example.demo.SpringBootDemo.SpringBootDemoController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootDemo {
    SpringBootDemoController spd = new SpringBootDemoController();

    @Test
    public  void testSpringboot(){
        Assert.assertEquals("hello springboot",spd.springbootdemo());
    }
}
