# Star Wars: Códigos Secretos (Java)

Minijuego educativo por consola, tipo aventura conversacional, ambientado en el universo de Star Wars. Supera pruebas matemáticas generadas aleatoriamente para infiltrarte en la Estrella de la Muerte y completar la misión.

## Descripción
**Star Wars: Códigos Secretos** está pensado para practicar programación básica en Java (bucles, `switch`, validación de entrada con `Scanner`) y matemáticas (sumatorios, productorios, factoriales, números primos) mediante una historia interactiva con salida en consola, ASCII art y colores ANSI.

## Cómo se juega
- El juego avanza por niveles.
- En cada nivel se plantea un reto matemático y el jugador debe introducir el “código” correcto.
- Si fallas, la misión fracasa. Si superas todos los niveles, ganas.

## Niveles y retos
- Nivel 1: Sumatorio entre dos números (inclusive).
- Nivel 2: Productorio entre dos números (inclusive).
- Nivel 3: Factorial de `N/10` (redondeando hacia abajo).
- Nivel 4: Comprobar si un número es primo (respuesta 1 si es primo, 0 si no).
- Nivel 5: Suma de factoriales (minutos y segundos).

## Requisitos
- Java 11+ (recomendado).
- Consola/terminal compatible con códigos ANSI (para ver colores).

## Ejecución
Compilar y ejecutar desde la raíz del proyecto:

```bash
javac star_wars/Star_wars.java
java star_wars.Star_wars
