package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class BranchCoverageTestSuite {

    @Test
    public void test1() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        Type actual = Triangle.classify(10, 10, 5);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        Type actual = Triangle.classify(10, 5, 10);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        Type actual = Triangle.classify(5, 10, 10);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void test5() {
        Type actual = Triangle.classify(-1, 10, 5);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test6() {
        Type actual = Triangle.classify(10, -1, 5);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test7() {
        Type actual = Triangle.classify(10, 5, -1);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }


    @Test
    public void test8() {
        Type actual = Triangle.classify(3, 4, 5);
        Type expected = Type.SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void test9() {
        Type actual = Triangle.classify(1, 2, 5);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test10() {
        Type actual = Triangle.classify(5, 2, 1);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test11() {
        Type actual = Triangle.classify(2, 5, 1);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test12() {
        Type actual = Triangle.classify(10, 10, 30);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test13() {
        Type actual = Triangle.classify(10, 30, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test14() {
        Type actual = Triangle.classify(30, 10, 10);
        Type expected = Type.INVALID;
        assertEquals(actual, expected);
    }
}