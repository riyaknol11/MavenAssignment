package com.example;

import com.example.Service.ServiceWebApp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WebApp.class})
public class UnitTestWebApp {

    @Autowired
    private ServiceWebApp serviceWebApp;

    @Test
    public void testGetMessage_shouldReturnExpectedString(){
        String message= serviceWebApp.getMessage();
        System.out.println(message);
        Assert.assertEquals("Hello, World!",message);
    }
}
