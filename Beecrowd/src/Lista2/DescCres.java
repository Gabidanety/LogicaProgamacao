package Lista2;

import java.util.Scanner;

public class DescCres {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		 int X,Y;
			
			X = in.nextInt();
			Y = in.nextInt();
			
			while(X!=Y) {
				if(X>Y) {
					System.out.println("Decrescente");
					X = in.nextInt();
					Y = in.nextInt();
				}else {
					System.out.println("Crescente");
					X = in.nextInt();
					Y = in.nextInt();
				}
				
				
			}
				
		
		
	}

}
