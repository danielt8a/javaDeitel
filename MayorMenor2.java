/* Escriba una aplicación que lea cinco enteros y que determine e
imprima los enteros mayor y menor. */

import java.util.Scanner;

public class MayorMenor2 {

	//Método main inicia la ejecución de la apliación Java

	public static void main(String[] args){

		//Creación de la clase Scanner
		Scanner entrada = new Scanner(System.in);

		//Declaración de las variables

		int a, b, c, d, e;

		System.out.print("Ingrese el valor del primer entero: "); //Indicador
		a = entrada.nextInt(); //Recibe el valor del primer entero

		System.out.print("Ingrese el valor del segundo entero: "); // Indicador
		b = entrada.nextInt(); // Recibe el valor del segundo entero

		System.out.print("Ingrese el valor del tercer entero: "); // Indicador
		c = entrada.nextInt(); //Recibe el valor del tercer entero

		System.out.print("Ingrese el valor del cuarto entero: "); // Indicador
		d = entrada.nextInt(); //Recibe el valor del cuarto entero

		System.out.print("Ingrese el valor del quinto entero: "); // Indicador
		e = entrada.nextInt(); // Recibe el valor del quinto entero

		// A es mayor
		if (a > b)
			if (a > c)
				if (a > d)
					if (a > e){
						
						System.out.println("El número mayor es a: ");
					}

					if (e > b)
						if (e > c)
							if (e > d){
						
								System.out.println("El número mayor es e: ");
							}


				if (d > b)
					if (d > c)
						if (d > e){
						
							System.out.println("El número mayor es d: ");
						
						}

			if (c > b)
				if (c > d)
					if ( c > e){
						
						System.out.println("El número mayor es c: ");
					}

			if (b > a)
				if ( b > d)
						if (b > e){
						
							System.out.println("El número mayor es b");
						
						}

		//Fin de A es mayor			
						
						
		//A es menor
		if (a < c)
			if (a < d)
				if (a < e){
					
					System.out.println("El número menor es a");
				}
		// Fin de A es menor	
					
					

			

		if (b < c)
			if (b < d)
				if (b < e){
					
					System.out.println("El número menor es b");
				}
					
					
					

		

		if (c < a)
			if (c < b)
				if (c < d)
					if (c < e){
					
					System.out.println("El número menor es c");
					}
						
								

		if (d < b)
			if (d < c)
				if (d < e){
					
					System.out.println("El número menor es d");
				}
						
						

		if (e < b)
			if(e < c)
				if(e < d){
					System.out.println("El número menor es e: ");
				}
						
	
	}
}