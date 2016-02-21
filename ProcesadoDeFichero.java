package com.ejemplo.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ProcesadoDeFichero {

	public String leerFichero(String path) throws IOException {

		File file = new File(path); // en metainformacion

		// Pondríamos catch si alguna de estas comprobaciones se da por orden y
		// si no thows:
		// 1- podemos solventar el problema
		// 2-podemos tomar un camino alternativo al que nos da el problema para
		// realizar la tarea
		// 3- es nuestra responsabilidad avisar al usuario que nos pidio que
		// realizasemos
		// la tarea que no hemos podido y esto se hará en las vistas

		InputStream is = new FileInputStream(file); // ctrol+1 add throws

		// esto de abajo apenas se usa ya que hay frameworks que lo hacen en na
		/*
		 * int elByteLeido = is.read(); //meto un byte dentro de un entero y
		 * //sobra espacio un entero ocupa 4 bbytes y ambos sonprimitivos
		 * 
		 * 
		 * //se procesan los sorbitos con un while cuando sale -1 es cuando ya
		 * se ha abosrbido todo
		 * 
		 * int c; byte[] todosLosBytesLeidos = new byte[(int) file.length()];
		 * //lo hemos tenido que castear pues length es un long y tiene que
		 * entrar en byte int i=0;
		 * 
		 * while(( c= is.read()) !=-1){ //mientras no sea -1, c contendra el
		 * byte byte miByteLeido = (byte) c; //meter (byte) del segundo termino
		 * es castear es obligar a que entre todosLosBytesLeidos[i]=miByteLeido;
		 * i++; }
		 */

		FileReader fr = new FileReader(file); // esto lo da ya directamente java

		// esta linea de abajo tampoco lo lo más guay justo lo que hay debajo
		// solo, la linea, el resto lo que si
		// char caracterLeido = (char) fr.read(); //esto ya son caracterers

		BufferedReader br = new BufferedReader(fr);

		String miCadenaLeida = null;

		StringBuilder sb = new StringBuilder();  //para hacer concatenacion de strings hasta lo de append

		while ((miCadenaLeida = br.readLine()) != null) {
			sb.append(miCadenaLeida);

		}

		return sb.toString();

	}

}
