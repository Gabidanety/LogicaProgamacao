package Lista2;

import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int hora,km;
		double litro,distancia;
				

		hora = in.nextInt();
		

		km = in.nextInt();
		
		distancia = km * hora;
		
		litro = distancia/12;
		
		System.out.printf("%.3f",litro);
		
		
		
	}

}
