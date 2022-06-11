interface Newshape
{
	void draw();
}
interface Circle extends Newshape
{
	void getRadius();
	int radius=10;
}
class NewCircle implements Circle
{
	public void getRadius()
	{
		System.out.println(radius);
	}
	public void draw()
	{
		System.out.println("Draw Method!");
	}
}
class ExtendInterface extends NewCircle
{
	public static void main(String args[])
	{
		Circle nc=new NewCircle();
		NewCircle nc1=new NewCircle();
		nc.getRadius();
		nc.draw();
		nc1.getRadius();
		nc1.draw();
	}
}