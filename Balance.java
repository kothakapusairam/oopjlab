package MyPack;
public class Balance{
public String name;
public double bal;
public Balance(String name, double bal) {
this.name=name;
this.bal=bal;
}
public void show(){
if(bal<0)
System.out.print("--> ");
System.out.print(name+":$"+bal);
}
}
