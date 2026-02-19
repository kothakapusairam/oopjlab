class  A
{
	int i,j;
	A(int a,int b){
		i=a;
		b=b;
	}
	void show(){
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	}
}
class B extends A
{
	int k;
	B(int a, int b, int c){
		super(a, b);
		k=c;
	}
	void show(){
		System.out.println("k:"+k);
	}
}
class Override
{
	public static void main(String[] args)
	{
		B subOb=new B(10,20,20);
		subOb.show();
	}
}