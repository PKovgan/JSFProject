package com.p.k.jsfproject;

import java.io.Serializable;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("HelloWorld")
@RequestScoped
public class HelloBean implements Serializable{
    private static final long serialVersionUID = -3627809718191487243L;
    private String message = "Hello World!";

    public String getMessage() {
        System.out.println(message);
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
