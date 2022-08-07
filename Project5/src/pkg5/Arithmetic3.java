package pkg5;

public class Arithmetic3 
{
	public int sub1(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("The sub1 is "+c);
		return c;
	}
	public int sum(int d,int e)
	{
		int f;
		f=d+e;
		System.out.println("The sum is "+f);
		return f;
	}
	public int sub2(int g,int h)
	{
		int i;
		i=g-h;
		System.out.println("The sub2 is "+i);
		return i;
	}
	public int multi(int j,int k)
	{
	int l;
	l=j*k;
	System.out.println("The multi is "+l);
	return l;
	}
	public void div(int m,int n)
	{
		int o;
		o=m/n;
		System.out.println("The final result is "+o);
	}
	public static void main(String[] args)
		{
			Arithmetic3 refvar=new Arithmetic3();
			int subresult=refvar.sub1(10,2);
			int sumresult=refvar.sum(subresult,2);
			int subresult2=refvar.sub2(sumresult,2);
			int multiresult=refvar.multi(subresult2,2);
			refvar.div(multiresult,2);
		}
}
