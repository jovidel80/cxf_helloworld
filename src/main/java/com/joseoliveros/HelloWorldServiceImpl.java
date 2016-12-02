package com.joseoliveros;

import javax.jws.WebService;

@WebService(endpointInterface = "com.joseoliveros.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    public void sayHello() {
        System.out.println("Hola Mundo");
    }
}
