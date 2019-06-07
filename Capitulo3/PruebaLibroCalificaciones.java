//Crea un objeto LibroCalificaciones y llama a su método mostrarMensaje
// pasa un objeto String al método mostrarMensaje()

import java.util.Scanner;

public class PruebaLibroCalificaciones{

	//El método main comienza la ejecución del programa

	public static void main(String[] args){

		// Crea el objeto Scanner para obtener datos del teclado del usuario

		Scanner entrada = new Scanner(System.in);

		//Crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaciones
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

		// Llama al método mostrar mensaje de miLibroCalificaciones
		miLibroCalificaciones.mostrarMensaje();
	} // Fin de main

} //Fin de la clase PruebaLibroCalificaciones