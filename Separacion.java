import java.util.Scanner;

public class Separacion {
	
	public static void main(String[] args){

		//Creación del objeto Scanner

		Scanner entrada = new Scanner(System.in);

		// Declaración de la variable número

		int numero;

		// Solicitud del número al usuario

		System.out.println("Introduce un número de 5 dígitos: ");

		numero = entrada.nextInt();

		
		// Si el número es mayor o menor a 5 dígitos
		if (numero < 10000)
			System.out.println("Por favor, introduce un número de 5 dígitos");

		if (numero > 99999)
			System.out.println("Por favor, introduce un número de 5 dígitos");

		// Comprobar que el número es de 5 dígitos
		
		if (numero >= 10000 & numero <= 99999){
					System.out.printf("%d %d %d %d %d \n", numero / 10000, 
						(numero % 10000) / 1000,
						(numero % 1000) / 100,
						(numero % 100) / 10,
						(numero % 10) / 1
						);
		}


	}

}
		
