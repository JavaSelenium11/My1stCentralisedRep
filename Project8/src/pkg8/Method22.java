package pkg8;

public class Method22 
{
public void Method23 ()
{
	System.out.println("Default method");
	this.Method27(4,5,6,7); // it will call 4 para
}
public void Method24 (int a)
{
	System.out.println("1 parametrized method");
	this.Method25(9,10); // it will call 2 para
}
public void Method25 (int  b,int c)
{
	System.out.println("2 parameterized method");
}
public void Method26 (int d,int e,int f)
{
	System.out.println("3 parameterized method");
	this.Method23(); // it will call default
}
public void Method27 (int g,int h,int i,int j)
{
	System.out.println("4 parametrized method");
	this.Method24(8); // it will call 1 para
}
public static void main(String[] args) 
{
	Method22 ref=new Method22();
	ref.Method26(1,2,3); // control will go to 3 para
}

}
