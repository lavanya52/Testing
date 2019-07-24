
public class Overloading {
	int x;
	int a,b;
	Overloading(int x)
	{
		this.x=x;
		int sq=x*x;
		System.out.println("Area of square="+sq);
	}
	Overloading(int a,int b)
	{
		this.a=a;
		this.b=b;
		int area=a*b;
		System.out.println("Area of triangle is="+area);
	}
	

 public static void main(String args[])
 {
	Overloading o=new Overloading(4);
	Overloading o1=new Overloading(2,3);
	
 }
}
