package pkg4;

public class Arithmetic2 
{
		public int sum(int a,int b,int c)
		{
			int d;
			d=a+b+c;
		System.out.println("The sum is "+d);
		return d;
	}
		public int sub(int e,int f)
		{
		int g;
		g=e-f;
		System.out.println("The sub is "+g);
		return g;
	}
		public int multi(int h,int i)
		{
		int j;
		j=h*i;
		System.out.println("The multi is "+j);
		return j;
	}
		public void div(int k,int l)
		{
		int m;
		m=k/l;
		System.out.println("The div is "+m);
	}
		public static void main(String[] args) 
		{
			Arithmetic2 obj=new Arithmetic2();
			int sumresult=obj.sum(10,2,2);
			int subresult=obj.sub(sumresult,2);
			int multiresult=obj.multi(subresult,2);
			obj.div(multiresult, 2);
		}
	
}
