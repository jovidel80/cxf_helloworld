package com.joseoliveros;

import com.joseoliveros.beans.Mensaje;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@WebService
public interface HelloWorldService {

    @Path("{nombre}")
    @GET
    Mensaje sayHello(@WebParam(name = "nombre") @XmlElement(required = true) @PathParam("nombre") String nombre);
}
