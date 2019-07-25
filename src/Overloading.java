import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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
	Logger log = Logger.getLogger("my.logger");
	log.setLevel(Level.ALL);
	ConsoleHandler handler = new ConsoleHandler();
	handler.setFormatter(new SimpleFormatter());
	log.addHandler(handler);
	log.info("hello world");
	
 }
}
