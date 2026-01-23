// Una librería es un conjunto de clases que nos ayudan a realizar tareas específicas
// Las clases son funciones definidas por otros programadores
// y cualquiera con acceso a ella puede usarla

import java.util.*; // Importa la librería java.util completa (Scanner, arreglos, listas, mapas, etc)

public class App {

    // Se realizará un registro de estudiantes

    public static void main(String[] args) throws Exception { // se define y abre la función main

        // ===============================
        // IMPORTANTE
        // ===============================

        // La función main es el punto de entrada de la aplicación
        // Es decir, es el primer método/función que se ejecuta cuando se inicia el
        // programa
        // Si no existe la función main, el programa no se puede ejecutar
        // En otras palabras "Main" es el corazón y cerebro de un programa

        // Otra cosa que es súper importante es definir las variables antes de usarlas
        // y que tengan un valor inicial. Hay dos modos de inicialización:

        // En línea: int cantidadEstudiantes = 0;
        // se define y se inicializa en una sola línea
        // es la forma más común y recomendada

        // En bloque: int cantidadEstudiantes;
        // cantidadEstudiantes = 0;
        // se define en una línea y se inicializa en otra línea
        // es la forma menos común y no recomendada

        // ===============================
        // VARIABLES SIMPLES
        // ===============================

        int cantidadEstudiantes = 0; // Número de estudiantes
        String nombreCurso = ""; // Nombre del curso
        double sumaCalificaciones = 0; // Para acumular calificaciones
        double promedio = 0; // Para calcular el promedio
        int contador = 0; // Variable de control para bucles

        // ===============================
        // Scanner para leer datos del usuario
        // ===============================

        // Scanner es una clase que permite leer datos desde diferentes fuentes
        // System.in representa la entrada estándar (el teclado)
        // new Scanner(System.in) crea un nuevo objeto Scanner conectado al teclado
        Scanner entrada = new Scanner(System.in);

        // ===============================
        // PEDIR INFORMACIÓN BÁSICA
        // ===============================

        // System.out.print() imprime texto SIN salto de línea al final
        System.out.print("Ingrese el nombre del curso: ");

        // entrada.nextLine() lee una línea completa de texto (hasta que el usuario
        // presiona Enter)
        // y lo asigna a la variable nombreCurso
        nombreCurso = entrada.nextLine();

        System.out.print("Ingrese la cantidad de estudiantes: ");

        // entrada.nextInt() lee un número entero del teclado
        cantidadEstudiantes = entrada.nextInt();

        // entrada.nextLine() se usa aquí para limpiar el buffer
        // Cuando usamos nextInt(), el Enter que el usuario presiona queda en el buffer
        // Este nextLine() consume ese Enter para evitar problemas en las siguientes
        // lecturas
        entrada.nextLine(); // Limpiar buffer del salto de línea

        // ===============================
        // IMPORTANTE - ARREGLOS
        // ===============================

        // Los arreglos son colecciones de datos del mismo tipo
        // Es decir, todos los elementos del arreglo deben ser del mismo tipo
        // Por ejemplo, un arreglo de Strings no puede contener números
        // Y un arreglo de enteros no puede contener Strings
        // Esto se debe a que los arreglos son de tipo estático
        // Es decir, el tipo de dato se define al momento de crear el arreglo
        // Y no se puede cambiar
        // Además, el tamaño del arreglo es fijo y se define en la declaración

        // ===============================
        // ARREGLOS
        // ===============================

        // new String[cantidadEstudiantes] crea un arreglo de Strings
        // con un tamaño igual al valor de cantidadEstudiantes
        // Los índices van de 0 hasta (cantidadEstudiantes - 1)
        String[] nombres = new String[cantidadEstudiantes]; // Arreglo para nombres

        // new int[cantidadEstudiantes] crea un arreglo de enteros
        int[] edades = new int[cantidadEstudiantes]; // Arreglo para edades

        // ===============================
        // IMPORTANTE - COLECCIONES
        // ===============================

        // Las colecciones, por otra parte, son grupos de datos que se pueden modificar
        // Es decir, se pueden agregar, eliminar o modificar elementos
        // Esto se debe a que las colecciones son de tipo dinámico
        // Es decir, su tamaño puede crecer o reducirse según sea necesario
        // A diferencia de los arreglos, las colecciones son más flexibles

        // Existen varios tipos de colecciones:
        // List: es una lista ordenada que permite duplicados, similar a una lista de
        // supermercado
        // Set: es un conjunto que NO permite duplicados, similar a un conjunto de
        // amigos únicos
        // Map: es un mapa de pares clave-valor, similar a un diccionario
        // HashSet: implementación de Set con elementos únicos sin orden específico
        // HashMap: implementación de Map con pares clave-valor únicos
        // ArrayList: implementación de List que permite duplicados y acceso por índice

        // ===============================
        // COLECCIONES
        // ===============================

        // List<Double> indica que es una lista que solo puede contener valores Double
        // new ArrayList<>() crea una nueva lista vacía (los <> se dejan vacíos por
        // inferencia de tipos)
        List<Double> calificaciones = new ArrayList<>(); // Lista de calificaciones (permite duplicados)

        // Set<String> indica que es un conjunto que solo puede contener Strings
        // HashSet no permite duplicados, si intentas agregar un nombre repetido, lo
        // ignora
        Set<String> nombresUnicos = new HashSet<>(); // Conjunto de nombres únicos (sin duplicados)

        // Map<String, Double> indica pares donde la clave es String y el valor es
        // Double
        // Es como un diccionario: cada nombre (clave) tiene asociada una calificación
        // (valor)
        Map<String, Double> mapaEstudiantes = new HashMap<>(); // Mapa: nombre -> calificación

        // ===============================
        // IMPORTANTE - BUCLE FOR
        // ===============================

        // El bucle for es un bucle que se ejecuta un número finito de veces
        // Es decir, se ejecuta un número determinado de veces
        // Es útil cuando sabemos exactamente cuántas iteraciones necesitamos
        // Consta de tres partes: inicialización, condición y actualización
        // Sintaxis: for (inicialización; condición; actualización) { código }

        // ===============================
        // BUCLE FOR PARA INGRESAR DATOS
        // ===============================

        // for (int i = 0; i < cantidadEstudiantes; i++)
        // int i = 0 → inicializa el contador en 0
        // i < cantidadEstudiantes → condición: mientras i sea menor que
        // cantidadEstudiantes
        // i++ → incrementa i en 1 después de cada iteración (equivale a i = i + 1)
        for (int i = 0; i < cantidadEstudiantes; i++) {

            // (i + 1) se usa para mostrar números desde 1 en lugar de 0 (más natural para
            // el usuario)
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");

            System.out.print("Ingrese el nombre: ");

            // nombres[i] accede a la posición i del arreglo
            // [0] es el primer elemento, [1] el segundo, etc.
            nombres[i] = entrada.nextLine();

            System.out.print("Ingrese la edad: ");
            edades[i] = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            System.out.print("Ingrese la calificación: ");
            double calificacion = entrada.nextDouble();
            entrada.nextLine(); // Limpiar buffer

            // Guardar datos en colecciones

            // .add() es un método que agrega un elemento al final de la lista
            calificaciones.add(calificacion); // Agregar a la lista

            // .put(clave, valor) es un método que agrega un par clave-valor al mapa
            // Si la clave ya existe, reemplaza el valor anterior
            mapaEstudiantes.put(nombres[i], calificacion); // Agregar al mapa

            // .add() en un Set agrega el elemento solo si no existe
            // Si el nombre ya existe, no lo agrega de nuevo
            nombresUnicos.add(nombres[i]); // Agregar al conjunto
        }

        // ===============================
        // MOSTRAR NOMBRES DE ESTUDIANTES (FOR-EACH)
        // ===============================

        // En este caso se muestra la lista de nombres
        // usando un bucle for-each (una versión mejorada del bucle for, especial para
        // colecciones y arreglos)
        // que recorre el arreglo de nombres
        // y muestra cada nombre en una línea
        // Sintaxis: for (TipoDato variable : colección) { código }

        System.out.println("\n=== Lista de nombres ===");

        // for (String nombre : nombres)
        // En cada iteración, la variable "nombre" toma el valor del siguiente elemento
        // del arreglo
        // No necesitas usar índices como [0], [1], etc.
        // Es más simple y legible cuando solo necesitas leer los elementos
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        // ===============================
        // IMPORTANTE - BUCLE WHILE
        // ===============================

        // Los ciclos while son bucles que se ejecutan
        // mientras se cumpla una condición
        // Es decir, se ejecutan repetidamente hasta que la condición sea falsa
        // Esto se debe a que los ciclos while son de tipo dinámico
        // Es decir, el número de veces que se ejecutan depende de la condición
        // Se evalúa la condición ANTES de ejecutar el código
        // Si la condición es falsa desde el inicio, el código nunca se ejecuta

        // ===============================
        // CALCULAR PROMEDIO (WHILE)
        // ===============================
        contador = 0;
        sumaCalificaciones = 0;

        // while (condición) → mientras la condición sea verdadera, ejecuta el código
        // calificaciones.size() devuelve el número de elementos en la lista
        while (contador < calificaciones.size()) {

            // calificaciones.get(contador) obtiene el elemento en la posición "contador"
            // Es similar a calificaciones[contador] en un arreglo
            // += es un operador de asignación compuesto: sumaCalificaciones += x es igual a
            // sumaCalificaciones = sumaCalificaciones + x
            sumaCalificaciones += calificaciones.get(contador);

            // contador++ incrementa el contador en 1
            contador++;
        }

        // Calcula el promedio dividiendo la suma entre el total de elementos
        promedio = sumaCalificaciones / calificaciones.size();
        System.out.println("\nPromedio del curso " + nombreCurso + ": " + promedio);

        // ===============================
        // IMPORTANTE - BUCLE DO-WHILE
        // ===============================

        // Los ciclos do-while son bucles que se ejecutan
        // mientras se cumpla una condición
        // Es decir, se ejecutan repetidamente hasta que la condición sea falsa
        // Esto se debe a que los ciclos do-while son de tipo dinámico
        // Es decir, el número de veces que se ejecutan depende de la condición

        // La diferencia entre while y do-while es que:
        // do-while se ejecuta al menos una vez (evalúa la condición DESPUÉS)
        // mientras que while puede no ejecutarse nunca (evalúa la condición ANTES)

        // Sintaxis:
        // do {
        // código que se ejecuta al menos una vez
        // } while (condición);

        // ===============================
        // ESTUDIANTES CON CALIFICACIÓN MAYOR AL PROMEDIO (DO-WHILE)
        // ===============================
        System.out.println("\n=== Estudiantes con calificación mayor al promedio ===");
        contador = 0;

        // do → ejecuta el código al menos una vez
        do {
            // Compara la calificación del estudiante actual con el promedio
            if (calificaciones.get(contador) > promedio) {
                System.out.println(nombres[contador] + ": " + calificaciones.get(contador));
            }
            contador++;
        } while (contador < calificaciones.size()); // while → evalúa la condición DESPUÉS de ejecutar

        // ===============================
        // APROBADO O REPROBADO (IF-ELSE)
        // ===============================

        // La estructura if-else permite tomar decisiones
        // if (condición) → si la condición es verdadera, ejecuta el bloque if
        // else → si la condición es falsa, ejecuta el bloque else

        System.out.println("\n=== Estado de cada estudiante ===");

        for (int i = 0; i < cantidadEstudiantes; i++) {
            double cal = calificaciones.get(i);

            // >= es el operador "mayor o igual que"
            if (cal >= 70) {
                System.out.println(nombres[i] + " está aprobado.");
            } else {
                System.out.println(nombres[i] + " está reprobado.");
            }
        }

        // ===============================
        // COMENTARIO SEGÚN CALIFICACIÓN DEL PRIMER ESTUDIANTE (SWITCH)
        // ===============================

        // La estructura switch permite evaluar múltiples casos
        // Es más limpia que múltiples if-else cuando se compara una variable con varios
        // valores
        // La sintaxis moderna de Java permite usar -> en lugar de break

        System.out.println("\n=== Comentario del primer estudiante ===");

        // Primero obtenemos el Double de la lista
        // Luego usamos .intValue() que es un método de la clase Double
        // que convierte el valor Double a int, eliminando los decimales
        // Por ejemplo: 85.5 se convierte en 85
        int calPrimerEstudiante = calificaciones.get(0).intValue();

        // switch (variable) evalúa el valor de la variable
        // calPrimerEstudiante / 10 divide la calificación entre 10
        // Por ejemplo: 95 / 10 = 9, 85 / 10 = 8, 72 / 10 = 7
        // Esto convierte cualquier calificación en un dígito del 0 al 10
        switch (calPrimerEstudiante / 10) {

            // case 10, 9 → si el resultado es 10 o 9 (calificaciones de 90-100)
            // -> es la sintaxis moderna que reemplaza : y break
            case 10, 9 -> System.out.println("Excelente!");

            // case 8 → si el resultado es 8 (calificaciones de 80-89)
            case 8 -> System.out.println("Muy bien");

            case 7 -> System.out.println("Bien");

            case 6 -> System.out.println("Regular");

            // default → se ejecuta si ningún caso coincide (calificaciones menores a 60)
            default -> System.out.println("Necesita mejorar");
        }

        // ===============================
        // MOSTRAR MAPA DE ESTUDIANTES Y CALIFICACIONES
        // ===============================

        // Recorremos el mapa usando entrySet()
        // entrySet() devuelve un conjunto de todas las entradas (pares clave-valor) del
        // mapa
        // Cada entrada contiene una clave (nombre) y un valor (calificación)

        System.out.println("\n=== Mapa de estudiantes y calificaciones ===");

        // Map.Entry<String, Double> representa cada par clave-valor del mapa
        // entradaMapa es la variable que toma cada entrada en cada iteración
        // mapaEstudiantes.entrySet() devuelve todas las entradas del mapa
        for (Map.Entry<String, Double> entradaMapa : mapaEstudiantes.entrySet()) {

            // .getKey() obtiene la clave (el nombre del estudiante)
            // .getValue() obtiene el valor (la calificación del estudiante)
            // -> es solo texto decorativo para mostrar la relación entre clave y valor
            System.out.println(entradaMapa.getKey() + " -> " + entradaMapa.getValue());
        }

        // ===============================
        // CERRAR RECURSOS
        // ===============================

        // entrada.close() cierra el objeto Scanner
        // Esto libera los recursos del sistema que estaba usando
        // Es una buena práctica cerrar siempre los recursos cuando ya no los necesitas
        entrada.close();

        System.out.println("\n¡Programa finalizado correctamente!");
    }
}