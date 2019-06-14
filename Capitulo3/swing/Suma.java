//Suma.java

// Suma de dos números utilizando entrada y salid con cuadros de diálogos

import javax.swing.JOptionPane;
 public class Suma {

 	//El método main comienza la ejecución de la aplicación
 	public static void main(String[] args){

 		// Pide al usuario un primer número entero

 		String numero1 =
 			JOptionPane.showInputDialog("Introduzca el primer número: ");

 		//Convierte el String a int

 		parseInt(numero1);

 		// Solicita al usuario un segundo número entero

 		String numero2 =
 			JOptionPane.showInputDialog("Introduce el segundo número: ");

 		//Convierte el String a int
 		parseInt(numero2);

 		//Realiza la suma de los dos números
 		int suma = numero1 + numero2;

 		// Creación del mensaje

 		String mensaje = 
 			String.format("La suma total es: %d", suma);

 		//Muestra el mensaje del valor de la suma

 		JOptionPane.showMessageDialog(null, mensaje);


 	}

 }