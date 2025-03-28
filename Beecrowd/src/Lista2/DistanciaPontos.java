package Lista2;

import java.util.Scanner;

public class DistanciaPontos {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);

		double x1,x2=0,y1,y2=0,distancia; 
		
		String	linha1 = in.nextLine();

		String[] valores1 = linha1.split(" "); 
		
		x1 = Float.parseFloat(valores1[0]);
		y1 = Float.parseFloat(valores1[1]);

		
		String linha2 = in.nextLine();
		String[] valores2 = linha2.split(" "); 
		
		x2 = Float.parseFloat(valores2[0]);
		y2 = Float.parseFloat(valores2[1]);
		
		distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
				
		System.out.printf("%.4f\n",distancia);

		
		
		
		
	}

}
