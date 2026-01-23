public class Ciclos {

  public static void main(String[] args) {

    // ================================================================
    // CICLOS (ESTRUCTURAS REPETITIVAS)
    // ================================================================
    // ¿Qué son los ciclos?
    // Los ciclos son estructuras que permiten repetir un bloque de código
    // varias veces, sin necesidad de escribir el mismo código una y otra vez.
    //
    // Un ciclo se ejecuta mientras se cumpla una condición.
    // ================================================================


    // ================================================================
    // TIPOS DE CICLOS
    // ================================================================
    // 1. Ciclos definidos (for)
    //    - Se usan cuando SABEMOS cuántas veces se repetirá el ciclo.
    //
    // 2. Ciclos indefinidos (while, do - while)
    //    - Se usan cuando NO sabemos cuántas veces se repetirá el ciclo.
    //    - Normalmente dependen de una condición o de la decisión del usuario.
    // ================================================================


    // ================================================================
    // CICLO FOR (CICLO DEFINIDO)
    // ================================================================
    // El ciclo for tiene tres partes:
    // 1. Inicialización: se ejecuta una sola vez al inicio.
    // 2. Condición: se evalúa antes de cada repetición.
    // 3. Incremento: se ejecuta al final de cada repetición.
    //
    // Mientras la condición sea verdadera, el ciclo se repite.
    // ================================================================

    for (int i = 0; i < 10; i++) {
      // La variable i comienza en 0
      // El ciclo se repite mientras i sea menor que 10
      // En cada vuelta, i aumenta en 1

      System.out.println("i = " + i);
    }


    // ================================================================
    // CICLO WHILE (CICLO INDEFINIDO)
    // ================================================================
    // El ciclo while primero evalúa la condición.
    // Si la condición es verdadera, entra al ciclo.
    // Si la condición es falsa desde el inicio, el ciclo NO se ejecuta.
    // ================================================================

    int j = 0; // Inicializamos la variable antes del ciclo

    while (j < 10) {
      // Mientras j sea menor que 10, el ciclo se repetirá

      System.out.println("j = " + j);

      j++; // Incrementamos la variable para evitar un ciclo infinito
    }


    // ================================================================
    // CICLO DO - WHILE (CICLO INDEFINIDO)
    // ================================================================
    // El ciclo do - while se ejecuta AL MENOS UNA VEZ,
    // porque la condición se evalúa al final.
    // ================================================================

    int k = 0; // Inicializamos la variable

    do {
      // Este bloque se ejecuta primero,
      // sin importar si la condición es verdadera o falsa

      System.out.println("k = " + k);

      k++; // Incrementamos la variable

    } while (k < 10);
    // La condición se evalúa después de ejecutar el bloque


    // ================================================================
    // EJERCICIO PRÁCTICO
    // ================================================================
    // Instrucciones:
    //
    // Crea un programa que:
    // 1. Use un ciclo for para mostrar los números del 1 al 10.
    // 2. Use un ciclo while para mostrar los números del 10 al 1.
    //
    // Reglas:
    // - No usar funciones adicionales.
    // - No usar estructuras selectivas complejas.
    // - Solo usar variables, ciclos y System.out.println().
    //
    // El objetivo es entender cómo cambia el comportamiento
    // dependiendo del tipo de ciclo utilizado.
    // ================================================================

  }

}
