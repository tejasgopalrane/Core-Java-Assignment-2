import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array:	");
		int n=sc.nextInt();
		int []a = new int[n];
		System.out.println("Enter elements in array:	");
		for(int i=0; i<n; i++)
		{
		    
			a[i] = sc.nextInt();
		}
	
		/*for (int b: a)
		{
			System.out.println(b);
		}*/
		for (int i = a.length-1; i >= 0; i--) 
		{  
            System.out.print(a[i] + " ");  
	}
	}
}


