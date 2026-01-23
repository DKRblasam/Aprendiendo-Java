import java.util.*;


// Solo copia public static void main(String[] args)

// Aqui van las importaciones simepre, estas van
// afuera y antes de la clase

public class Variables {


  public static void main(String[] args) {
    

    // Declaracion de variables
    // Que son variables?
    // Variables son contenedores que almacenan datos

    // Los tipos de variables son:
    // 1. Variables de instancia (variables que todavia no hemos visto)
    // 2. Variables de clase (variables que tampoco hemos visto)
    // 3. Variables locales (variables que pertenecen al metodo/funcion)

    // Tipos de variables
    // 1. Variables primitivas (variables que almacenan datos)
    // 2. Variables de referencia (variables que almacenan referencias a objetos)

    // Tipos de variables primitivas
    // 1. Variables enteras (int, long, short, byte)
    // 2. Variables decimales (float, double)
    // 3. Variables booleanas (boolean)
    // 4. Variables caracteres (char)
    // 5. Variables multi-espacio (Arreglos, colecciones, vectores,etc)

    int a = 0; // Soempre se inicializan las variables (no lo enseo la maestra)
    
    int b;
    b = 1; // forma 2

    // puedes escribir como sout y usas auto complete
    System.out.println("a = " + a);
    System.out.println("b = " + b);




    // Para ingresar datos desde el teclado
    // se usa algo llamado Scanner, es una clase que nos permite
    // leer datos desde el teclado, es como un microfono
    // para escuchar lo que el usuario digita


    // Scanner es un objeto
    // que es un objeto?
    // un objeto es una instancia de una clase
    // es decir, es un ejemplo concreto de una clase
    // por ejemplo, si la clase es perro, un objeto sería un perro concreto
    // un perro puede ser blanco, negro, etc

    // entonces Scanner es un objeto
    // y System.in es un elemento de entrada, que puede leer datos,
    // es decir, puede saber lo que el usuario digita en la consola
    // usando el teclado 


    // Para poder usarlo es importante agregar la libreria util
    // esta es una libreria nativa de java

    // ================================================================
    // Para declararlo se hace de la siguiente manera
    
    // se declara un nuevo objeto Scanner
    // le definimos un nombre, en este caso "entrada" y le asignamos
    // System.in, este representa la entrada estándar (el teclado)
    

    // Scanner puede leer y entender diferentes tipos de datos
    // por ejemplo, si el usuario digita un numero entero, Scanner lo entenderá como un entero
    // si el usuario digita un numero decimal, Scanner lo entenderá como un decimal
    // si el usuario digita un texto, Scanner lo entenderá como un texto

    // pero eso no es magia asi nomas, hay que usarlo correctamente
    // para eso se usan metodos o funciones; estos definen el tipo de entrada que espera
    // por ejemplo, si esperamos un entero, usamos nextInt()
    // si esperamos un decimal, usamos nextDouble()
    // si esperamos un texto, usamos nextLine()

    // =============================================================================
    // Ejemplo de uso: Saludo al usuario
    // =============================================================================

    // definimos nuestro Scanner
    Scanner entrada = new Scanner(System.in);

    System.out.println("Hola, bienvenido al programa");
    
    // definimos una variable para almacenar el nombre del usuario
    String  nombre = "";

    // le pedimos al usuario que ingrese su nombre
    System.out.println("Por favor, ingresa tu nombre: ");

    // leemos el nombre que el usuario ingresa, usando nextLine() que es para cadenas
    nombre = entrada.nextLine();


    // imprimimos el nombre del usuario
    System.out.println("Hola " + nombre + ", bienvenido al programa");


    // ==============================
    // Ejercicio practico
    // ==============================


    // Instrucciones:
    // usando lo aprendido: Crea un programa que, dada 
    // una cantidad de horas, minutos y segundos, y convertir todo a segundos totales.
    // solo puedes usar Scanner, variables y operaciones matematicas
    // no puedes usar chatGPT jijo de la guayaba


  }

  
}
