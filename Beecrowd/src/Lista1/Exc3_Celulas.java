package Lista1;

import java.util.Scanner;

public class Exc3_Celulas {

	public static void main(String[] args) {
			Scanner in = new Scanner (System.in);

			/* cedulas:
			 * 100
			 * 50
			 * 20
			 * 10
			 * 5
			 * 2
			 * 1
			 * 
			 * 7852
			 * 7000 - cc  - cedulas de 100 
		 	 *  800 - cc  - cedulas de 100
			 *   50 
			 *    2
			 *    
			 *  rc - resto de cem  
			 *  
			 *  % 10 - pega o ultimo numero
			 *   / 10 - pega todos menos o ultimo 
			 * */
			
			
			int n,cc=0,cd=0,cdc=0,rcd = 0,nv=0,nd=0,ru=0,d=0,u=0,c=0;
			
			n = in.nextInt();
			
			cc = n/100; // cedulas de 100
			
			cd = n%100; // dezena e unidade
			
			//Dezena
			
			if(cd>=50) {
				cdc = 1; //cedulas de 50
				
				rcd = cd/10; //resto de notas dezena +50

				
				switch(rcd){
				
				case 9:
					nv = 2; // notas de 20

					break;
				case 8:
					nv =1; 
					nd = 1; //notas de 10
					break;

				case 7:
					nv = 1;
					break;

				case 6:
					nd=1;
					break;

			}
				
				
				
			}else {
				
				rcd = cd/10; //resto de notas dezena -50
				
				switch(rcd){
					
					case 4:
						nv = 2; // notas de 20

						break;
					case 3:
						nv =1; 
						nd = 1; //notas de 10
						break;

					case 2:
						nv = 1;
						break;

					case 1:
						nd=1;
						break;

				}
			}
				
			//Unidade
			/*
			 * 5 - c
			 * 2 - d 
			 * 1 - u
			 * */
			
			ru = cd%10; // Unidade
			
			if(ru>=5) {
				
				c = 1; // notas de cinco
				
				switch(ru){
				
					case 9:
						d = 2; // notas de 2
		
						break;
					case 8:
						d =1; 
						u = 1; //notas de 1
						break;
		
					case 7:
						d = 1;
						break;
		
					case 6:
						u =1;
						break;
		
				}
				
			}else {
				
				
				switch(ru){
				
				case 4:
					d = 2; // notas de 2

					break;
				case 3:
					d =1; 
					u = 1; //notas de 1
					break;

				case 2:
					d = 1;
					break;

				case 1:
					u =1;
					break;

			}
				
				
			}
			
			//System.out.println(cc+" "+cdc+" "+nv+" "+nd+" "+c+" "+d+" "+u);
							//100     50     20     10      5	  2		1
			System.out.println(n);
			System.out.println(cc+" nota(s) de R$ 100,00");
			System.out.println(cdc+" nota(s) de R$ 50,00");
			System.out.println(nv+" nota(s) de R$ 20,00");
			System.out.println(nd+" nota(s) de R$ 10,00");
			System.out.println(c+" nota(s) de R$ 5,00");
			System.out.println(d+" nota(s) de R$ 2,00");
			System.out.println(u+" nota(s) de R$ 1,00");

			//576 11257
			
			
	}

}
