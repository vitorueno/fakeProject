package blumenau.ifc;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    void testAsserts() {
        // Dados de exemplo
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        String str1 = "Hello";
        String str2 = "World";
        String sameString = str1;
        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("A", "B", "C");
        List<String> listWithPattern = List.of("Test123", "Hello456");

        // ASSERT_ALL
        assertAll("Grouped assertions",
                () -> assertEquals(5, 2 + 3),
                () -> assertNotNull(str1)
        );

        // ASSERT_ARRAY_EQUALS
        assertArrayEquals(array1, array2);

        // ASSERT_EQUALS
        assertEquals("Hello", str1);

        // ASSERT_DOES_NOT_THROW
        assertDoesNotThrow(() -> Integer.parseInt("123"));

        // ASSERT_FALSE
        assertFalse(str1.isEmpty());

        // ASSERT_ITERABLE_EQUALS
        assertIterableEquals(list1, list2);

        // ASSERT_LINES_MATCH
        assertLinesMatch(List.of("Test\\d+", "Hello\\d+"), listWithPattern);

        // ASSERT_NOT_EQUALS
        assertNotEquals(str1, str2);

        // ASSERT_NOT_NULL
        assertNotNull(str2);

        // ASSERT_NOT_SAME
        assertNotSame(str1, str2);

        // ASSERT_INSTANCE_OF
//        assertInstanceOf(String.class, str1);

        // ASSERT_NULL
        String nullString = null;
        assertNull(nullString);

        // ASSERT_SAME
        assertSame(str1, sameString);

        // ASSERT_THROWS
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("NaN"));

        // ASSERT_THROWS_EXACTLY
//        assertThrowsExactly(NumberFormatException.class, () -> Integer.parseInt("NaN"));

        // ASSERT_TIMEOUT
        assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(500));

        // ASSERT_TIMEOUT_PREEMPTIVELY
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> Thread.sleep(500));

        // ASSERT_TRUE
        assertTrue(str1.startsWith("H"));

        // FAIL
        if (false) {
            fail("This should not happen!");
        }
    }

}
