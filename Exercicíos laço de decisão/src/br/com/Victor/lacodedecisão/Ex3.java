package br.com.Victor.lacodedecisão;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Escreva sua idade");
		idade = leia.nextInt();
		
				if(idade >=10 && idade <=14) {
					System.out.println("Você pertence ao grupo infantil");}
				else if(idade >=15 && idade <=17) {
					System.out.println("Você pertence ao grupo juvenil");}
				else if(idade >=18 && idade <= 25) {
					System.out.println("Você pertence ao grupo adulto");
				
					
					
				}
		
		
		
		

	}

}
