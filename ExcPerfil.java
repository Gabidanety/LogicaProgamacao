package Aula4;

import java.util.Scanner;

public class ExcPerfil {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int dia,mes,ano,soma, resto;
		
		System.out.printf("Digite o dia de seu nascimento: ");

		dia = leia.nextInt();
		System.out.printf("Digite o mes de seu nascimento: ");

		mes = leia.nextInt();
		System.out.printf("Digite o ano de seu nascimento: ");

		ano = leia.nextInt();
		
		soma = dia+mes+ano;
		
		resto = soma%5;
		
		System.out.print(resto);

		switch(resto) {
			
		case 0:
			System.out.printf(" Timido");
			break;
			
		case 1:
			System.out.printf(" Sonhador ");
			break;


		case 2:
			System.out.printf(" Paquerador ");
			break;


		case 3:
			System.out.printf(" Atraente ");
			break;


		case 4:
			System.out.printf(" Irresistevel ");
			break;


			default: 
				System.out.printf("Erro ao calcular o resto");
				break;


		}
	}

}
