import java.util.Scanner;
class Number
{
// method for subtration sub
public int sub(int a,int b)
{
int c =a-b;
return c;
}
}
class Day4program11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
Number ob =new Number();
int res=0;
res =ob.sub(num1,num2);
System.out.println(num1+"-"+num2+"="+res);
}
}
 