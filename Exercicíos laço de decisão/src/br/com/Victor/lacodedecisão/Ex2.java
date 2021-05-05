package br.com.Victor.lacodedecisão;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Digite três números: ");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		if (a>b && b>c){
			System.out.println("Essa é a ordem crescente deles: " + c +"," + b +"," +a);}
		else if (a>b && c>b){
			System.out.println("Essa é a ordem crescente deles: " + b +"," + c +"," +a);}
		
			else if( b>a && a>c) {
				System.out.println("Essa é a ordem crescente deles: " + c +"," + a +"," +b );}
		
			else if( b>a && a<c) {
				System.out.println("Essa é a ordem crescente deles: " + a +"," + c +"," +b );}
		
					else if(c>a && a> b ) {
					System.out.println("Essa é a ordem crescente deles: " + b +"," + a +"," +c );}
					
					else if(b>c&& c>a) {
					System.out.println("Essa é a ordem crescente deles: " + a +"," + b +"," +c );
					
					
			}
		
		}
		
		

	}


