import java.util.*;


// Solo copia public static void main(String[] args)

// Aqui van las importaciones simepre, estas van
// afuera y antes de la clase

public class Colecion_arreglos {

  public static void main(String[] args) {

    // ================================================================
    // ARREGLOS Y COLECCIONES
    // ================================================================
    // Tanto los arreglos como las colecciones se usan para almacenar
    // varios datos en una sola variable.
    //
    // A estas estructuras también se les conoce como:
    // - Variables multiespacio
    // - Estructuras de datos
    // ================================================================

    // ================================================================
    // ARREGLOS (ARRAYS)
    // ================================================================
    // ¿Qué es un arreglo?
    // Un arreglo es una estructura que permite almacenar varios datos
    // del MISMO tipo en una sola variable.
    //
    // Los arreglos tienen tamaño fijo.
    // Esto significa que una vez creado el arreglo,
    // NO se puede cambiar su tamaño.
    // ================================================================

    // ================================================================
    // DECLARACIÓN DE UN ARREGLO
    // ================================================================
    // Forma general:
    // tipoDeDato[] nombreArreglo = new tipoDeDato[tamaño];
    // ================================================================

    int[] numeros = new int[5];
    // Este arreglo puede almacenar 5 números enteros.
    // Las posiciones del arreglo van desde 0 hasta 4.

    // ================================================================
    // ASIGNACIÓN DE VALORES A UN ARREGLO
    // ================================================================
    // Cada valor se guarda en una posición específica.
    // A estas posiciones se les llama índices.
    // ================================================================

    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;

    // ================================================================
    // ACCESO A LOS VALORES DE UN ARREGLO
    // ================================================================
    // Para acceder a un valor, se indica el nombre del arreglo
    // y la posición entre corchetes.
    // ================================================================

    System.out.println("Primer valor del arreglo: " + numeros[0]);
    System.out.println("Último valor del arreglo: " + numeros[4]);

    // ================================================================
    // TAMAÑO DE UN ARREGLO
    // ================================================================
    // La propiedad length indica cuántos elementos tiene el arreglo.
    // ================================================================

    System.out.println("Tamaño del arreglo: " + numeros.length);

    // ================================================================
    // ACTIVIDAD PRÁCTICA (ARREGLOS)
    // ================================================================
    // Instrucciones:
    //
    // 1. Crea un arreglo de tipo int con tamaño 5.
    // 2. Pide al usuario que ingrese 5 números enteros.
    // 3. Guarda cada número en una posición del arreglo.
    // 4. Muestra en pantalla todos los valores almacenados.
    //
    // Reglas:
    // - No usar ciclos avanzados.
    // - No usar colecciones.
    // - Solo usar arreglos, Scanner y ciclos básicos.
    // ================================================================



    // --------------------------------------------------------------------------




    // ================================================================
    // COLECCIONES
    // ================================================================
    // ¿Qué son las colecciones?
    // Las colecciones son estructuras de datos que permiten
    // almacenar varios elementos, pero a diferencia de los arreglos:
    //
    // - NO tienen tamaño fijo.
    // - Pueden crecer o disminuir dinámicamente.
    //
    // Las colecciones más comunes son:
    // - ArrayList
    // - LinkedList
    // - HashSet
    //
    // En este ejemplo usaremos ArrayList.
    // ================================================================

    // ================================================================
    // ARRAYLIST
    // ================================================================
    // ArrayList es una colección que almacena datos de forma ordenada.
    // Puede crecer automáticamente conforme se agregan elementos.
    // ================================================================

    // ================================================================
    // DECLARACIÓN DE UN ARRAYLIST
    // ================================================================
    // Forma general:
    // ArrayList<TipoDeDato> nombre = new ArrayList<TipoDeDato>();
    // ================================================================

    ArrayList<String> nombres = new ArrayList<String>();

    // ================================================================
    // AGREGAR ELEMENTOS A UN ARRAYLIST
    // ================================================================
    // Se utiliza el método add().
    // ================================================================

    nombres.add("Ana");
    nombres.add("Luis");
    nombres.add("Carlos");

    // ================================================================
    // ACCEDER A ELEMENTOS DE UN ARRAYLIST
    // ================================================================
    // Se utiliza el método get(posición).
    // ================================================================

    System.out.println("Primer nombre: " + nombres.get(0));

    // ================================================================
    // TAMAÑO DE UN ARRAYLIST
    // ================================================================
    // Se utiliza el método size().
    // ================================================================

    System.out.println("Cantidad de nombres: " + nombres.size());

    // ================================================================
    // ACTIVIDAD PRÁCTICA (COLECCIONES)
    // ================================================================
    // Instrucciones:
    //
    // 1. Crea un ArrayList de tipo String.
    // 2. Pide al usuario que ingrese nombres.
    // 3. Cada nombre debe agregarse a la colección.
    // 4. El programa debe preguntar al usuario si desea
    // seguir ingresando nombres.
    // 5. Al final, mostrar todos los nombres almacenados.
    //
    // Reglas:
    // - No usar métodos avanzados.
    // - No usar funciones adicionales.
    // - Solo usar Scanner, ArrayList y ciclos básicos.
    // ================================================================

  }

}
