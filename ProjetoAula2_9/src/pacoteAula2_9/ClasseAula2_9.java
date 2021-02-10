package pacoteAula2_9;

import java.math.*;

public class ClasseAula2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//CALCULAR A EQUAÇÃO DO SEGUNDO GRAU 
		
		double a, b, c;
		a = 1;
		b = 12;
		c = -13;
		
		double delta = 0;
		
		delta = (b * b) - (4 * a * c);
		
		System.out.printf("O valor do delta é : %.2f \n", delta);
		
		double x_linha = (-b + Math.sqrt(delta))/2*a;
		double x_duasLinhas = (-b - Math.sqrt(delta))/2*a;
		
		System.out.printf("**********************\n");
		System.out.printf("O valor do X' é : %.2f \n", x_linha);
		System.out.printf("**********************\n");
		System.out.printf("O valor do X'' é : %.2f \n", x_duasLinhas);
	}

}
