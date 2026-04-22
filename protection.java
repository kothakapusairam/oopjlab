package p1;
public class protection
{
	int n=1;
	private int n_pri=2;
	public int n_pub=4;
	protected int n_pro=3;
	public protection()
	{
		System.out.println("base constructor");
		System.out.println("n= "+n);
		System.out.println("n_pri= "+n_pri);
		System.out.println("n_pub= "+n_pub);
		System.out.println("n_pro= "+n_pro);
	}
}