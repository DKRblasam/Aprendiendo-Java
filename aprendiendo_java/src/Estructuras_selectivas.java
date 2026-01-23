

public class Estructuras_selectivas {

  public static void main(String[] args) {

    // ================================================================
    // ESTRUCTURAS SELECTIVAS
    // ================================================================
    // ¿Qué son las estructuras selectivas?
    // Las estructuras selectivas son aquellas que permiten al programa
    // tomar decisiones en base a una condición.
    //
    // Es decir, el programa evalúa una condición:
    // - Si la condición se cumple, ejecuta un bloque de código.
    // - Si no se cumple, ejecuta otro bloque (dependiendo del tipo).
    // ================================================================


    // ================================================================
    // TIPOS DE ESTRUCTURAS SELECTIVAS
    // ================================================================
    // 1. Estructuras selectivas simples (if)
    // 2. Estructuras selectivas dobles (if - else)
    // 3. Estructuras selectivas múltiples (switch)
    // ================================================================


    // ================================================================
    // ESTRUCTURA SELECTIVA SIMPLE (IF)
    // ================================================================
    // La estructura if se usa cuando queremos que el programa
    // ejecute una acción SOLO si una condición es verdadera.
    // ================================================================

    int numero = 10; // Declaramos una variable entera

    // El if evalúa la condición:
    // ¿El número es mayor que 0?
    if (numero > 0) { // condición
      System.out.println("El número es positivo");
    }


    // ================================================================
    // ESTRUCTURA SELECTIVA DOBLE (IF - ELSE)
    // ================================================================
    // La estructura if - else se usa cuando queremos dos caminos:
    // - Uno si la condición es verdadera
    // - Otro si la condición es falsa
    // ================================================================

    numero = -10; // Cambiamos el valor de la variable

    // Si el número es mayor que 0, se ejecuta el if
    // Si no, se ejecuta el else
    if (numero > 0) { // condición
      System.out.println("El número es positivo");
    } else {
      System.out.println("El número es negativo");
    }


    // ================================================================
    // ESTRUCTURA SELECTIVA MÚLTIPLE (SWITCH)
    // ================================================================
    // La estructura switch se usa cuando tenemos varias opciones posibles
    // y queremos ejecutar un bloque dependiendo del valor de una variable.
    // ================================================================

    int op = 2; // Variable que controla la opción elegida

    // El switch evalúa el valor de la variable "op"
    switch (op) { // condición

      case 1: // Caso cuando op vale 1
        System.out.println("Opción 1");
        break; // Sale del switch

      case 2: // Caso cuando op vale 2
        System.out.println("Opción 2");
        break; // Sale del switch

      default:
        // Este caso se ejecuta cuando ningún case coincide
        System.out.println("Opción por defecto");
        break;
    }


    // ================================================================
    // EJERCICIO PRÁCTICO 
    // ================================================================
    // Instrucciones:
    //
    // Crea un programa que:
    // 1. Pida al usuario un número entero.
    // 2. Usando estructuras selectivas:
    //    - Si el número es mayor que 0, mostrar un mensaje indicando
    //      que el número es positivo.
    //    - Si el número es igual a 0, mostrar un mensaje indicando
    //      que el número es neutro.
    //    - Si el número es menor que 0, mostrar un mensaje indicando
    //      que el número es negativo.
    //
    // Reglas:
    // - No usar ciclos.
    // - No usar funciones adicionales.
    // - Solo usar Scanner, variables y estructuras selectivas.
    // ================================================================

  }

}
