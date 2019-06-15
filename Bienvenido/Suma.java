// Suma.java
//Programa que muestra la suma dedos números.
import java.util.Scanner; //El programa utiliza la clase Scanner

public class Suma{

	//El método main empieza la ejecución de la aplicación Java
	public static void main(String[] args) 
	{
		//Crea objeto Scanner para obtener la entrada de la ventanda de comandos
		Scanner entrada = new Scanner(System.in);

		int numero1; //Primer número a sumar
		int numero2; //Segundo número a sumar
		int suma; //Suma de número1 y número 2

		System.out.println("Escriba el primer entero: "); //Pide el valor de numero1
		numero1 = entrada.nextInt(); //Leee el primer número del usuario

		System.out.println("Escriba el segundo entero: "); //Pide el valor de numero2
		numero2 = entrada.nextInt(); //Lee el segundo número del usuario

		suma = numero1 + numero2; //Suma de los números

		System.out.printf("El valor de la suma es %d\n", suma); //Muestra la suma
	}//Fin del método main

} //Fin de la clase Suma