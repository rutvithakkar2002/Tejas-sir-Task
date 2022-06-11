package royal;
import com.A;
import edu.B;
import org.C;
public class RoyalEducation
{ 
	private int x,y,z;	
	public RoyalEducation()
	{
		System.out.println("This is RoyalEducation class constructor");
		x=30;
		y=10;
	}
	public void div()
	{
		z=x/y;
		System.out.println("\n Division is: "+z);
	}
	public static void main(String args[])
	{
		A obj=new A();
		B obj1=new B();
		C obj2=new C();
		RoyalEducation r=new RoyalEducation();
		obj.add();
		obj1.sub();
		obj2.mul();
		r.div();	
	}	
}