package aula1;

import java.util.Scanner;

public class Exc7Media {

	public static void main(String[] args) {
	
	Scanner leia =  new Scanner (System.in);
	
	
	int p1,p2;
	double n1,n2,media;
	
	System.out.println("Escreva o valor do peso 1");

	p1 = leia.nextInt();
	
	System.out.println("Escreva o valor do peso 2");

	p2 = leia.nextInt();

	System.out.println("Escreva o valor da primeira nota");

	n1= leia.nextDouble();	
	
	System.out.println("Escreva o valor da segunda nota");

	n2= leia.nextDouble();
	
	media  = (n1*p1 + n2*p2)/(p1+p2);
	
	System.out.println("A media das notas é: "+media);
	
	}

}
