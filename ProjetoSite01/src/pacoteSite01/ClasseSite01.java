package pacoteSite01;

import java.util.Scanner;

public class ClasseSite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numeroCasa;
	String  Nome, Endere�o, Telefone;
			
	Scanner entradaTexto = new Scanner (System.in);
	Scanner entradaFloat = new Scanner (System.in);
	Scanner entradaInt = new Scanner (System.in);
	
	System.out.println("Digite o nome do Morador:");
	Nome = entradaTexto.nextLine();
	
	System.out.println("Digite o endere�o do Morador:");
	Endere�o = entradaTexto.nextLine();
	
	System.out.println("Digite o n�mero da casa do Morador:");
	numeroCasa = entradaInt.nextInt();
	
	System.out.println("Digite o n�mero do Telefone do Morador:");
	Telefone = entradaTexto.nextLine();
	
	
	System.out.printf("O morador (a) %s domiciliado no endere�o %s n�mero %d. \n e telefone %s. n�o possui nenhum tipo de pend�ncia.", Nome, Endere�o, numeroCasa, Telefone);
	
	
	}

}
