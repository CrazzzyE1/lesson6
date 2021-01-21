import org.junit.Assert;
import org.junit.Test;

public class MyFunctionClassTest {

    int[] exp1 = {35, 6, 7, 8, 8, 1};
    int[] test1 = {4, 3, 4, 5, 56, 67, 687, 8, 76, -1, 53, 42, 4, 35, 6, 7, 8, 8, 1};
    int[] exp2 = {1, 3};
    int[] test2 = {4, 1, 3};
    int[] exp3 = {};
    int[] test3 = {1, 2, 4};
    int[] test4 = {1, 2, 3};
    int[] test5 = {4, 2, 3};
    int[] test6 = {2, 2, 3};


    @Test
    public void fromFourToEndArrayTest1() {
        int[] act = MyFunctionClass.fromFourToEndArray(test1);
        Assert.assertArrayEquals(exp1, act);
    }

    @Test
    public void fromFourToEndArrayTest2() {
        int[] act = MyFunctionClass.fromFourToEndArray(test2);
        Assert.assertArrayEquals(exp2, act);
    }

    @Test
    public void fromFourToEndArrayTest3() {
        int[] act = MyFunctionClass.fromFourToEndArray(test3);
        Assert.assertArrayEquals(exp3, act);
    }

    @Test(expected = RuntimeException.class)
    public void fromFourToEndArrayTest4() {
        MyFunctionClass.fromFourToEndArray(test4);
    }

    @Test
    public void oneAndFourCheckerTest1(){
        Assert.assertTrue(MyFunctionClass.oneAndFourChecker(test1));
    }
    @Test
    public void oneAndFourCheckerTest2(){
        Assert.assertFalse(MyFunctionClass.oneAndFourChecker(test4));
    }
    @Test
    public void oneAndFourCheckerTest3(){
        Assert.assertFalse(MyFunctionClass.oneAndFourChecker(test5));
    }
    @Test
    public void oneAndFourCheckerTest4(){
        Assert.assertFalse(MyFunctionClass.oneAndFourChecker(test6));
    }

}
