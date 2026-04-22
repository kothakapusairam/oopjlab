class A extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
		System.out.println("\t From thread A:i="+i);
		}
	System.out.println("Exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for (int j=1;j<=5;j++)
		{
		System.out.println("\t From thread B:j="+j);
		}
	System.out.println("Exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		for (int k=1;k<=5;k++)
		{
		System.out.println("\t From thread C:k="+k);
		}
	System.out.println("Exit from C");
	}
}
class ThreadPriority
{
	public static void main(String[] args) throws Exception
	{
		A threadA=new A();
		B threadB=new B();
        C threadC=new C();
		
		//threadC.setPriority(Thread.MAX_PRIORITY);
		//threadB.setPriority(threadA.getPriority()+1);
		//threadA.setPriority(Thread.MIN_PRIORITY);
		threadC.setPriority(10);
		threadB.setPriority(5);
		threadA.setPriority(1);
		
		System.out.println("Started Thread A");
        threadA.start();
		threadA.join();
		System.out.println("Started Thread B");
        threadB.start();
		threadB.join();
		System.out.println("Started Thread C");
        threadC.start();
		threadC.join();
		System.out.println("End of main Thread");
	}
		
}