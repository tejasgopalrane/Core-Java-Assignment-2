/*2. Write a program to reverse a given number.*/

import java.util.Scanner;

public class ReverseNumber {
	
public static void printRecord(int num)
{
	int reverse = 0; 
    while(num > 0) 
    { 
    	int digit=num % 10;
        reverse = reverse * 10 + digit; 
        num = num / 10; 
    } 
    System.out.print("Reverse of given number: "+reverse);
}

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ReverseNumber.printRecord( num );		
	}

}
