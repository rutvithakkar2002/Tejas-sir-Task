import java.util.ArrayList;
public class TestCollection
{
	public static void main(String args[])
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("custom");
		a1.add('a');
		System.out.println(a1);

		ArrayList a2=new ArrayList();
		a2.add(1);
		a2.add("custom2");
		a2.add('b');
		a2.addAll(a1);
		System.out.println(a2);
		System.out.println(a2.contains(1));
		System.out.println(a2.isEmpty());
		System.out.println(a2.size());
		System.out.println(a2.remove(1));
		System.out.println(a2.removeAt(2));
		System.out.println(a2);
	}
}