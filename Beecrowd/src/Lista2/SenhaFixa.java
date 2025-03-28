package Lista2;

import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int senha=2002,tentativa=0;
		
		do {
			
			tentativa = in.nextInt();
			
			if(tentativa==senha) {
				System.out.println("Acesso Permitido");

			}else {
				System.out.println("Senha Invalida");


			}
			
			
		}while(tentativa!=senha);
	}

}
