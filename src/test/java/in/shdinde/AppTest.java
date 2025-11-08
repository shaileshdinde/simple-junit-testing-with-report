package in.shdinde;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @BeforeAll
    public static void setUp() {
        System.out.println("Setting up before a test");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Tearing down after a test");
    }

    // Create the test case for add function
    @Test
    public void testAdd1() {
        App app = new App();
        assertEquals(6, app.add(2, 3));
    }

    @Test
    public void testAdd2() {
        App app = new App();
        assertEquals(-1, app.add(-2, 1));
    }

    @Test
    public void testAdd3() {
        App app = new App();
        assertEquals(0, app.add(0, 0));
    }





}
