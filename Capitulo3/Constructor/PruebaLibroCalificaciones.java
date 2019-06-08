//PruebaLibroCalificaciones.java
//El constructor de LibroCalificaciones se utiliza para especificar el nombre del curso

public class PruebaLibroCalificaciones {

	//Método main
	public static void main (String[] args){

		//Crea objeto LibroCalificaciones

		LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones(
			"CS101 Introducción a la programación en Java", "John Deitel");

		LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones(
			"CS101 Estructuras de datos en Java", "Luis Joyanes");

		// Muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones

		System.out.printf("El nombre del curso de libroCalificaciones1 es: %s \n",
			libroCalificaciones1.obtenerNombreDelCurso() );

		System.out.printf("El nombre del curso de libroCalificaciones2 es: %s \n",
			libroCalificaciones2.obtenerNombreDelCurso() );

		// Muestra el nombre del curso y profesores

		libroCalificaciones1.mostrarMensaje();
		libroCalificaciones2.mostrarMensaje();

	} //Fin del main

} // Fin de la clase PruebaLibroCalificaciones