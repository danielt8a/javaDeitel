//Suma.java

// Suma de dos números utilizando entrada y salid con cuadros de diálogos

import javax.swing.JOptionPane;
 public class Suma {

 	//El método main comienza la ejecución de la aplicación
 	public static void main(String[] args){

 		// Pide al usuario un primer número entero

 		String numero1 =
 			JOptionPane.showInputDialog("Introduzca el primer número: ");

 			
 		// Solicita al usuario un segundo número entero

 		String numero2 =
 			JOptionPane.showInputDialog("Introduce el segundo número: ");

 		
 		//Realiza la suma de los dos números
 		int suma = Integer.parseInt(numero1) + Integer.parseInt(numero2);

 		// Creación del mensaje

 		String mensaje = 
 			String.format("La suma total es: %d", suma);

 		//Muestra el mensaje del valor de la suma

 		JOptionPane.showMessageDialog(null, mensaje);


 	}

 }