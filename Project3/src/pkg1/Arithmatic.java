package pkg1;

public class Arithmatic 
{
 public int sum(int a,int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("sum result is "+c);
	 return c;
 }
 public int sub(int x,int y)
 {
	 int z;
	 z=x-y;
	 System.out.println("sub result is "+z);
	 return z;
 }
 public void multi(int a1,int a2)
 {
	int a3;
	a3=a1*a2;
	System.out.println("multi result is "+a3);
 }
 public static void main(String[] args) 
 {
	Arithmatic obj=new Arithmatic();
	int sumresult=obj.sum(10,2);
	int subresult=obj.sub(10,2);
	obj.multi(sumresult,subresult);
	}
}
