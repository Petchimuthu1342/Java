package Practice;

import java.util.Scanner;

public class ReverseAlpha {

	public static void main(String[] args) {
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		int i=sc.nextInt();
		for(j=i;j>=65;j--) {
			System.out.println((char)j);
			
		}
	}
	}
