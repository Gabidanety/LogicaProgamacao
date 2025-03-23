package aula3;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
String menu = "\n1-Soma \n2-Subtracao \n3-Multiplicacao \n4-Divisao \n5-Raiz Quadrada \n6 Exponenciação \n0-Sair";
int op ;
double n1,n2,result = 0;
	System.out.print(menu+ "\nEscolha uma opcao: ");	
	op = leia.nextInt();
	
	
	switch(op) {
		
	case 0:
		System.out.print("Obrigada por usar nosso progama. ");	
		break;
		 
	case 1:
			
			
		System.out.print("Escre o primeiro numero: ");	
		n1 = leia.nextDouble();
		System.out.print("Escre o segundo numero: ");	
		n2 = leia.nextDouble();
		
		result = n1+n2;
		
		System.out.print(n1+" + "+n2+" = "+result);	

		break;
	
	case 2:
		
		
		System.out.print("Escre o primeiro numero: ");	
		n1 = leia.nextDouble();
		System.out.print("Escre o segundo numero: ");	
		n2 = leia.nextDouble();
		
		result = n1-n2;
		 
		System.out.print(n1+" - "+n2+" = "+result);	

		break;
	
	case 3:
		
		
		System.out.print("Escre o primeiro numero: ");	
		n1 = leia.nextDouble();
		System.out.print("Escre o segundo numero: ");	
		n2 = leia.nextDouble();
		
		result = n1*n2;
		
		System.out.print(n1+" x "+n2+" = "+result);	

		break;
		
	case 4:
		
		System.out.print("Escre o primeiro numero: ");	
		n1 = leia.nextDouble();
		System.out.print("Escre o segundo numero: ");	
		n2 = leia.nextDouble();
		
		if(n2!=0) {
			
			result = n1/n2;
			
			System.out.print(n1+" / "+n2+" = "+result);	
	
		}else {
			System.out.print("Não e possivel fazer divisao por 0 ");	
		}

		break;
		
	case 5:
		
		System.out.print("Escre o primeiro numero: ");	
		
		n1 = leia.nextDouble();
		
		if(n1<0) {

			System.out.print("Não é possivel encotrar a raiz quadrada com numero negativo");	

		}else {
			
		result = Math.sqrt(n1);
		
		System.out.print("Raiz quadrada de "+n1+" e: "+result );	
		
		}
		
		break;
		
	case 6:
		
		System.out.print("Escre o numero da base: ");	
		n1 = leia.nextDouble();
		
		System.out.print("Escre o numero do exponte: ");	
		n2 = leia.nextDouble();
		
		result = Math.pow(n1,n2);
		
		System.out.print("o resuntado de "+n1+"^"+n2+" = "+result );	

		break;
		 
		
	default: System.out.print("Essa Opcao não é possivel escolha um numero de 0 a 6 ");	

	}
	
	
	}

}
