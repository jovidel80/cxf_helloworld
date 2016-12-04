package com.joseoliveros;

import com.joseoliveros.beans.Mensaje;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_XML)
@WebService
public interface HelloWorldService {

    @Path("{nombre}")
    @GET
    Mensaje sayHello(@WebParam(name = "nombre") @PathParam("nombre") String nombre);
}
