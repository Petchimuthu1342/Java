package Practice;
import java.util.Scanner;
public class NaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int i=sc.nextInt();
		while(i>=1){
			System.out.println(i);  
			i--;
		}
	}

}
