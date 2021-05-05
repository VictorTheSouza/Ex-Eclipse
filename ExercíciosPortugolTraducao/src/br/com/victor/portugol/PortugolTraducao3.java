package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao3 {

	public static void main(String[] args) {
		
		  Scanner leia = new Scanner (System.in);
		  
		  int hora;
		  int minuto;
		  int total;
		  int segundos;
		  
		  System.out.println("Seu tempo em segundos é");
		  total = leia.nextInt();
		  
		  hora = total/3600;
	      minuto = total%3600/60;
	      segundos = (total%60);
	      
	      System.out.println( "São " + hora);
	      System.out.println("horas");
	      System.out.println(" e " + minuto);
	      System.out.println("minutos");
	      System.out.println(" e " + segundos);
	      System.out.println(" segundos");
	      
		
				  

	}

}
