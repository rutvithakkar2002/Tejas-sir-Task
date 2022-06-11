interface Newshape
{
	void draw();
	int radius=10;
}
class NewCircle1 implements Newshape
{
	public void draw()
	{
		//radius=1;
		System.out.println("radius is: "+radius);
	}
}
class InterfaceVar
{
	public static void main(String args[])
	{
		Newshape nc1=new NewCircle1();
		nc1.draw();
	}
}