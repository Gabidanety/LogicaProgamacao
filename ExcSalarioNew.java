package Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExcSalarioNew {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		
		
		double salario, novoSalario, aumento=0.25; 
		
		System.out.printf("Digite seu salario atual: ");

		salario = leia.nextDouble();
		
		novoSalario = (salario*aumento)+salario;
		
		System.out.printf("O seu novo salario e: R$"+df.format(novoSalario));
		
	}

}
