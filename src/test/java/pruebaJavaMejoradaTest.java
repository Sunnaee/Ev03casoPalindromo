import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pruebaJavaMejoradaTest {

    @Test
    void esPalindromo() {
        assertFalse(pruebaJavaMejorada.esPalindromo("200"));
        assertTrue(pruebaJavaMejorada.esPalindromo(""));
        assertTrue(pruebaJavaMejorada.esPalindromo("aaabccbaaa"));
        assertFalse(pruebaJavaMejorada.esPalindromo("ahabccbaaa"));
        assertTrue(pruebaJavaMejorada.esPalindromo("La tele letal"));
    }
}