//Calcular el producto de 3 enteros
import java.util.Scanner;

public class Producto{

	public static void main(String[] args){
		//Crear objeto Scanner para obtener datos del usuario
		Scanner entrada = new Scanner(System.in);

		//Declaración de variables
		int x, y, z, resultado;

		System.out.print("Escriba el primer entero: "); //Indicador de entrada
		x = entrada.nextInt(); //Lee el primer entero

		System.out.print("Escriba el segundo entero: ");
		y = entrada.nextInt(); //Lee el segundo entero

		System.out.print("Escriba el tercer entero: ");
		z = entrada.nextInt(); //Lee el tercer entero

		resultado = x * y * z;

		System.out.printf("El producto es %d\n", resultado);
	}
}