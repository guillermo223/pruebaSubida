package com.ejemplo.stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		
			System.out.println("usuario dame el nombre del fichero");
			
			
			Scanner scanner = new Scanner (System.in);
			
			String path = scanner.nextLine();
			
			ProcesadoDeFichero pdf = new ProcesadoDeFichero(); //me creo objeto
			
			
			try { 
				String loLeido= pdf.leerFichero(path);
				System.out.println("lo leido:" + loLeido);
				
				
			}catch (IOException e){
				
				e.printStackTrace();
			}
			
			
	}
	
	

}
