//Compara enteros utilizando instrucciones if
import java.util.Scanner; //Utiliza la clase Scanner

public class Comparacion {

	// El método main empieza la ejecución de la aplicacion Java
	public static void main(String[] args)
	{
		//Creación del objeto Scanner para obtener datos mediante el teclado
		Scanner entrada = new Scanner(System.in);

		//Declaración de las variables numero1 y numero2
		int numero1, numero2;

		System.out.print("Escriba el primer número: "); //Solicita el primer número
		numero1 = entrada.nextInt(); //Lee el primer número del usuario

		System.out.print("Escriba el segundo número: "); //Solicita el segundo número
		numero2 = entrada.nextInt(); //Lee el segundo número

		if (numero1 == numero2)
			System.out.printf("%d == %d\n", numero1, numero2);

		if (numero1 != numero2)
			System.out.printf("%d != %d\n", numero1, numero2);

		if (numero1 < numero2)
			System.out.printf("%d < %d\n", numero1, numero2);

		if (numero1 > numero2)
			System.out.printf("%d > %d\n", numero1, numero2);

		if (numero1 <= numero2)
			System.out.printf("%d <= %d\n", numero1, numero2);

		if (numero1 >= numero2)
			System.out.printf("%d >= %d\n", numero1, numero2);

	}
}