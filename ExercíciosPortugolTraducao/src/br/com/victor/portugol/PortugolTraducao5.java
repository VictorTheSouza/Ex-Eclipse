package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		double media;
		
		System.out.println ("Insira os valores das notas");
		A = leia.nextDouble();
		B = leia.nextDouble();
		C = leia.nextDouble();
		
		media = ((A*2) + (B*3) + (C*5))/10;
		
		System.out.println("media final: " + media);
			
		

	}

}
