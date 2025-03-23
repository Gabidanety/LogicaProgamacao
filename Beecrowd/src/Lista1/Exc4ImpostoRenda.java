package Lista1;

import java.util.Scanner;

public class Exc4ImpostoRenda {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		float salario,taxa,total;
		double imposto=0;
		
		salario = in.nextFloat();		
		
		if(salario<=2000) { //isento
			
			System.out.println("Isento");

			
		}else if(salario>2000 && salario<=3000) { //8%
			
			imposto = salario-(0.08*1000);
			
			System.out.println("R$ "+imposto);

		}else if(salario>3000 && salario<=4500) { //18%
			
			imposto = (0.08*1000)+(0.18*(salario-3000.01));
			
			
			System.out.println("R$ "+imposto);

		}else { //28%
			imposto = (0.08*1000)+(0.18*1500)+(0.28*(salario-4500.0));

			
			System.out.printf("R$ %.2f",imposto);

		}
		
		
		

		
		
		
		
		
		
		
		
	}

}
