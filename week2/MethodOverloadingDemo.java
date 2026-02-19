class MethodOverloadingDemo 
{
	float sum(float a,float b) 
	{
	return a+b;
	}
	double sum(double c,double d,double e)
	{
		return c+d+e;
	}
	public static void main(String[] args)
	{
	MethodOverloadingDemo obj=new MethodOverloadingDemo();
	System.out.println("sum of two numbers:"+obj.sum(10,20));
	System.out.println("sum of three numbers:"+obj.sum(5,15,25));
	}
}