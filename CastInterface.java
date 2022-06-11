interface Newshape
{
	void draw();
}
class NewCircle1 implements Newshape
{
	public void draw()
	{
		System.out.println("New Circle 1 draw");
	}
}
class NewCircle2 implements Newshape
{
	public void draw()
	{
		System.out.println("New Circle 2 draw");
	}	
}
class CastInterface
{
	public static void main(String args[])
	{
		Newshape nc1=new NewCircle1();
		Newshape nc2=new NewCircle2();
		nc1.draw();
		nc2.draw();
	}
}