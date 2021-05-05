package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double x1;
		double x2;
		double X;
		double y1;
		double y2;
		double Y;
		double distancia;
		
		System.out.println("Digite os valores");
		x1 = leia.nextDouble();
		x2 = leia.nextDouble();
		y1 = leia.nextDouble();
		y2 = leia.nextDouble();
		
		X = Math.pow((x2-x1), 2);
		Y = Math.pow(y2-y1, 2);
		
		distancia = Math.pow((X + Y), 0.5);
		
		System.out.println(" Essa é sua solução: " + distancia);
				
		
		
		
		
		
		
	

	}

}
