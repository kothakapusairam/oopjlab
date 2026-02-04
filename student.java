class Student
{
	int rollNo;
	String name;
	String branch;
	int marks;
	void getData(int rollNo,String name,String branch,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("rollNo:"+rollNo);
		System.out.println("name:"+name);
		System.out.println("branch:"+branch);
		System.out.println("marks:"+marks);
	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.getData(1,"abc","CSE",100);
		s2.getData(2,"pqr","IT",90);
		s1.display();
		s2.display();
	}
}