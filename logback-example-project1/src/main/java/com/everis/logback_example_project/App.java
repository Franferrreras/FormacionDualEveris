package com.everis.logback_example_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FormaciónDual - Ejercicio Logback
 * 
 * @author fferrera
 *
 */
public class App {
   
	/** LOGGER */
	final static Logger LOGGER =  LoggerFactory.getLogger(App.class);
	
	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		
		LOGGER.info("Inicio del método");
		
		//Iteración hasta n.
		for (int i = 0; i < 5000; i++) {
			LOGGER.debug("Iteración número: {}",i);
		}
		
		LOGGER.info("Fin del método");
	}
}
