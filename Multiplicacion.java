package prueba1;

import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) 
	{
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		
		 Scanner teclado = new Scanner( System.in );
		
		System.out.println("Introduce el primer número:");      
		numero1 = teclado.nextInt();
		      
		System.out.println("Introduce el segundo número:");
		numero2 = teclado.nextInt();
		
		resultado = numero1*numero2;
		System.out.println("El producto es " + numero1 + " * " + numero2 + " = " + resultado);

	}

}
