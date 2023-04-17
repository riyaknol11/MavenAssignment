package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WebApp.class)
public class IntegrationTestWebApp {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testWebAppEndpoint_ReturnsHelloWorld_Successfully(){
        String url = "http://localhost:" + port + "/webapp";
        String response= testRestTemplate.getForObject(url, String.class);
        Assert.assertEquals("Hello, World!", response);

    }

}
