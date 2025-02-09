package day4;
import java.util.*;

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
