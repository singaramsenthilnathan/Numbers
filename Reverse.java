import java.util.Scanner;
public class Reverse
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int temp=n;
int reverse=0;
int r;
while(n>0)
{
r=n%10;
reverse=(reverse*10)+r;
n=n/10;
}
System.out.println("Reverse Number is"+" "+reverse);
}
}

/* OUTPUT:
c:\java>java Reverse
Enter the value of n
151
Reverse Number is 151

c:\java>javac Reverse.java

c:\java>java Reverse
Enter the value of n
152
Reverse Number is 251
*/