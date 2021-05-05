package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao {

	public static void main(String[] args) {
		int anos;
		int meses;
		int dias;
		int idade;
		int bissexto;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos anos completos você tem? ");
		anos = leia.nextInt();
		
		System.out.println("Quantos meses após seu último ano completo você tem? ");
		meses = leia.nextInt();
		
		System.out.println(" E quantos dias? ");
		dias = leia.nextInt();
		
				bissexto = anos/4;
				
		idade = (anos*365) + (meses*30) + dias + bissexto;
		
		System.out.println("Essa é sua idade em dias: " + idade);
		
				
	
				
		
		
		

	}

}
