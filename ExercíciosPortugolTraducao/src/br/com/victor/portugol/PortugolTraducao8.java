package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica;
		double custoConsumidor;
		double distribuidor;
		
		System.out.println("Digite o custo de fábrica de um carro novo ");
		custoFabrica = leia.nextDouble();
				
		distribuidor = custoFabrica * 1.28;
		custoConsumidor = distribuidor * 1.45;
		
		System.out.println("Custo do consumidor é: " + custoConsumidor);
	
		
		
		

	}

}
