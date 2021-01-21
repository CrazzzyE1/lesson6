import java.util.Arrays;

public class MyFunctionClass {

    public static int[] fromFourToEndArray(int[] array) {
        int startRange = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) startRange = i + 1;
        }
        if (startRange == 0) throw new RuntimeException("4 not found");
        return Arrays.copyOfRange(array, startRange, array.length);
    }

    public static boolean oneAndFourChecker(int[] array) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) one = true;
            if (array[i] == 4) four = true;
        }
        return one && four;
    }
}
