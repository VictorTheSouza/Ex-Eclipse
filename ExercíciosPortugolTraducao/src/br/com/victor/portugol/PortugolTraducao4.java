package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int A;
		int B;
		int C;
		
		int R;
		int S;
		
		int D;
		
		System.out.println("digite suas váriaveis A,B,C: ");
		A  = leia.nextInt();
		B  = leia.nextInt();
		C  = leia.nextInt();
		
		R = (A + B)*(A+B);
		S = (B+C) *(B+C);
		D = (R + S)/2;
		
		System.out.println("Sua variável D é: " + D);
				
		
		
		

	}

}
