package pkg2;

public class Student 
{
	int RollNo;
	int Marks;
	public void School()
	{
		System.out.println("Mulund High School");
		System.out.println("Students Marklist");
	}
	public static void main(String[] args) 
	{
		Student abcd=new Student();
		abcd.School();
		abcd.RollNo=01;
		abcd.Marks=500;
		System.out.println(abcd.RollNo);
		System.out.println(abcd.Marks);
	}

}
