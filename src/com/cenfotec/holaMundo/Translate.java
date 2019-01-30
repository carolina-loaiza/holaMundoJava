package com.cenfotec.holaMundo;

import java.util.Arrays;

public class Translate {
	 private static final String[] LENGUAJES = {
			 "Español",
			 "Inglés",
			 "Francés",
			 "Portugues",
			 "Italiano",
			 "Hawaiano"
	 };
	 
	 private static final String[] TRADUCCION = {
			 "¡Hola Mundo!",
			 "Hello, World!",
			 "Bonjour le monde!",
			 "Olá mundo!",
			 "Ciao, mondo!",
			 "Aloha, World!"
	 };
	 
	 public static String[] getListaLenguajes() {
		 return LENGUAJES;
	 };
	 
	 public static String getTraducion(String lag) {
		 if ( Arrays.asList(LENGUAJES).contains(lag) ) {
			 int index = Arrays.asList(LENGUAJES).indexOf(lag);
			 return TRADUCCION[index];
		 }
		 return "";
	 };
}
