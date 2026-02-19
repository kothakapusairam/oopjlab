class Box 
{
	double width,height,depth;
	Box(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	Box(){
		width= -1;
		height= -1;
		depth= -1;
	}
	Box(double len){
		width=height=depth=len;
	}
	double vol(){
		return width*height*depth;
	}

}
class OverloadCons
{
	public static void main(String[] args) 
	{
		Box mybox1=new Box(10,20,30);
		Box mybox2=new Box();
		Box mycube=new Box(7);	
		System.out.println("mybox1:"+mybox1.vol());
		System.out.println("mybox2:"+mybox2.vol());
		System.out.println("mycube:"+mycube.vol());
	}
}