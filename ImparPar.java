/* Programa para determinar si un número es par o impar */
import java.util.Scanner;

public class ImparPar {

	public static void main (String[] args){
		//Creación del objeto Scanner

		Scanner entrada = new Scanner(System.in);

		//Declaración de la variable numero

		int numero;

		//Solicitud al usuario para que ingrese el número

		System.out.print("Por favor introduce un número: ");
		numero = entrada.nextInt();

		//Si el número es par, su residuo es igual a cero
		if ( (numero % 2) == 0 )
			System.out.println("El número es par");

		// Si el número es impar, su residuo será diferente a cero
		if ( (numero % 2) != 0)
			System.out.println("El número es impar");




	}

}

