package com.joseoliveros;

import com.joseoliveros.beans.Mensaje;
import org.apache.cxf.jaxrs.ext.MessageContext;

import javax.ws.rs.core.Context;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Context
    MessageContext jaxrsContex;

    public Mensaje sayHello(String nombre) {

        Mensaje mensaje;

        if (jaxrsContex.getUriInfo() == null) {
            mensaje = new Mensaje();
            mensaje.setMensaje("Hola " + nombre + " desde JAXWS");
            return mensaje;
        } else {
            mensaje = new Mensaje();
            mensaje.setMensaje("Hola " + nombre + " desde JAXRS");
            return mensaje;
        }
    }

}