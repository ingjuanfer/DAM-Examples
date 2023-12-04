package prueba1;
import java.util.Random;
import java.util.Scanner;

public class Vector_Prom 
{

	static int size = 3;
	
	public static void main(String[] args) 
	{
		int[] notas = new int[size];
		llenaVector(notas);
		imprimeVector(notas);
	}
	
	public static int[] llenaVector(int[] notas)
	{
		System.out.println("LLenando vector....");
		Scanner teclado = new Scanner( System.in );
		int numero1 = 0;
		for(int i=0;i<notas.length;i++)
		{
			System.out.println("Introduce un número:");      
			numero1 = teclado.nextInt();
			notas[i] =  numero1; // new Random().nextInt(40);
		}
		return notas;
	}
	
	public static void imprimeVector(int[] notas)
	{
		int suma = 0;
		double promedio = 0;
		System.out.println("Imprimiendo vector....");
		for(int i=0;i<notas.length;i++)
		{
			suma=suma+notas[i];
		}
		promedio = suma/notas.length;
		System.out.print("El promedio de las notas es: " + promedio);
	}

}
