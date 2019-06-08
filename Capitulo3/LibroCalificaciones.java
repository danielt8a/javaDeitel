// Fig 3.1: LibroCalificaciones.java
// Declaración de un clase con un método

public class LibroCalificaciones{

	// Nombre del curso para este LibroCalificaciones
	private String nombreDelCurso; 

	//Método para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombreDelCurso){
		nombreDelCurso = nombre; // Almacena el nombre del curso en la variable nombre
	} // Fin del método establecerNombreDelCurso

	//

	// Muestra el mensaje de bienvenida  al usuario de LibroCalificaciones

	public void mostrarMensaje(String nombreDelCurso)
	{
		System.out.printf("Bienvenido al Libro de Calificaciones para \n %s! \n", nombreDelCurso);
	} // Fin del método mostrarMensaje
}// Fin de la clase LibroCalificaciones