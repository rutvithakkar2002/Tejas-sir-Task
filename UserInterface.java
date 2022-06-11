interface FamouseLine
{
	void ShowLine();
}
class Novel1 implements FamouseLine
{
	public void ShowLine()
	{
		System.out.println("To be , or not to be");
	}
}
class Novel2 implements FamouseLine
{
	public void ShowLine()
	{
		System.out.println("Java is Developed by Games Gosling");
	}
	public void AuthorName()
	{
		System.out.println("Shakspears");
	}
}
public class UserInterface
{
	public static void main(String args[])
	{ 
		Novel1 hamlet=new Novel1();
		Novel2 juliet=new Novel2();
		hamlet.ShowLine();
		juliet.ShowLine();
	}
}