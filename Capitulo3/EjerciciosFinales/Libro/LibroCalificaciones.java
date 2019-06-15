// Fig 3.1: LibroCalificaciones.java
// Declaración de un clase con un método

public class LibroCalificaciones{

	// Nombre del curso para este LibroCalificaciones
	private String nombreDelCurso; //Variable de instancia
	private String instructor; //Nombre del instructor

	//Constructor vacío

	/*public LibroCalificaciones(){

	}*/

	//Constructor con dos parámetros

	public LibroCalificaciones(String curso, String profesor){

		nombreDelCurso = curso;
		instructor = profesor;
	}

	//Método para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombre){
		nombreDelCurso = nombre; // Almacena el nombre del curso en la variable nombre
	} // Fin del método establecerNombreDelCurso

	//Método para obtener el nombre del curso
	public String obtenerNombreDelCurso(){

		return nombreDelCurso;
	} //Fin del método obtener nombre del curso

	// Muestra el mensaje de bienvenida  al usuario de LibroCalificaciones

	//Método para establecer el nombre del instructor
	public void establecerInstructor(String nombre){

		instructor = nombre;
	}//Fin del método para establecer el nombre del instructor

	public String obtenerInstructor(){
		return instructor;
	} //Fin del método obtener nombre del instructor

	public void mostrarMensaje()
	{
		System.out.printf("Bienvenido al Libro de Calificaciones para \n %s! \nEste curso es presentado por: \n %s \n", 
			obtenerNombreDelCurso(), obtenerInstructor() );
		
		//Esta línea manda a llamar al método obtenerNombreDelCurso

	} // Fin del método mostrarMensaje
}// Fin de la clase LibroCalificaciones