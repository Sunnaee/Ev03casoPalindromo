import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class pruebaJavaTest {

    @Test
    void esPalindromo() {
        assertTrue(pruebaJava.esPalindromo(""));
        assertTrue(pruebaJava.esPalindromo("4"));
        assertTrue(pruebaJava.esPalindromo("anitalavalatina"));
        assertFalse(pruebaJava.esPalindromo("anita lava la tina"));
        assertFalse(pruebaJava.esPalindromo("AnItAlAvaLaTiNa"));
        assertTrue(pruebaJava.esPalindromo("aca"));
        assertFalse(pruebaJava.esPalindromo("acas"));
        assertTrue(pruebaJava.esPalindromo("h"));
    }
}