package cc.nuvu.devops.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

//comentarios para pruebas

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void testAdd() {
        int result = calculatorService.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        int result = calculatorService.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculatorService.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int result = calculatorService.divide(10, 2);
        assertEquals(5, result);
    }
}
