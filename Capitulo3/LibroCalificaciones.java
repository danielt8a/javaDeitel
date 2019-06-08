// Fig 3.1: LibroCalificaciones.java
// Declaración de un clase con un método

public class LibroCalificaciones{

	// Nombre del curso para este LibroCalificaciones
	private String nombreDelCurso; //Variable de instancia

	//Método para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombre){
		nombreDelCurso = nombre; // Almacena el nombre del curso en la variable nombre
	} // Fin del método establecerNombreDelCurso

	//Método para obtener el nombre del curso
	public String obtenerNombreDelCurso(){

		return nombreDelCurso;
	} //Fin del método obtener nombre del curso

	// Muestra el mensaje de bienvenida  al usuario de LibroCalificaciones

	public void mostrarMensaje()
	{
		System.out.printf("Bienvenido al Libro de Calificaciones para \n %s! \n", obtenerNombreDelCurso() );
		
		//Esta línea manda a llamar al método obtenerNombreDelCurso

	} // Fin del método mostrarMensaje
}// Fin de la clase LibroCalificaciones