import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=2;i<n;i++)
			if(n%i == 0)
				break;
		if(i==n)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");

	}

}
