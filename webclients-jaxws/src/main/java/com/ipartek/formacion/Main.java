package com.ipartek.formacion;

import com.ipartek.peliculas.PeliculaMensaje;
import com.ipartek.peliculas.PeliculaServiceWSImp;
import com.ipartek.peliculas.Peliculaservice;

public class Main {

	public static void main(String[] args){
		
	
		
		Peliculaservice cliente = new Peliculaservice();
		PeliculaServiceWSImp clientesoap = cliente.getPeliculaServiceWSImpPort();
		//engancharemos los datos de validacion
		
		PeliculaMensaje respuesta = clientesoap.obtenerpoid(1);
	}
}
