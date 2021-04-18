/*if the sum of its positive divisors excluding the number itself 
is equal to that number. For example, 28 is a perfect number 
because 28 is divisible by 1, 2, 4, 7, 14 and 28 
and the sum of these values is 1 + 2 + 4 + 7 + 14 = 28*/

import java.util.Scanner;
public class Perfect
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value of n");
int n = sc.nextInt();
int sum=0;
int i=1;
while(i<n)
{
	if(n%i==0)
	{
	sum=sum+i;
	}
	i++;
}
if(n==sum)
{
System.out.println(sum+" "+"Perfect Number");
}
else
{
System.out.println(sum+" "+"Not a Perfect Number");
}
}
}

/* OUTPUT:
Enter the Value of n
28
28 Perfect Number  */
