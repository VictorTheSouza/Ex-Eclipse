package br.com.Victor.lacodedecisão;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a;
		double x;
		double y;
		
		System.out.println("Digite seu número");
		a = leia.nextDouble();
		
		if(a%2==0) {
			x = Math.pow(a,0.5);
			System.out.println("Esse número é par, e sua raiz quadrada é: " + x);}
		else if(a%2!=0) {
			y = a*a;
				System.out.println("Esse número é impar, e elevado ao quadrado é: " + y);
			
			
			
		}
		
	
		
		
	}

}
