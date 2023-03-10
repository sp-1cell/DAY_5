package DAY5;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three number ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = 0;
        int[] list = {a, b, c};
        for (int d : list) {
            if (d > max) {
                max = d;
            }
        }
        System.out.println("The largest number is " + max);
    }

}

