import java.util.Scanner;
class Day4program2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

if(num/2*2==num){System.out.print("EVEN");}
if(num/2*2!=num){System.out.print("ODD");}
}
}