//DialogoNombre.java

// Entrada básica con un cuadro de diálogo
import javax.swing.JOptionPane;

public class DialogoNombre {


	//El método main comienza la ejecución de la aplicación
	public static void main(String[] args) {

		//Pide al usuario que escriba su nombre
		String nombre = 
			JOptionPane.showInputDialog("¿Cuál es su nombre?");

		//Crea el mensaje
		String mensaje = 
			String.format("Bienvenido, %s, a la programación en Java!",nombre);

		// muestra el mensaje para dar la bievenida al usuario por su nombre
		JOptionPane.showMessageDialog(null,mensaje);

	} //Fin del main
} //Fin de la clase DialogoNombre