package pkg7;

public class Assignment1 
{
	public Assignment1()
	{
		this(5,6,7,8); //it will call 4 para
		System.out.println("Default Constructor");
	}
	public Assignment1(int a)
	{
		this(); //it will call default
		System.out.println("One Parameterized Constructor");
	}
	public Assignment1(int b,int c)
	{
		System.out.println("Two Parameterized Constructor");
	}
	public Assignment1(int d,int e,int f)
	{
		this(4); //it will call 1 para
		System.out.println("Three Parameterized Constructor"); //it will print 3 para
	}
	public Assignment1(int g,int h,int i,int j)
	{
		this(9,10); //it will cal 2 para
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
	Assignment1 obj=new Assignment1(1,2,3); //control will go to 3 para
	}
}
