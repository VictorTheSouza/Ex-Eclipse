package br.com.victor.portugol;

import java.util.Scanner;

public class PortugolTraducao7 {

	public static void main(String[] args) {
	  Scanner leia = new Scanner(System.in);
	  
	  double a, b, c, d, e, f, x, y;
	  
	  System.out.println("Informe os valores de: a, b, c, d, e, f: ");
	  a = leia.nextDouble();
	  b = leia.nextDouble();
	  c = leia.nextDouble();
	  d = leia.nextDouble();
	  e = leia.nextDouble();
	  f = leia.nextDouble();
	  

		x = ((c*e)-(b*f))/((a*e)-(b*d));
  			y = ((a*f)-(c*d))/((a*e)-(b*d));
  			
  		System.out.println("O valor de x é " + x + " e o valor de y é " + y);

	}

}
