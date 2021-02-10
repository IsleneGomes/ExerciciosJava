package pacoteAulaInterativa;
import java.util.Scanner;
public class ClasseAulaInterativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ano = 0, idade = 0;
		Scanner entrada = new Scanner(System.in);
						
				
		System.out.println("Digite o ano em que você nasceu: ");
		ano = entrada.nextInt();
		
		idade = 2020 - ano;
		
		System.out.printf("Você nasceu no ano de %d e tem %d anos de idade.\n", ano, idade);
		
		if (idade >= 0 && idade <=12)
			System.out.println("Você ainda é uma criança.");
		else if (idade > 12 && idade < 18)
			System.out.println("Você já é um dolescente.");
		else if (idade >= 18 && idade < 60)
			System.out.println("Você é um adulto.");
		else if (idade > 60)
			System.out.println("Você está na melhor idade.");
		else 
			System.out.println("Você ainda nem nasceu. :)");
		
		
	}

}
