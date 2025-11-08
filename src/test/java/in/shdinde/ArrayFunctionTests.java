package in.shdinde;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayFunctionTests {
    //Create the test case for sumArray function
    @Test
    public void testSumArray1() {
        App app = new App();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, app.sumArray(arr));
    }

    @Test
    public void testSumArray2() {
        App app = new App();
        int[] arr = {-1, -2, -3, -4, -5};
        assertEquals(-15, app.sumArray(arr));
    }

    @Test
    public void testSumArray3() {
        App app = new App();
        int[] arr = {};
        assertEquals(0, app.sumArray(arr));
    }

    //Add test cases for minimum number from Array function
    @Test
    public void testMinArray1() {
        App app = new App();
        int[] arr = {3, 1, 4, 1, 5, 9};
        assertEquals(1, app.minInArray(arr));
    }

    @Test
    public void testMinArray2() {
        App app = new App();
        int[] arr = {-3, -1, -4, -1, -5, -9};
        assertEquals(-9, app.minInArray(arr));
    }

    //Add test cases for maximum number from Array function
    @Test
    public void testMaxArray1() {
        App app = new App();
        int[] arr = {3, 1, 4, 1, 5, 9};
        assertEquals(9, app.maxInArray(arr));
    }

    @Test
    public void testMaxArray2() {
        App app = new App();
        int[] arr = {-3, -1, -4, -1, -5, -9};
        assertEquals(-1, app.maxInArray(arr));
    }

}
