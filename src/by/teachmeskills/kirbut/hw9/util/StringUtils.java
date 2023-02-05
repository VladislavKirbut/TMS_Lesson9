package by.teachmeskills.kirbut.hw9.util;

public class StringUtils {

    private static final int SPACE = 32;

    /*
     * array - character array whose passed as a parameter
     */
    public static void print(char[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }

    /*
     * array - character array whose passed as a parameter
     */
    public static void println(char[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);

        System.out.print("\n");
    }

    /*
     * array - character array whose passed as a parameter
     * SPACE - static final variable of space symbol
     */
    public static boolean isBlank(char[] array) {
        if (array.length == 0)
            return true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != SPACE)
                return false;
        }

        return true;
    }

    /*
     * array - character array whose passed as a parameter
     */
    public static boolean isRussian(char[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is empty.");

        for (int i = 0; i < array.length; i++)
            if ((array[i] != '¨' && array[i] != '¸') && (array[i] < 'À' || array[i] > 'ÿ'))
                return false;

        return true;
    }

    /*
     * array - character array whose passed as a parameter
     * subarray - subarray whose we look for in array
     */
    public static boolean contains(char[] array, char[] subarray) {
        if (subarray.length > array.length)
            throw new IllegalArgumentException("Subarray more then array. Elements don't match.");

        if (array.length == 0)
            throw new IllegalArgumentException("Array is empty.");

        for (int i = 0; i < array.length - 1; i++) {
            int countOfMatch = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i + j] != array[j]) break;
                else countOfMatch++;
            }
            if (countOfMatch == array.length) return true;
        }

        return false;
    }

    /*
     * array - character array whose passed as a parameter
     */
    public static int parseInt(char[] array) {
        int result = 0;
        int degree = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            int t = array[i] - '0';
            if (t < 0 || t > 9) throw new IllegalArgumentException("It isn't a number!");
            result += t * Math.pow(10, degree);
            degree--;
        }

        return result;
    }
}
