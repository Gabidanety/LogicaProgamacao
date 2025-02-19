package lista1;

import java.util.Scanner;

public class ExcSubtracao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double n1,n2,r;
		
		System.out.print("escreva o numero 1: ");
		n1 = leia.nextDouble();
		
		System.out.print("escreva o numero 2: ");
		n2 = leia.nextDouble();

		r = n1-n2;
		
		System.out.print("A subtração entre esses valores e: "+r);
	}

}
