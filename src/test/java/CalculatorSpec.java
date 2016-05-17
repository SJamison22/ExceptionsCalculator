import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 5/17/16.
 */
public class CalculatorSpec {

    @Test
    public void addTest(){
        Calculator calc = new Calculator();
        int expected = 4;
        int actual = calc.add(2,2);
        assertEquals("2+2 should be equal to four",expected,actual);
    }

    @Test
    public void subtractTest(){
        Calculator calc = new Calculator();
        int expected = 6;
        int actual = calc.subtract(8,2);
        assertEquals("8-2 should be equal to six",expected,actual);
    }

    @Test
    public void multiplyTest(){
        Calculator calc = new Calculator();
        int expected = 8;
        int actual = calc.mulitply(4,2);
        assertEquals("4x2 should be equal to eight",expected,actual);
    }

    @Test
    public void divideTest(){
        Calculator calc = new Calculator();
        double expected = 4;
        double actual = 0;
        try {
            actual = calc.divideWithException(8,2);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
        assertEquals("8/2 should be equal to four",expected,actual,.01);
    }

    @Test
    public void divideByZeroTest(){
        Calculator calc = new Calculator();
        String expected = "Exception thrown";
        String actual = "";
        try {
            calc.divideWithException(8,0);
        } catch (DivisionByZeroException e) {
            actual = "Exception thrown";
        }
        assertEquals(expected,actual);
    }

    @Test
    public void squareRootTest(){
        Calculator calc = new Calculator();
        double expected = 3;
        double actual = 0;
        try {
            actual = calc.squareRootWithException(9);
        } catch (ComplexNumberException e) {
            e.printStackTrace();
        }
        assertEquals("Square root of 9 should be 3",expected,actual,.01);
    }

    @Test
    public void squareRootComplexTest(){
        Calculator calc = new Calculator();
        String expected = "Exception thrown";
        String actual = "";
        try {
            calc.squareRootWithException(-1);
        } catch (ComplexNumberException e) {
            actual = "Exception thrown";
        }
        assertEquals(expected,actual);
    }
}
