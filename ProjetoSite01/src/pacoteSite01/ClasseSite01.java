package pacoteSite01;

import java.util.Scanner;

public class ClasseSite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numeroCasa;
	String  Nome, Endereço, Telefone;
			
	Scanner entradaTexto = new Scanner (System.in);
	Scanner entradaFloat = new Scanner (System.in);
	Scanner entradaInt = new Scanner (System.in);
	
	System.out.println("Digite o nome do Morador:");
	Nome = entradaTexto.nextLine();
	
	System.out.println("Digite o endereço do Morador:");
	Endereço = entradaTexto.nextLine();
	
	System.out.println("Digite o número da casa do Morador:");
	numeroCasa = entradaInt.nextInt();
	
	System.out.println("Digite o número do Telefone do Morador:");
	Telefone = entradaTexto.nextLine();
	
	
	System.out.printf("O morador (a) %s domiciliado no endereço %s número %d. \n e telefone %s. não possui nenhum tipo de pendência.", Nome, Endereço, numeroCasa, Telefone);
	
	
	}

}
