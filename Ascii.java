package Practice;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int i=sc.nextInt();
		do {
			System.out.println("Ascii code:"+i);
			System.out.println((char)i);
			i++;
		}while(i<=255);

	}

}
