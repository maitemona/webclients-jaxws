package com.ipartek.formacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.peliculas.Pelicula;
import com.ipartek.peliculas.PeliculaMensaje;
import com.ipartek.peliculas.PeliculasServiceWSImp;
import com.ipartek.peliculas.Peliculasservice;

public class Main {

	public static void main(String[] args){
		
		//engancharemos los datos de validacion
		//tiene que ser un mapa de strin con object 
		//recogo los encabezados del servidor antes de procesar la respuesta(cliente-servido)
		
		Peliculasservice cliente = new Peliculasservice();
		PeliculasServiceWSImp clientesoap = cliente.getPeliculasServiceWSImpPort();
		
		
		
		//capturo el contexto de la peticion
		Map<String , Object> requestContext = ((BindingProvider)clientesoap).getRequestContext();
		
		//todo dato encapsulado deberia ir dentro de una colleccion de objetos
		//me genero la estructura necesaria para enviar los datos
	
		Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();
		requestHeaders.put("sessionId", Collections.singletonList("ipssesion"));
		
		//introduzco los datos en el encabezado de la peticion
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestContext);
		PeliculaMensaje respuesta = clientesoap.obtenerporid(1);
		if(respuesta.getPelicula()==null){
			System.out.println("Datos:" + respuesta.getMensaje());
		}
		else{
			Pelicula pelicula = respuesta.getPelicula();
			System.out.println(pelicula.getTitulo());
		}
	}
}
