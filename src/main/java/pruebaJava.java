public class pruebaJava {
    public static void main(String[] args) {
    }

    public static boolean esPalindromo(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            resultado += cadena.charAt(cadena.length() - i-1);
        }
        return resultado.equals(cadena);
    }
}
