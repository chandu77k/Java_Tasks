package day4;
import java.util.Scanner;
/**
 * Here we print Fibonacci series upto a range
 * 'a','b' variables are initialized and series started from there
 * @author chandrashekar
 * @apiNote It's a program to print first n fibonacci numbers
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = scanner.nextInt();
        int a = 0, b = 1;
        for (int i=0;i<=range;i++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + ": I am spiderman and ironman");
            } else if (a % 3 == 0) {
                System.out.println(a + ": I am spiderman");
            } else if (a % 5 == 0) {
                System.out.println(a + ": I am ironman");
            } else {
                System.out.println(a + ": I am zero");
            }
            int next = a + b;
            a = b;
            b = next;
        }
        scanner.close();
    }
}
