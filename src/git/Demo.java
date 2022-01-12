package git;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		int a=0, b=1, c;
		
		System.out.println("Enter no: ");
		Scanner scan = new Scanner(System.in);
		int no =scan.nextInt();
		
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2; i<=no; i++) {
			
			c = a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
		}
		
	}


}
