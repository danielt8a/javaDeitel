//PruebaCuenta.java
//Entrada y salida de números de punto flotante con objetos Cuenta
import java.util.Scanner;

public class PruebaCuenta {

	//El método main comienza la ejecución de la aplicación Java
	public static void main(String[] args){


		Cuenta cuenta1 = new Cuenta(50.00); //crea objeto Cuenta
		Cuenta cuenta2 = new Cuenta(-7.53); //Crea un objeto Cuenta

		//Muestra el saldo inicial de cada objeto

		System.out.printf("Saldo de cuenta: %.2f \n",
			cuenta1.obtenerSaldo() );
		System.out.printf("Saldo de cuenta: %.2f \n",
			cuenta2.obtenerSaldo() );

		//Crea un objeto Scanner para obtener la entrada mediante teclado

		Scanner entrada = new Scanner(System.in);

		double montoDeposito;

		System.out.print("Escriba el monto a depositar para Cuenta1: ");
		montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario

		System.out.printf("\n sumando %.2f al saldo de Cuenta1\n\n",
			montoDeposito);

		cuenta1.abonar(montoDeposito); // Suma al saldo de cuenta1

		//Muestra los saldos
		System.out.printf("Saldo de cuenta1: $ %.2f\n",
			cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $ %.2f\n",
			cuenta2.obtenerSaldo());

		//Depositar a cuenta2
		System.out.print("Escriba el monto a depositar para cuenta2: ");
		montoDeposito = entrada.nextDouble();

		System.out.printf("\n sumando %.2f al saldo de cuenta2\n\n",
			montoDeposito);

		cuenta2.abonar(montoDeposito); // Suma al saldo de cuenta2

		//Muestra los saldos

		System.out.printf("Saldo de cuenta2: $ %.2f\n",
			cuenta1.obtenerSaldo() );
		System.out.printf("Saldo de cuenta2: $ %.2f\n",
			cuenta2.obtenerSaldo() );

	} //Fin de main
} //Fin de clase PruebaCuenta