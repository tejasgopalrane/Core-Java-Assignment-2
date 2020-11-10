import java.util.Scanner;
public class PrimeSeries {

	public static void main(String[] args) {
		System.out.print("Enter range");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int a=0;a<=n;a++)
		{
			if(a%n == 0)
				System.out.println(a);
		}

	}

}
