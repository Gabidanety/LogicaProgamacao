package Aula4;

import java.util.Scanner;

public class Excnverso {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		/*
		 * 	Progama Inverso 
		 * 	var n,n1,n2,n3,n4 : inteiro
		 *     incio
		 *     		leia (n)
		 *          n1 <- n MOD 10
		 *          n2 <- n DIV 10
		 *          n3 <- n2 DIV 10
		 *          n4 <- n2 MOD 10
		 *          escreva ("n1,n4,n3")
		 *      fim
		 * 
		 * */
		
		
		int n,n1,n2,n3,n4;
		
		System.out.print("Escreva um inteiro de 3 algarismo");

		n = leia.nextInt();
		
		 n1 = (n%10);
		
		 n2 = (n/10);

		 n3 = (n2/10);
		 n4 = (n2%10);

		
		System.out.print(n1+""+n4+""+n3);
		
	}

}
