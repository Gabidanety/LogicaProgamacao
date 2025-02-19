package aula1;

import java.util.Scanner;

public class ExcHorasTrabalhadas {

	public static void main(String[] args) {
		Scanner leia =  new Scanner (System.in);

		int horasJob;
		double bruto,liquido, valorHora,inss=0.12;
		
		System.out.println("Escreva o valor da hora trabalhada: ");

		valorHora = leia.nextDouble();
		
		System.out.println("Escreva a quantidade de horas trabalhada no mes : ");

		horasJob = leia.nextInt();
		
		bruto = valorHora*horasJob;
				
		liquido = bruto - (0.12*bruto);
		
		System.out.print("O valro bruto do salario: R$"+bruto);

		System.out.printf("O valro liquido do salario: R$"+liquido);
		
		
	}

}
