package prueba1;
import java.util.Random;
import java.util.Scanner;


public class Vector_Prom_Double {

	static int size = 3;
	
	public static void main(String[] args) 
	{
		double[] notas = new double[size];
		llenaVector(notas);
		imprimeVector(notas);
	}
	
	public static double[] llenaVector(double[] notas)
	{
		System.out.println("LLenando vector....");
		Scanner teclado = new Scanner( System.in );
		double numero1 = 0;
		for(int i=0;i<notas.length;i++)
		{
			System.out.println("Introduce un número:");      
			numero1 = teclado.nextInt();
			notas[i] =  numero1; // new Random().nextInt(40);
		}
		return notas;
	}
	
	public static void imprimeVector(double[] notas)
	{
		double suma = 0;
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
