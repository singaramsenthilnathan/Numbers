/*Armstrong Number in Java: 
A positive number is called armstrong number
if it is equal to the sum of cubes of its digits 
for example 0, 1, 153, 370, 371, 407 etc.*/

import java.util.Scanner;
public class Arm
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value of n");
int n = sc.nextInt();
int temp=n;
int c=0;
int a;
while(n>0)
{
	a=n%10;// remainder ---for cube purpose 
	n=n/10;// quotient ---for second condition checking purpose
	c=c+(a*a*a);
}

	if(c==temp)
	{
		System.out.println(c+" "+"ArmStrong Number");
	}
	else
	
	{
		System.out.println(c+" "+"Not a ArmStrong Number");
	}
	

}
}

/* OUTPUT:

Enter the Value of n
153
ArmStrong Number

c:\java>javac Arm.java

c:\java>java Arm
Enter the Value of n
349
Not a ArmStrong Number

c:\java>javac Arm.java

c:\java>java Arm
Enter the Value of n
471
Not a ArmStrong Number

c:\java>javac Arm.java

c:\java>java Arm
Enter the Value of n
371
ArmStrong Number
*/