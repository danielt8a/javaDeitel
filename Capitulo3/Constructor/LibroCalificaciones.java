// LibroCalificaciones.java
// La clase LibroCalificaciones con un constructor para inicializar el nombre del curso

public class LibroCalificaciones {

	private String nombreDelCurso; // Nombre del libro para este LibroCalificaciones
	private String nombreDelInstructor; // Nombre del instructor

	// El constructor inicializa nombreDelCurso con un argumento String
	//El nombre del constructor es el nombre de la Clase

	public LibroCalificaciones(String nombre, String instructor){ 

		nombreDelCurso = nombre; // Inicializa nombreDelCurso
		nombreDelInstructor = instructor; // Inicializa el nombreDelInstructor

	} // Fin del constructor

	// Método para establecer el nombre del Curso

	public void establecerNombreDelCurso (String nombre){

		nombreDelCurso = nombre; // Almacena el nombre del curso
	} // Fin del método establecerNombreDelCurso

	// Método para obtener el nombre del curso

	public String obtenerNombreDelCurso(){

		return nombreDelCurso;
	} // Fin del método obtenerNombreDelCurso

	// Método para establecer el nombre del Instructor

	public void establecerNombreDelInstructor(){

		nombreDelInstructor = instructor;
	} // Fin del método establecerNombreDelInstructor

	// Método obtener nombre del instructor

	public String obtenerNombreDelInstructor(){
		return nombreDelInstructor;
	} //Fin del método obtenerNombreDelInstructor

	//Muestra un mensaje de bienvenida al usuario

	public void mostrarMensaje(){

		// Invoca a obtenerNombreDelCurso para otener el nombre del curso
		System.out.printf("Bienvenido al libro de Calificaciones para: \n %s! \n",
			obtenerNombreDelCurso() );
		System.out.printf("Tu profesor asignado es: \n %s! \n",
			obtenerNombreDelInstructor() );

	} // Fin de mostrar mensaje


}