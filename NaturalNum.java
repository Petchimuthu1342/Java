package Practice;
import java.util.Scanner;
public class NaturalNum {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Get the Number:");
		int num=sc.nextInt();
		int rev=0;
		System.out.println("Reverse Number:");
		while(num!=0){
		    int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			System.out.print(rem);
		}
		}
	}
