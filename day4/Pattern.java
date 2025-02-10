package day4;
import java.util.*;
/**
 * In this program we print the pattern based on the conditions
 * if the line number is even it print numbers
 * if the line number is odd it prints *
 * @author chandrashekar
 * @apiNote It prints patterns upto a range
 */

public class Pattern {
	public static void range(int n) {
		for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            } 
            else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int n=sc.nextInt();
		range(n);
		sc.close();
	}
}
