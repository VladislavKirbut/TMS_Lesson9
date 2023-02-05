package by.teachmeskills.kirbut.hw9;

import by.teachmeskills.kirbut.hw9.util.*;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 2 to 5: ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 2 -> {
                System.out.println("Create sting: ");
                char[] arr = ArrayUtils.createArray();
                System.out.print("You entered: ");
                StringUtils.println(arr);

                boolean result = StringUtils.isBlank(arr);
                if (result) System.out.println("String is blank.");
                else System.out.println("String isn't blank.");
            }
            case 3 -> {
                System.out.println("Create string: ");
                char[] arr = ArrayUtils.createArray();
                System.out.print("You entered: ");
                StringUtils.println(arr);

                boolean result = StringUtils.isRussian(arr);
                if (result) System.out.println("String consists of russian symbols.");
                else System.out.println("String doesn't consist of russian symbols.");
            }
            case 4 -> {
                System.out.println("Create first string: ");
                char[] arr = ArrayUtils.createArray();
                System.out.print("You entered: ");
                StringUtils.println(arr);

                System.out.println("Create second string: ");
                char[] arr2 = ArrayUtils.createArray();
                System.out.println("You entered: ");
                StringUtils.println(arr2);

                boolean result = StringUtils.contains(arr, arr2);
                if (result) System.out.println("Arr2 is a subarray of arr.");
                else System.out.println("Arr2 isn't a subarray of arr.");
            }
            case 5 -> {
                System.out.println("Input string that contains numbers: ");
                char[] arr = ArrayUtils.createArray();
                System.out.println(StringUtils.parseInt(arr));
            }
            default -> System.out.println("Enter correct number from 2 to 5");
        }
    }
}
