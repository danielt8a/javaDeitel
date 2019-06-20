//Factura.java

public class Factura{

	private String numeroDePieza, descripcionArticulo;
	private int cantidadPiezas;
	private double precioArticulo;

	//Constructor

	public Factura(String pieza, String descripcion, int cantidad, double precio){

		numeroDePieza = pieza;
		descripcionArticulo = descripcion;
		cantidadPiezas = cantidad;
		precioArticulo = precio;

	}

	//Métodos de la variable numeroDePieza

	//Método para establecer el numeroDePieza

	public void establecerNumeroDePieza(String pieza){

		numeroDePieza = pieza;

	}// Fin del método establecerNumeroDePieza

	//Método para obtener el numeroDePieza
	public String obtenerNumeroDePieza(){
		return numeroDePieza;
	} //Fin del método obtenerNumeroDePieza

	//Fin de los métodos de numeroDePieza

	//Métodos para descripcionArticulo

	//Método para establecer la descripciónArticulo

	public void establecerDescripcionArticulo(String descripcion){
		descripcionArticulo = descripcion;
	}//Fin del método establecer la descripciónArticulo

	//Método para obtener la descripción del artículo

	public String obtenerDescripcionArticulo(){
		return descripcionArticulo;
	} //Fin del método obtenerDescripcionArticulo

	//Método para establecer la cantidad

	public void establecerCantidad(int cantidad){
		cantidadPiezas = cantidad;
	}//Fin del método establecerCantidad

	//Método para obtener la cantidad
	public int obtenerCantidad(){
		return cantidadPiezas;
	}//Fin del método obtenerCantidad

	//Método para establecer el precio

	public void establecerPrecio(double precio){
		precioArticulo = precio;

	}

	//Método para obtener el precio de un artículo
	public double obtenerPrecio(){
		return precioArticulo;
	}

	//Método obtener obtenerMontoFactura
	public double obtenerMontoFactura(){

		double montoFactura;

		montoFactura = cantidadPiezas * precioArticulo;

		return montoFactura;
	}





	



}