package lista1;

import java.util.Scanner;

public class ExcCompra {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double v1;
		int q1;
		
		System.out.print("escreva a quantidade do produto: ");
		q1 = leia.nextInt();
		
		System.out.print("escreva o valor do produto: ");
		
		v1 = leia.nextDouble();
		
		
		System.out.print("Total da compra e: R$"+(v1*q1));
	}

}
