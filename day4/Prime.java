package day4;
import java.util.Scanner;
public class Prime {
	public static void number(int n) {
		int count=0;
		int number=2;
		while(count<n) {
			boolean primenum=true;
		    for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				primenum = false;
				break;
			}
		}
		if(primenum) {
			switch(number) {
			case 2: case 3: case 5: case 7:
				System.out.println(number+ " is Small");
				break;
			default:
				if(number>=10 && number<=50) {
					System.out.println(number+" is Medium");
				}
				else {
					System.out.println(number+" is Large");
				}
				break;
			}
			count++;
			}
		number++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range : ");
		int n=sc.nextInt();
		number(n);
		sc.close();
		
	}

}
