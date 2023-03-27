class A
{
public void funA1()
{
System.out.println("funA1 method of classA called");
}//funA1
public void funA2()
{
System.out.println("funA2 method of classA called");
}//funA2
public void funA3()
{
System.out.println("funA3 method of classA called");
}//funA3
}
class B
{
public void funB1()
{
System.out.println("funB1 method of classB called");
}//fun B1
public void funB2()
{
System.out.println("funB2 method of classB called");
}//fun B2
public void funB3()
{
System.out.println("funB3 method of classB called");
}//fun B3
}//B
class  Day4program9
{
public static void main(String args[])
{
A obA=new A();
obA.funA1();
obA.funA2();
obA.funA3();
B obB=new B();
obB.funB1();
obB.funB2();
obB.funB3();
}
}