import java.util.Scanner;

public class IndiceMasaCorporal {

	//Método main
	public static void main(String[] args){

		//Creación del objeto Scanner
		Scanner entrada = new Scanner(System.in);

		float peso, altura, bmi;

		//Solicitar el peso del usuario
		System.out.println("Ingrese su peso en kilogramos: ");
		peso = entrada.nextFloat();

		System.out.println("Ingrese su altura en metros: ");
		altura = entrada.nextFloat();

		// Calcular índice de masa corporal
		bmi = peso / (altura * altura);

		System.out.printf("Su índice de masa corporal es: %f \n", bmi);

		if (bmi < 18.5)
			System.out.println("Estás bajo de peso");
			if (bmi >= 18.5 & bmi <= 24.9)
				System.out.println("Estás normal");
				if (bmi >= 25 & bmi <= 29.9)
					System.out.println("Tienes sobrepreso");
					if(bmi >= 30)
						System.out.println("Tienes obesidad");

		System.out.println("********************");
		System.out.println("Valores de BMI");
		System.out.println("Bajo peso: menos de 18.5");
		System.out.println("Normal: entre 18.5 y 24.9");
		System.out.println("Sobrepreso: entre 25 y 29.9");
		System.out.println("Obeso: 30 o más");



	}
	
}