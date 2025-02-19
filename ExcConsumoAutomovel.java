package aula1;

import java.util.Scanner;

public class ExcConsumoAutomovel {

	public static void main(String[] args) {
		Scanner leia =  new Scanner (System.in);

		 double d,v,consumo;
		 
		System.out.println("Escreva a distancia percorrida em km: ");

		 d = leia.nextDouble(); 
		
		System.out.println("Escreva o volume do combustivel: ");

		 v = leia.nextDouble(); 

		consumo = d/v;
		
		System.out.printf("O consumo medio foi de: "+consumo+" km/l");
		
		
	}

}
