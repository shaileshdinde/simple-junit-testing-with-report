package in.shdinde;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void addTestCase1(){
        App app = new App();
        int actualResult = app.add(2, 3);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void addTestCase2(){
        App app = new App();
        int actualResult = app.add(-20, 3);
        int expectedResult = -17;
        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testFactorial1(){
        App app = new App();
        int actualResult = app.factorial(5);
        int expectedResult = 121;
        Assertions.assertEquals(expectedResult,actualResult,"Factorial is not match with expected result");
    }
}
