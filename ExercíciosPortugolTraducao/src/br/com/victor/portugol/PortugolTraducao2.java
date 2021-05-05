package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao2 {

	public static void main(String[] args) {
		
		int idadetotal;
		int idadeanos;
		int idademeses;
		int idadedias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual sua idade em dias? ");
		idadetotal = leia.nextInt();
		
		idadeanos = idadetotal/365;
		
		System.out.println("\n Sua idade em anos é " + idadeanos);
		
		idadedias = idadetotal%365;
		idademeses = idadedias/30;
		idadetotal = idadetotal%30;
		idadedias = idadetotal;
		
		System.out.println("\nSuas idade em meses é " + idademeses);
		
		System.out.println("\nSua idade em dias é " + idadedias);
	    
		
		
	}

}
