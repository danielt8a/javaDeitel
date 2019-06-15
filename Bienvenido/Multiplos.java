/* Escriba una aplicación que lea dos enteros, determine si el primero es
múltiplo del segundo e imprima el resultado */
import java.util.Scanner;

public class Multiplos {

	//Método main
	public static void main(String[] args){

		//Creación del objeto Scanner
		Scanner entrada = new Scanner(System.in);

		// Declaración de variables
		int numero1, numero2;

		//Inserción del primer número por teclado
		System.out.println("Por favor introduzca el primer número: ");
		numero1 = entrada.nextInt();

		//Inserción del segundo número
		System.out.println("Por favor introduzca el segundo número: ");
		numero2 = entrada.nextInt();

		//Determina si el primer número es múltiplo del segundo

		if ((numero1 % numero2) == 0)
			System.out.printf("%d es multiplo de %d \n", numero1, numero2);

		// Si el residuo es diferente a 0, es porque numero1 no es múltiplo de numero2
		if ((numero1 % numero2)!= 0)
			System.out.printf("%d no es múltiplo de %d \n", numero1, numero2);

	}
}