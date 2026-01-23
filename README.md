# Aprendiendo-Java
# 📘 Declaración y Tipos de Variables en Java

## 📌 ¿Qué es una variable?

Una **variable** es un **contenedor que almacena datos** en la memoria del programa.
Su valor puede cambiar durante la ejecución.

---

## 🧩 Tipos de variables según su alcance

En Java existen **tres tipos principales de variables**:

### 1️⃣ Variables de instancia

* Pertenecen a un **objeto**
* Cada objeto tiene su propia copia
* Se definen dentro de una clase, pero fuera de los métodos

### 2️⃣ Variables de clase (estáticas)

* Pertenecen a la **clase**
* Son **compartidas por todos los objetos**
* Se declaran usando la palabra clave `static`

### 3️⃣ Variables locales

* Pertenecen a un **método o función**
* Solo existen dentro de ese bloque
* Se destruyen al finalizar el método

---

## 🧠 Tipos de variables según el tipo de dato

### 🔹 1. Variables primitivas

Almacenan **datos simples directamente**.

#### Tipos primitivos:

* 🔢 **Enteros**: `int`, `long`, `short`, `byte`
* 🔢 **Decimales**: `float`, `double`
* ✅ **Booleanos**: `boolean`
* 🔤 **Caracteres**: `char`

---

### 🔹 2. Variables de referencia

No almacenan el dato directamente, sino una **referencia a un objeto**.

Ejemplos:

* Arreglos
* Colecciones
* Vectores
* Objetos creados con clases

---

## ✍️ Declaración de variables en Java

> ⚠️ **Siempre es recomendable inicializar las variables**

### Forma 1: Declaración e inicialización

```java
int a = 0;
```

### Forma 2: Declarar y luego asignar

```java
int b;
b = 1;
```

---

## 🖨️ Mostrar valores en consola

Puedes usar `System.out.println` (o escribir `sout` y usar el autocompletado del IDE):

```java
System.out.println(a);
System.out.println(b);
```

---

# 📌 Estructuras Selectivas en Java

Las **estructuras selectivas** permiten que un programa **tome decisiones** en función de una condición lógica.
Dependiendo del resultado (verdadero o falso), se ejecuta un bloque de código específico.

---

## 🔹 Tipos de estructuras selectivas

* **Simple:** `if`
* **Doble:** `if - else`
* **Múltiple:** `switch`

---

## 🧠 Importancia de la Indentación

Una **indentación correcta** es esencial para escribir código **profesional, legible y mantenible**.

Beneficios:

* Delimita visualmente los bloques de código
* Mejora la comprensión de la lógica
* Facilita la colaboración en proyectos de equipo
* Reduce errores lógicos y de mantenimiento

> ⚠️ **Nota:** Aunque Java no depende de la indentación para ejecutar el código, la **claridad y profesionalismo** sí lo hacen.

---

## ❌ Ejemplo de mal uso de la indentación

```java
int numero=-5;
if(numero>0){
System.out.println("El número es positivo");
}else{
System.out.println("El número es negativo");
}
```

**Problemas:**

* Bloques de `if` y `else` poco claros
* Difícil de leer y mantener
* Propenso a errores al agregar más código

---

## ✅ Ejemplo de buen uso de la indentación

```java
int numero = -5;

if (numero > 0) {
    System.out.println("El número es positivo");
} else {
    System.out.println("El número es negativo");
}
```

**Ventajas:**

* Bloques claramente delimitados
* Lectura rápida y comprensión inmediata
* Código profesional y fácil de mantener

---

## 💻 Ejemplo: `switch` correctamente indentado

```java
int opcion = 2;

switch (opcion) {
    case 1:
        System.out.println("Opción 1");
        break;

    case 2:
        System.out.println("Opción 2");
        break;

    default:
        System.out.println("Opción por defecto");
        break;
}
```

**Recomendaciones de estilo:**

* Usar nombres de variables descriptivos (`numero`, `opcion`)
* Mantener una línea en blanco entre bloques lógicos para mejorar la lectura
* Aplicar formateo automático del editor (ej. `Shift + Alt + F` en VS Code)

---

✨ **Regla de oro:**

> "Código bien indentado = código profesional y fácil de mantener"

---

# 🔁 Ciclos en Java — Guía para Principiantes Absolutos

---

## 🌱 ¿Qué es un ciclo?

Un **ciclo** es como decirle a la computadora:

> "Haz esto muchas veces sin que tenga que escribirlo cada vez"

💡 **Analogía sencilla:**
Si quieres beber agua 5 veces, en vez de decir "bebo agua" 5 veces, puedes decir:

*"Repite esto 5 veces: beber agua"*

---

## 🧩 Tipos de ciclos

### 1️⃣ Ciclos definidos (`for`)

* Se usan cuando **sabes cuántas veces** quieres repetir algo
* Se repite un **número exacto de veces**

**Ejemplo real:**
Quieres saludar 3 veces:

```java
for (int i = 1; i <= 3; i++) {
    System.out.println("Hola!");
}
```

**Qué pasa paso a paso:**

1. `i = 1` → imprime "Hola!"
2. `i = 2` → imprime "Hola!"
3. `i = 3` → imprime "Hola!"
4. `i = 4` → condición falla → se detiene

✅ **Resultado:**

```
Hola!
Hola!
Hola!
```

---

### 2️⃣ Ciclos indefinidos (`while` y `do-while`)

* Se usan cuando **no sabes cuántas veces** se repetirá algo
* Se repiten mientras **una condición sea verdadera**

💡 **Analogía:**
Preguntas: "¿Quieres seguir jugando?"

* Si dice "sí" → sigues
* Si dice "no" → terminas

---

#### 🔹 Ciclo `while`

```java
int j = 1;
while (j <= 3) {
    System.out.println("Sigo contando: " + j);
    j++; // aumenta j para que el ciclo termine
}
```

**Nota:**

* Primero revisa la condición
* Si es falsa desde el principio, **nunca se ejecuta**

---

#### 🔹 Ciclo `do-while`

```java
int k = 1;
do {
    System.out.println("Java es divertido: " + k);
    k++;
} while (k <= 3);
```

**Nota:**

* Siempre se ejecuta **al menos una vez**, incluso si la condición es falsa al inicio

---

## ✅ Resumen simple

| Ciclo      | Cuándo usarlo                      | Qué revisa primero                      |
|------------|------------------------------------|-----------------------------------------|
| `for`      | Número exacto de repeticiones      | Condición antes de repetir cada vez     |
| `while`    | Número desconocido de repeticiones | Condición antes de repetir              |
| `do-while` | Número desconocido de repeticiones | Ejecuta primero, luego revisa condición |

---

## 📝 Mini ejercicios nivel 0

### Ejercicio 1

Imprime "Hola Mundo" 2 veces usando **for**.

✅ **Respuesta:**

```java
for (int i = 1; i <= 2; i++) {
    System.out.println("Hola Mundo");
}
```

---

### Ejercicio 2

Cuenta del 1 al 4 usando **while**.

✅ **Respuesta:**

```java
int numero = 1;
while (numero <= 4) {
    System.out.println(numero);
    numero++;
}
```

---

### Ejercicio 3

Imprime "Aprendiendo Java" 3 veces usando **do-while**.

✅ **Respuesta:**

```java
int n = 1;
do {
    System.out.println("Aprendiendo Java");
    n++;
} while (n <= 3);
```

---

## 💡 Consejos para principiantes absolutos

1. Siempre verifica que tu ciclo **tenga una condición que termine**, para no quedar atrapado en un ciclo infinito
2. Empieza con **for** si sabes cuántas veces quieres repetir algo
3. Usa **while** o **do-while** si quieres repetir hasta que ocurra algo (por ejemplo, que el usuario diga "no")
4. Imprime valores con `System.out.println()` para **ver qué pasa paso a paso**

---

# 🗃️ Arreglos y Colecciones en Java

---

## 🌟 1️⃣ ARREGLOS — "Casilleros fijos"

💡 **Idea principal:**

* Es como **una fila de casilleros**
* Todos guardan **el mismo tipo de dato**
* Tienen **número de posición (índice)**, que empieza en **0**

---

### 🖼️ Visual:

```
CASILLEROS (Arreglo)
+-----+-----+-----+
|  5  | 10  | 15  |
+-----+-----+-----+
  0     1     2    <-- Índices (posición)
```

* `0` → primer casillero
* `1` → segundo casillero
* `2` → tercer casillero

---

### 💻 Código paso a paso:

```java
int[] numeros = new int[3]; // creo 3 casilleros

numeros[0] = 5;   // llenando primer casillero
numeros[1] = 10;  // llenando segundo casillero
numeros[2] = 15;  // llenando tercer casillero

for (int i = 0; i < 3; i++) {
    System.out.println(numeros[i]);  // mostrar cada casillero
}
```

📌 **Flechas del recorrido del ciclo:**

```
i=0 --> 5
i=1 --> 10
i=2 --> 15
```

✅ **Resultado en consola:**

```
5
10
15
```

---

## 🌟 2️⃣ COLECCIONES — "Mochila mágica"

💡 **Idea principal:**

* Es como **una mochila que puede crecer**
* Puedes **agregar, quitar o ver cosas fácilmente**
* Se guarda **cualquier objeto**, como String, números, etc.

---

### 🖼️ Visual:

```
MOCHILA (ArrayList)
+------------+------------+------------+
| Manzana    | Banana     | Naranja    |
+------------+------------+------------+
      0            1           2       <-- Índices
```

* Primer elemento: `0`
* Segundo elemento: `1`
* Tercer elemento: `2`

---

### 💻 Código paso a paso:

```java
import java.util.ArrayList;

ArrayList<String> frutas = new ArrayList<>();

frutas.add("Manzana");  // agrego primer fruta
frutas.add("Banana");   // agrego segunda fruta
frutas.add("Naranja");  // agrego tercera fruta

for (int i = 0; i < frutas.size(); i++) {
    System.out.println(frutas.get(i));  // mostrar cada fruta
}
```

📌 **Flechas del recorrido del ciclo:**

```
i=0 --> "Manzana"
i=1 --> "Banana"
i=2 --> "Naranja"
```

✅ **Resultado en consola:**

```
Manzana
Banana
Naranja
```

---

## 🧩 Comparación súper visual

```
ARREGLO         COLECCIÓN (ArrayList)
+-----+         +------------+------------+
|  5  |         | Manzana    | Banana     |
+-----+         +------------+------------+
| 10  |         | Naranja    |
+-----+         +------------+
| 15  |
+-----+
```

| Característica | Arreglo            | Colección (ArrayList)          |
|----------------|--------------------|---------------------------------|
| Tamaño         | Fijo               | Dinámico                        |
| Tipo de datos  | Igual (int, char…) | Objetos (String, etc.)          |
| Métodos        | Limitados          | add(), remove(), get(), size()  |
| Analogía       | Casilleros fijos   | Mochila mágica                  |

---

## 📝 Ejercicios ultra simples

### Ejercicio 1 – Arreglo

**Dibujo inicial:**

```
[ ] [ ] [ ]   <-- casilleros vacíos
```

```java
int[] numeros = new int[3];
numeros[0] = 2;
numeros[1] = 4;
numeros[2] = 6;

for (int i = 0; i < 3; i++) {
    System.out.println(numeros[i]);
}
```

✅ **Resultado:**

```
2
4
6
```

---

### Ejercicio 2 – Colección

**Dibujo inicial:**

```
Mochila vacía: [ ]
```

```java
import java.util.ArrayList;

ArrayList<String> frutas = new ArrayList<>();
frutas.add("Manzana");
frutas.add("Uva");
frutas.add("Piña");

for (int i = 0; i < frutas.size(); i++) {
    System.out.println(frutas.get(i));
}
```

✅ **Resultado:**

```
Manzana
Uva
Piña
```

---

## 💡 Consejos visuales nivel 0

1. **Arreglos → fila de casilleros fijos**
   * Usa cuando sabes cuántos elementos necesitas

2. **Colecciones → mochila mágica**
   * Usa cuando necesitas agregar o quitar elementos
   * `.add()` → agregar
   * `.remove()` → quitar
   * `.get(i)` → ver un elemento
   * `.size()` → tamaño actual

3. **Primer elemento = índice 0** siempre

4. **Practica dibujando tus casilleros o mochila en papel** para ver cómo se llena y recorre

---
