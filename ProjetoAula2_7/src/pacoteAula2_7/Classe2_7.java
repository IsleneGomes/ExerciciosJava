package pacoteAula2_7;

public class Classe2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//%s String
		//%d Int
		//%.2f float ou double com duas casas decimais
		//%.4f float ou double com quatro casas decimais...etc
		//%.b boolean
		//%.c caractere (char)
		
		int idade = 30;
		double altura = 1.81;
		String nome = "Jos� da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		// \n quebra a linha
		System.out.printf("O nome � %s o sexo � %c.\n A idade � %d e a altura � %.2f.\n � estudante? %b",nome, sexo, idade, altura, estudante);
		
	}

}
