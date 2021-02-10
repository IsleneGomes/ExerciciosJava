package pacoteAula2_11;

public class Classe2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoDeCredito;
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = true;
		clienteDezEstrelas = true;
		restricaoDeCredito = true;
		
		boolean concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada ||clienteDezEstrelas) && !restricaoDeCredito; 
		
		System.out.printf("Emprestimo concedido?\n%b", concederEmprestimo);
		
		
		
		
		
		
		
	}

}
