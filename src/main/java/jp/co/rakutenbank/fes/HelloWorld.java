package jp.co.rakutenbank.fes;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * A simple REST service which is able to say hello to someone using HelloService Please take a look at the web.xml where JAX-RS
 * is enabled
 *
 * @author gbrey@redhat.com
 *
 */

@Path("/")
public class HelloWorld {


    @GET
    @Path("/ping")
    public String getHelloWorldJSON() {
        return "Hello World";
    }
}



