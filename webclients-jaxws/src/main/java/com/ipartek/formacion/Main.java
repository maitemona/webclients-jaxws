package com.ipartek.formacion;

import java.net.MalformedURLException;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import com.ipartek.peliculas.Pelicula;
import com.ipartek.peliculas.PeliculaColeccion;
import com.ipartek.peliculas.PeliculaMensaje;
import com.ipartek.peliculas.PeliculasServiceWSImp;
import com.ipartek.peliculas.Peliculasservice;


public class Main {
    
    public static void main(String[] args) throws MalformedURLException {
    
        Peliculasservice cliente = new Peliculasservice();
        PeliculasServiceWSImp clientesoap = cliente.getPeliculasServiceWSImpPort();
        // Enganchamos los datos de la validacion.

        // Capturo el contexto de la peticion
        Map<String, Object> requestContext = ((BindingProvider) clientesoap).getRequestContext();

        // Me genero la estructura necesaria para enviar datos
        Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();

        // Introduzco los datos en el encabezado de la peticion
        requestHeaders.put("sessionId", Collections.singletonList("ipsession"));
        requestHeaders.put("usuario", Collections.singletonList("maite"));
        requestHeaders.put("password", Collections.singletonList("locodia"));
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
        
        //
        PeliculaMensaje respuesta = clientesoap.obtenerporid(2);
        if (respuesta.getPelicula() == null) {
            System.out.println(respuesta.getMensaje());
        } else {
            Pelicula pelicula = respuesta.getPelicula();
            System.out.println(pelicula.getTitulo());
        }
        
        PeliculaColeccion respuestalista = clientesoap.obtenerall();
        if (respuestalista.getPelicula() == null) {
            System.out.println("No hay peliculas");
        } else {
        	 System.out.println("hay peliculas"+respuestalista);
        }
        
       
    }

}
