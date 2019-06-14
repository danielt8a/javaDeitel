//Cuenta.java
// Clase Cuenta utilizando interfaz gráfica

import javax.swing.JOptionPane;

public class PruebaCuenta {
	
	//El método main comienza la ejecución de la aplicación
	public static void main(String[] args){

		//Creación del objeto cuenta01

		Cuenta cuenta01 = new Cuenta(50.00);


		// El usuario ingresa la cantidad a depositar
		String montoDeposito =

			JOptionPane.showInputDialog("Ingrese la cantidad que desea abonar: ");

		//Se convierte de String a double
		double monto = Double.parseDouble(montoDeposito);

		//Se manda a llamar el método abonar
		cuenta01.abonar(monto);

		//Se crea el mensaje para mostrar el saldo total
		String mensaje =
			String.format("Tu saldo total es: %.2f", cuenta01.obtenerSaldo());


		//Muestra el mensaje con el valor del saldo

		JOptionPane.showMessageDialog(null, mensaje);




	}
}