# Evidencia03 - Actividad en clase: Caso palíndromo
###### Integrantes: David Baez - Martin Carrasco - Emilio Jaramillo - Sabrina López
***
- Paso 1:
    - ¿Qué hace el método?

    Lo que hace el método es recibir un string y comprueba que es un palíndromo.
    
    - ¿Cómo lo hace?

    Primero la función requiere el parámetro cadena, la primera línea de la función inicializa la variable resultado
    como un string vacío. Luego, esa variable almacena el parámetro cadena iterada mediante las funciones
    split, reverse y join, las cuales realizan la separación de los caracteres, invierte su orden y posteriormente los 
    une en una string. Finalmente, comprueba si resultado y cadena son iguales y 
    del mismo tipo de dato, devolviendo verdadero o falso.

    - ¿Cómo lo uso?
    
    Primero se llama a la función ingresando el parámetro, y devuelve si lo ingresada corresponde,
    o no, a un palíndromo. Para visualizar el resultado se debe crear otra función que imprima el resultado de esta por
    consola.

- Paso 2:

  public static boolean esPalindromo(String cadena) {
  String resultado = "";
  for (int i = 0; i < cadena.length(); i++) {
  resultado += cadena.charAt(cadena.length() - i-1);
  }
  return resultado.equals(cadena);
  }

- Paso 3:
    - Las 5 pruebas que se decidieron realizar son:
  1. String vacío. = True
  2. String de número entero. = True
  3. String sin espacios. = True
  4. String con espacios. = False
  5. String con mayúsculas intercaladas. = False

  - 2.3
  1. "aca" = True
  2. "acas" = False
  3. "h" = True

- Paso 4:
- Paso 5: