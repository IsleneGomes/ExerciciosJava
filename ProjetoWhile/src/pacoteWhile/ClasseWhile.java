package pacoteWhile;

import java.util.Scanner;

public class ClasseWhile {

	public static void main(String[] args) {
	/*while(aqui dentro coloca a condi��o que o while vai obedecer para continuar rodando)*/
		Scanner entrada = new Scanner(System.in);
	
	char saida = 'N';
	int numero = 0, somatorio = 0, contaNrs = 0;
	
	while (saida != 'S') {
		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();
		
		entrada.nextLine();
		System.out.println("Gostaria de sair (S - Sim, N - N�o)?");
		saida = entrada.nextLine().charAt(0);
		somatorio = somatorio + numero;
		contaNrs ++;
	}
	System.out.printf("O valor da somat�ria �: %d.\n", somatorio);
	System.out.printf("Foram digitados %d n�meros", contaNrs);

	}
}


