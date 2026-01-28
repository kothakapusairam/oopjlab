class usestatick
{
	static int a=3;
	static int b;
	public static void meth(int x)
	{
		System.out.println("x=" +x);
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}
	static
	{
		System.out.println("static block intialized");
		b=a*4;
	}
	public static void main(String args[])
	{
		meth(42);
	}
}