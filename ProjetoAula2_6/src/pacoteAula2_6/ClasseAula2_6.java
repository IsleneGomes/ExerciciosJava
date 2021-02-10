package pacoteAula2_6;

public class ClasseAula2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, nome2;
		nome = "José da Silva";
		nome2 = "Maria Clara Sousa";
		
		int tamanhoDoNome = nome.length();
		int tamanhoDoNome2 = nome2.length();
		int soma = tamanhoDoNome + tamanhoDoNome2;
		
		System.out.println(nome);
		System.out.println("O nome tem: " + tamanhoDoNome + " caracteres");
		
		System.out.println("*********************");
		
		System.out.println(nome2);
		System.out.println("O nome tem: " + tamanhoDoNome2 +  " caracteres");
		
		System.out.println("*********************");
		
		System.out.println("Os nomes juntos tem: " + soma +  " caracteres");
		
		System.out.println("*********************");
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		System.out.println("*********************");
		
		String nomeSemA = nome.replace('a', '9');
		System.out.println(nomeSemA);
		
		System.out.println("*********************");
		
		String somenteNome = nome2.substring(0, 11);
		System.out.println(somenteNome);
		
		System.out.println("*********************");
		
		String nomeTudoMaiusculo = nome.toUpperCase();
		System.out.println(nomeTudoMaiusculo);
		
		System.out.println("*********************");
		
		String nomeTudoMinusculo = nome.toLowerCase();
		System.out.println(nomeTudoMinusculo);
		
	}

}
