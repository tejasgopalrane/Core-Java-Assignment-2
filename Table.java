import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
	System.out.print("Enter the number: ");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
		for(int j=1;j<=10;j++)
		{
			int k=i*j;
			System.out.println(k);
		}

	}

}
