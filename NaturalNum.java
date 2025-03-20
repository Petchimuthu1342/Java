package Practice;
import java.util.Scanner;
public class NaturalNum {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("Get the Number:");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		System.out.println("Reverse Number:");
		while(i<=num){
			sum =num*(num+1)/2;
			i++;
		}
		System.out.println("Natural Number:"+ sum);
	        //StringBuffer class
			StringBuffer sb=new StringBuffer(String.valueOf(sum));
			StringBuffer rev=sb.reverse();
			System.out.println("Reverse Number:"+ rev);
	}
	}
