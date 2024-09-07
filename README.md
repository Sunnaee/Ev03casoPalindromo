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

  4.1:
  - Caso 1: Debería de dar problema, ya que, la función solicita un String como parámetro.
  - Caso 2: La función debería de devolver true, ya que, al comparar debería de ser igual.
  - Caso 3: La función debería de devolver true, ya que, es un palíndromo.
  - Caso 4: La función debería de devolver false, ya que, el parámetro entregado no es un palíndromo.
  - Caso 5: La función debería de devolver false, aunque el parámetro sea un palíndromo, ya que, los espacios generan diferencias entre las cadenas de textos comparadas.
  
  4.2:
  - ¿Qué consideraciones tomaron en cuenta?
    
  Se tomaron a consideración los espacios y mayúsculas que era lo que generaba que el programa no considerará una cadena como palindromo.

    - ¿Qué mejoró en su método?
  
  La cadena al ser ingresada en la función con el ".replaceAll("\\\s","")" y ".toLowerCase()", se le quitan los espacios y las mayusculas para comprobar si la cadena es una palindromo.

  - ¿Qué rol jugaron las pruebas en mejorar su código?
  
  Las pruebas nos sirvieron para conocer los problemas y que habia que mejorar en el código.

- Paso 5: En la actividad realizada se analizó una función en JavaScript para después transformarla en Java, posteriormente se probo su funcionamiento por medio de diferentes pruebas unitarias lo que derivo en una función más pulida previniendo ciertos errores. Finalizando con la creación de pruebas de unidad para garantizar su funcionamiento. 

