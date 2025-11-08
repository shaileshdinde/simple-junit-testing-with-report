package in.shdinde;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class SubtractionTests {
    // Create the test case for subtract function
    @Test
    public void testSub1() {
        App app = new App();
        assertEquals(-1, app.subtract(2, 3));
    }

    @Test
    public void testSub2() {
        App app = new App();
        assertEquals(-3, app.subtract(-2, 1));
    }

    @Test
    public void testSub3() {
        App app = new App();
        assertEquals(0, app.subtract(0, 0));
    }

}
