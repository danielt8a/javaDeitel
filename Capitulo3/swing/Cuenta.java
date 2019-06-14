// Cuenta.java
/* La clase Cuenta tiene un constructor para validar e inicializar
la variable de instancia saldo de tipo double*/

public class Cuenta {

	private double saldo; // variable de instancia que almacena el saldo

	//Constructor
	public Cuenta(double saldoInicial){
		/* Valida que saldoInicial sea mayor que 0.0;
		si no lo es, saldo se inicializa con el valor predeterminado 0.0 */
		if (saldoInicial > 0.0)
			saldo = saldoInicial;
	} // fin del constructor de Cuenta

	//abona (suma) un monto a la Cuenta

	public void abonar(double monto){

		saldo = saldo + monto; // Suma el monto al saldo

	} //Fin del método abonar

	// Devuelve el saldo de la cuenta
	public double obtenerSaldo(){

		return saldo; // Proporciona el valor de saldo al método que hizo la llamada
	}// Fin del método obtenerSaldo

} //fin de la clase Cuenta