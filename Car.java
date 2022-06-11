public class Car
{
	String name;
	int average;
	Car()
	{
		name="punch";
		average=15;
	}
	void printData()
	{
		System.out.println("Car name: "+name);
		System.out.println("Car average: "+average);
	}
	public static void main(String args[])
	{
		Car obj=new Car();
		Car obj1=new Car();
		Car obj2=new Car();
		obj.printData();	
		obj1.printData();
		obj2.printData();
	
	}
}