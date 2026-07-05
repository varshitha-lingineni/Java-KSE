package test.java.com.example;


import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class LocalCalculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class AAATest {

    private LocalCalculator calc;

    @Before
    public void setUp() {
        calc = new LocalCalculator();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testCalculatorAddition() {
        int numberOne = 10;
        int numberTwo = 20;

        int result = calc.add(numberOne, numberTwo);

        assertEquals(30, result);
    }
}
