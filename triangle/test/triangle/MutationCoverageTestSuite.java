package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class MutationCoverageTestSuite {

    @Test
    public void test1() {
        Type actual = Triangle.classify(0, 0, 0);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        Type actual = Triangle.classify(1, 1, 1);
        Type expected = Type.EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        Type actual = Triangle.classify(0, 10, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        Type actual = Triangle.classify(-1, 10, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test5() {
        Type actual = Triangle.classify(10, 0, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test6() {
        Type actual = Triangle.classify(10, 10, 0);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test7() {
        Type actual = Triangle.classify(10, -1, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test8() {
        Type actual = Triangle.classify(10, 10, -1);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test9() {
        Type actual = Triangle.classify(3, 4, 7);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test10() {
        Type actual = Triangle.classify(7, 4, 3);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test11() {
        Type actual = Triangle.classify(3, 7, 4);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test12() {
        Type actual = Triangle.classify(3, 5, 4);
        Type expected = Type.SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void test13() {
        Type actual = Triangle.classify(10, 10, 20);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test14() {
        Type actual = Triangle.classify(10, 20, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test15() {
        Type actual = Triangle.classify(20, 10, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test16() {
        Type actual = Triangle.classify(-1, -1, 5);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }
}