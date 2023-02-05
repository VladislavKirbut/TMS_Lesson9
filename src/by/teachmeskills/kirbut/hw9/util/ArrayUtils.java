package by.teachmeskills.kirbut.hw9.util;
import java.util.Scanner;

public class ArrayUtils {

    public static char[] createArray() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().toCharArray();
    }
}