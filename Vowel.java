package DAY5;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the alphabet :");
        char c = scan.next().charAt(0);
        char[] list = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int track = 0;
        for (char i : list) {
            if (i == c) {
                System.out.println("The alphabet is vowel");
                track = 1;
                break;
            }
        }
        if (track == 0) {
            System.out.println("The alphabet is consonent");
        }
    }
}
