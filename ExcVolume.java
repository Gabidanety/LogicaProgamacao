package lista1;

import java.util.Scanner;

public class ExcVolume {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double pi= 3.14159, r,h,v;
		
		System.out.print("escreva o raio da base da lata de oleo: ");
		r = leia.nextInt();
		
		System.out.print("escreva a altura da lata de oleo: ");
		
		h = leia.nextDouble();
		
		v = pi*r*r*h;
		
		System.out.print("volume da lata e: "+v);
	}

}
