/*A positive integer whose sum of digits of its square is 
equal to the number itself is called a neon number.

The logic is very simple. 
First, we have to calculate the square of the given number. 
After that, calculate the sum of digits in the square
*/

import java.util.Scanner;
public class Neon
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value of n");
int n = sc.nextInt();
int sum=0;
int square=n*n;

while(square!=0)
{
	int rem=square%10;//1 8
	sum = sum+rem;//0+1  9
	square =square/10;//8
}
if(sum==n)
{
	System.out.println(sum+" "+"Neon Number");
}
else
{
	System.out.println(sum+" "+"Not a Neon Number");
}
}
}