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

		//Pide y recibe el nombre del curso como entrada
		System.out.println("Escriba el nombre del curso:");
		String nombreDelCurso = entrada.nextLine(); //Lee una línea de texto
		System.out.println(); //Imprime una línea en blanco


		// Llama al método mostrar mensaje de miLibroCalificaciones
		//y pasa nombreDelCurso como argumento
		miLibroCalificaciones.mostrarMensaje(nombreDelCurso);
	} // Fin de main

} //Fin de la clase PruebaLibroCalificaciones