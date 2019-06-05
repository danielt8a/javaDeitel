/*Aplicación que reciba del usuario el radio de un círculo como un entero,
y que imprima el diámetro, circunferencia y el área del círculo. */
import java.util.Scanner; // Recibe datos de entrada, es necesaria la clase Scanner

public class AreaCirculo {

	//Método main
	public static void main(String[] args){

		//Creación del objeto Scanner

		Scanner entrada = new Scanner(System.in);

		//Declaracion de variables
		int radio = 5;

		//Solicitud del valor del radio
		System.out.println("Ingresa el valor del radio");
		radio = entrada.nextInt();

		//Implicit casting
		float fradio = radio;


		// Mostrar en pantalla el valor del diámetro, circunferencia y área

		System.out.printf("El valor del diámetro es: %.3f\n", 2 * fradio);
		System.out.printf("El valor de la circunferencia es: %.3f\n", 2 * Math.PI * fradio);
		System.out.printf("El valor del área es: %.3f\n", Math.PI * (fradio * fradio)) ;





	}
}