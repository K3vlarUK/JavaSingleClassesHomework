import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(5.0, calculator.add(2.0,3.0));
    }

    @Test
    public void testSubtract(){
        assertEquals(5.0, calculator.subtract(10.0,5.0));
    }

    @Test
    public void testMultiply(){
        assertEquals(15.0, calculator.multiply(3.0, 5.0));
    }

    @Test
    public void testDivide(){
        assertEquals(3.0, calculator.divide(9.0, 3.0));
    }
}
