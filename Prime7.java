import java.util.Scanner;
public class Prime7
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int count=0;
int c;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
	count++;
	c=i;
	System.out.println(c);
}
}
if(count==0)
{
	System.out.println("Prime No");
}
else
{
	System.out.println("Not a Prime No"+" "+" The Count is"+count);
}
}
}

/* OUTPUT:
Enter the value of n
9
3
Not a Prime No  The Count is1

c:\java>javac Prime7.java

c:\java>java Prime7
Enter the value of n
11
Prime No
*/