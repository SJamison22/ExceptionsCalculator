import com.sun.org.apache.xpath.internal.operations.Div;

/**
 * Created by stevejaminson on 5/17/16.
 */
public class Calculator {

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int mulitply(int a, int b){
        return a * b;
    }

    public static double divideWithException(int a, int b)
            throws DivisionByZeroException{
        if(b == 0){ throw new DivisionByZeroException();}
        return a / b;
    }

    public static double squareRootWithException(int a)
            throws ComplexNumberException{
        if(a <= -1){throw new ComplexNumberException();}
        return Math.sqrt(a);
    }
}
