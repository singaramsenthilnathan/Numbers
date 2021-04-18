/*The number 145 is a strong number.
This is because if we add the factorials of each digit of this number, 
you will get the number, which is 145 itself, 
as the sum. 1! + 4! + 5! = 1 + 24 + 120 = 145. */

import java.util.Scanner;
public class Strong
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value of n");
int n = sc.nextInt();
int temp=n;
int sum=0;
while(temp>0)
{
int rem=temp%10;
int fact=1;
for(int i=1;i<=rem;i++)
{
fact=fact*i;
}
sum=sum+fact;
temp=temp/10;
}
if(sum==n)
{
System.out.println(sum+" "+"is a Strong Number");
}
else
{
System.out.println(sum+" "+"is a Not a Strong Number");
	
}
}
}

/* OUTPUT:
c:\java>java Strong
Enter the Value of n
145
145 is a Strong Number

c:\java>javac Strong.java

c:\java>java Strong
Enter the Value of n
543
150 is a Not a Strong Number
*/