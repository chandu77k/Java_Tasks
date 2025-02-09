package day4;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks : ");
		int n=sc.nextInt();
		if(n<0 || n>100) {
			System.out.println("Invalid");
		}
		else {
			int gradepoint=n/10;
			switch(gradepoint) {
			case 10:
			case 9:
				System.out.println("Grade A");
				break;
			case 8:
				System.out.println("Grade B");
				break;
			case 7:
				System.out.println("Grade C");
				break;
			case 6:
				System.out.println("Grade D");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("Grade F");
				break;
			
			}
		}
		sc.close();
	}

}
