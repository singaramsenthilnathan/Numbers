/*Palindrome number in java: 
A palindrome number is a number that is same after reverse. 
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. */
import java.util.Scanner;
public class Pali
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int temp=n;
int sum=0;
int r;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
	System.out.println(sum+" "+"is a Palindrome");
}
else
{
	System.out.println(sum+" "+"is not a Palindrome");
}
}
}

/* OUTPUT:
Enter the value of n
454
454 is a Palindrome */