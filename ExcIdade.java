package Lista1;

import java.util.Scanner;

public class ExcIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

	int nasc,anoAtual,idade,mes,dia,semanas;
		
	System.out.printf("Digite ano atual: ");

		anoAtual = leia.nextInt();
		
		System.out.printf("Digite o ano de seu nascimento: ");

		nasc = leia.nextInt();

		idade = anoAtual-nasc;
		
		dia = idade*365;
		
		mes = idade*12;
		
		semanas = dia/7;
		
		System.out.printf("\n Idade: "+idade);
		System.out.printf("\n Meses: "+mes);
		System.out.printf("\n Dias: "+dia);
		System.out.printf("\n Semanas: "+semanas);




	}

}
