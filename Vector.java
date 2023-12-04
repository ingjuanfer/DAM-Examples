package prueba1;
import java.util.Random;
import java.util.Scanner;

public class Vector 
{
	static int size = 20;
	
	public static void main(String[] args) 
	{
		int[] vector = new int[size];
		llenaVector(vector);
		imprimeVector(vector);
	}
	
	public static int[] llenaVector(int[] vector)
	{
		System.out.println("LLenando vector....");
		 Scanner teclado = new Scanner( System.in );
		int numero1 = 0;
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Introduce un número:");      
			numero1 = teclado.nextInt();
			vector[i] =  numero1; // new Random().nextInt(40);
		}
		return vector;
	}
	
	public static void imprimeVector(int[] vector)
	{
		System.out.println("Imprimiendo vector....");
		for(int i=0;i<vector.length;i++)
		{
			System.out.print(String.valueOf(vector[i])+" ");
		}
	}

}


