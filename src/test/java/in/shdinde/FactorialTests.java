package in.shdinde;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {
    // Create the test case for factorial function
    @Test
    public void testFactorial1() {
        App app = new App();
        assertEquals( 120, app.factorial(5));
    }

    @Test
    public void testFactorial2() {
        App app = new App();
        assertEquals( 0, app.factorial(0));
    }

    @Test
    public void testFactorial3() {
        App app = new App();
        assertEquals( 0, app.factorial(-3));
    }
}
