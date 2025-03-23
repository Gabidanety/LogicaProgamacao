package Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExcValorPerncentual {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner (System.in);
			
			DecimalFormat df = new DecimalFormat ("#.##");
			
			
			double salario, novoSalario, aumento; 
			
			System.out.printf("Digite seu salario atual: ");
			
			salario = leia.nextDouble();
			
			System.out.printf("Digite o aumento percentual que o salario ira ter: ");
			
			aumento = leia.nextDouble();
			
			novoSalario = (salario*(aumento/100))+salario;
			
			System.out.printf("O salario novo e: R$"+df.format(novoSalario));

	}

}
