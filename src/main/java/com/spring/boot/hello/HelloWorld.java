/**
 * Copyright 2016 Expedia, Inc. All rights reserved. EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.boot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aditya Gupta
 */
@Component
public class HelloWorld {
    @Autowired
    private static String hello;

    public static void print(){
        //hello.concat("Yeppiiii");
        System.out.println(
                "hello");

        System.out.println("Hello World");
    }
}
