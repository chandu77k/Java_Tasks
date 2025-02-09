package day4;
import java.util.*;
public class Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++) {
			if(i%5==0) {
				continue;
			}
			if(i%2==0) {
				System.out.println(i+" is divisible by 2");
			}
			else if(i%3==0) {
				System.out.println(i+" is divisible by 3");
			}
		}
		sc.close();
	}
}
