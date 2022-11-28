package com.example;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;


@RequestScoped
public class AbstractAPI {

    public static void test() {
        System.out.println("this is base class");
    }
}
