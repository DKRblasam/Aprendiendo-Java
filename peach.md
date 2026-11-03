
# Exposición - Práctica 13 (palabras clave)

> Detalle completo: [[PR13-Repaso_Details]]

## ▶ Idea en una frase
**Registro de evento universitario** → capturar datos + preguntas sí/no + validar + alerta con resumen.

## 1. Demo de la app (orden)
1. Mostrar la pantalla: título, 3 campos, 3 switches, botón.
2. **Enviar vacío** → *Campos incompletos* (+ lista de faltantes).
3. **Semestre con letras** → *El semestre debe ser un número.*
4. **Datos válidos** + mover switches → *Registro enviado* con Sí/No.

## 2. Componentes usados
- `SafeAreaView` → área segura
- `ScrollView` → scroll / teclado
- `TextInput` → nombre, carrera, semestre
- `Switch` → sí/no (booleano)
- `Pressable` → botón propio
- `Alert` → errores y resumen
- `View` · `Text` · `StyleSheet`

## 3. Estructura (carpetas)
- `components/` → Form · sectionSwch · CustomButton
- `screens/` → register
- `constants/` → styles · themes
- `utils/` → alerts
- Alias `@components`, `@constants`… (`jsconfig.json`)

## 4. Código: qué decir en cada archivo

**App.js**
- `SafeAreaProvider` + `ThemeProvider` → `RegisterScreen`
- Componente con **Mayúscula**

**themes.js**
- Paleta clara/oscura · **Context** · `useTheme()`
- Colores en un solo lugar

**alerts.js**
- `Alert.alert` ≠ web → `Platform.OS === "web"` → `window.alert`

**styles.js**
- `StyleSheet.create` · solo medidas
- Nada de CSS web (`background`, `border: "1px solid"`)

**Form.js**
- Arreglo `fields` + `.map` → sin repetir
- `value` + `onChangeText` → **campo controlado**
- `keyboardType="numeric"` ≠ validación

**sectionSwch.js**
- Arreglo `questions` + `.map`
- `Switch`: `value` + `onValueChange`

**CustomButton.js**
- Props: `title`, `onPress`
- `Pressable` → estilo propio + `pressed`

**register.js** ⭐
- **Estado en la pantalla** (levantar estado)
- `form` y `options` → `useState` con objeto
- `{ ...prev, [key]: value }` → no mutar
- `trim()` → vacío real
- `return` tras cada alerta
- Regex `/^\d+$/` → solo enteros (mejor que `isNaN`)
- `siNo()` → true/false → Sí/No

## 5. Flujo de datos (dibujar en pizarra)
```
RegisterScreen (estado)
  ├─ Forms        ← values / onChange
  ├─ SectionSwch  ← options / onChange
  └─ CustomButton ← onPress = enviarRegistro
```
**Props bajan · eventos suben.**

## 6. Conceptos clave
`props` · `useState` · estado levantado · componente controlado · Context · `.map` + `key` · alias · `Platform`

## 7. Errores que se corrigieron
- `<regScreen />` minúscula → `RegisterScreen`
- `miss.lenght` → `length`
- CSS web en `StyleSheet`
- `window.alert` roto
- `sectionSwch.js` vacío
- Imports sin `export default`

## 8. Preguntas probables
- **¿Por qué el estado está en la pantalla?** → el botón necesita todos los datos.
- **¿Por qué `Pressable` y no `Button`?** → diseño propio y feedback.
- **¿Por qué validar si hay teclado numérico?** → en web se puede escribir texto.
- **¿Por qué regex y no `isNaN`?** → `isNaN` acepta `"1e3"`.
- **¿Por qué `Platform.OS`?** → `Alert.alert` no funciona en web.
- **¿Para qué `SafeAreaProvider`?** → para que `SafeAreaView` sepa el área segura.
- **¿Qué hace `trim()`?** → quita espacios; solo espacios = vacío.
- **¿Qué es `key` en `.map`?** → identifica cada elemento de la lista.
