package com.juvenxu.mvnbook.helloworld;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangqi on 16/8/30.
 */
public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        Assert.assertEquals("Hello Maven",result);
    }
}
