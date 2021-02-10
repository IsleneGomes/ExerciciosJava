package pacoteAula3_1;

import java.util.*;
import java.math.*;

public class Classe3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, nota3, nota4, frequencia, media;
		char statusAluno;
		double totalNotas;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaChar = new Scanner(System.in);
		
		System.out.print("Digite o nome do (a) aluno (a):");
		String nomeAluno = entradaChar.nextLine();
		//System.out.printf("%s\n", nomeAluno);
		System.out.println("*************************");
		System.out.print("Digite a situação do (a) aluno (a) (M--> Matriculado; P--> Pendente):");
		statusAluno = entradaChar.nextLine().charAt(0);
	//	System.out.printf("%c\n", statusAluno);
		System.out.println("*************************");
		System.out.printf("Digite a frequência do (a) aluno (a) %s: ", nomeAluno);
		frequencia = entradaNotas.nextDouble();
		System.out.println("*************************");
		System.out.printf("Digite a nota1 do (a) aluno (a) %s: ", nomeAluno);
		nota1 = entradaNotas.nextDouble();
	//	System.out.printf("%.2f.\n", nota1);
		System.out.println("*************************");
		System.out.printf("Digite a nota2 do (a) aluno (a) %s: ", nomeAluno);
		nota2 = entradaNotas.nextDouble();
	//	System.out.printf("%.2f.\n", nota2);
		System.out.println("*************************");
		System.out.printf("Digite a nota3 do (a) aluno (a) %s: ", nomeAluno);
		nota3 = entradaNotas.nextDouble();
	//	System.out.printf("%.2f.\n", nota3);
		System.out.println("*************************");
		System.out.printf("Digite a nota4 do (a) aluno (a) %s: ", nomeAluno);
		nota4 = entradaNotas.nextDouble();
	//	System.out.printf("%.2f.\n", nota4);
		System.out.println("*************************");
		totalNotas = nota1 + nota2 + nota3+ nota4;
		media = totalNotas/4;
		boolean aprovado = (totalNotas >=70 && frequencia >= 70);
		
		System.out.println("\n");
		System.out.println("Relatório da Situação do aluno " + nomeAluno);
		System.out.println("\n");
		
		System.out.printf("O (a) aluno (a) %s: \n", nomeAluno);
		
		System.out.printf("Teve notas %.2f, %.2f, %.2f e %.2f:\n", nota1, nota2, nota3, nota4);
		
		System.out.printf("A somatória das notas do (a) aluno (a) %s é %.2f. \n", nomeAluno, totalNotas);
		
		System.out.printf("A média do (a) aluno (a) %s é %.2f. \n", nomeAluno, media);
		
		System.out.printf("A frequência do (a) aluno (a) %s é %.2f%%.\n ", nomeAluno, frequencia);
		
		System.out.printf("A situação do (a) aluno (a) %s é (M-->Matriculado, P-->Pendente): %c\n ", nomeAluno, statusAluno);
		System.out.printf("Aluno (a) %s aprovado? %b ", nomeAluno, aprovado);
		System.out.println("\n");
		
		System.out.printf("***Fim do Relatório***");
		
		
		
	}

}
