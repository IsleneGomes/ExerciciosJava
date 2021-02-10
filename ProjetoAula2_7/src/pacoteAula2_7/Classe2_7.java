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
		String nome = "José da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		// \n quebra a linha
		System.out.printf("O nome é %s o sexo é %c.\n A idade é %d e a altura é %.2f.\n É estudante? %b",nome, sexo, idade, altura, estudante);
		
	}

}
