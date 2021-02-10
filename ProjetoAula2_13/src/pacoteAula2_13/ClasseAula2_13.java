package pacoteAula2_13;

import java.math.*;

public class ClasseAula2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Carlos André Nascimento Neto";
		statusAluno = 'M';
		
		nota1 = 20;
		nota2 = 20;
		nota3 = 30;
		nota4 = 5;
		
		frequencia = 0.80*100;
		
		totalNotas = nota1 +nota2 + nota3 + nota4;
		
		aprovado = totalNotas >=70 && frequencia >= 0.75;
			
		System.out.printf("O (a) aluno (a) %s obteve nota final %.2f e frequencia %.2f%%.\n A situação final do (a) aluno (a) é (M - Matriculado, N - Não MAtriculado): %c.\n O (a) aluno (a) foi aprovado (a)? %b", nomeAluno,totalNotas,frequencia,statusAluno, aprovado);
		
	}

}
