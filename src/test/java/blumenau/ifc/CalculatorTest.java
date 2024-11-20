package blumenau.ifc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3)); // Correto
        assertEquals(7, calculator.add(4, 2)); // Vai falhar, mas sem mensagem explicativa
        assertEquals(10, calculator.add(5, 5));
        assertEquals(calculator.add(2,2), 5);
        assertEquals(calculator.add(2,2), calculator.add(3, 6));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3)); // Correto
        assertEquals(3, calculator.subtract(8, 5)); // Vai falhar, mas sem mensagem explicativa
        assertEquals(1, calculator.subtract(10, 9));
        assertNotEquals(1, 2);
        assertTrue(20 > 2);
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3)); // Correto
        assertEquals(1, calculator.divide(5, 0)); // Vai falhar (divisão por zero), mas sem mensagem descritiva
        assertFalse(20 < 2, "alal");
    }
}
