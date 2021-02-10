package pacoteArray;

import java.util.Scanner;

public class ClasseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0, i = 0;
		int [] numeros = new int [10];
		Scanner entrada = new Scanner(System.in);
				
		for (i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros[i] = entrada.nextInt();
			total = total + numeros [i];
			System.out.printf("Total parcial: %d.\n", total);
			}
		System.out.printf("O total digitado é %d.\n", total);
	}
	
}

