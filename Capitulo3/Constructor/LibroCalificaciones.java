// LibroCalificaciones.java
// La clase LibroCalificaciones con un constructor para inicializar el nombre del curso

public class LibroCalificaciones {

	private String nombreDelCurso; // Nombre del libro para este LibroCalificaciones

	// El constructor inicializa nombreDelCurso con un argumento String
	//El nombre del constructor es el nombre de la Clase

	public LibroCalificaciones(String nombre){ 

		nombreDelCurso = nombre; // Inicializa nombreDelCurso
	} // Fin del constructor

	// Método para establecer el nombre del Curso

	public void establecerNombreDelCurso (String nombre){

		nombreDelCurso = nombre; // Almacena el nombre del curso
	} // Fin del método establecerNombreDelCurso

	// Método para obtener el nombre del curso

	public String obtenerNombreDelCurso(){

		return nombreDelCurso;
	} // Fin del método obtenerNombreDelCurso

	//Muestra un mensaje de bienvenida al usuario

	public void mostrarMensaje(){

		// Invoca a obtenerNombreDelCurso para otener el nombre del curso
		System.out.printf("Bienvenido al libro de Calificaciones para: \n %s! \n",
			obtenerNombreDelCurso() );

	} // Fin de mostrar mensaje


}