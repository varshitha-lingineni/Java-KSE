import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

   
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        
       
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(2, -3));
    }

    
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        
        // When dealing with doubles/floats, add a third parameter (delta) for decimal precision tolerance
        assertEquals(2.5, calc.divide(5, 2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroThrowsException() {
        Calculator calc = new Calculator();
        
        calc.divide(10, 0);
    }
}

