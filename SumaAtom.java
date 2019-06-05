import java.util.Scanner; //Importa la biblioteca java.util

public class SumaAtom {

    //Método main comienza la ejecución de la aplicacion
    public static void main(String[] args)
    {
        //Crea el objeto Scanner para obtener información del usuario
        Scanner entrada = new Scanner(System.in);

        // Declaramos las variables numero1, numero2, suma

        int numero1, numero2, suma;

        // Solicitamos al usuario que escriba el primer número
        System.out.print("Escriba el primer número: ");
        numero1 = entrada.nextInt(); // Lee el primer número

        //Solicitamos al usuario que escriba el segundo número
        System.out.print("Escriba el segundo número: ");
        numero2 = entrada.nextInt(); //Lee el segundo número

        //suma = numero1 + numero2; //Suma los números proporcionados

        System.out.printf("La suma es %d\n", (numero1 + numero2)); //Muestra la suma

    } //Fin del método main
} //Fin de la clase Suma
