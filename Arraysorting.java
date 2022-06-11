import java.util.Scanner;

public class Arraysorting
 {
	public static void main(String[] args) 
	{

		int b[] = new int[5];
		Scanner scr = new Scanner(System.in);
		for (int i = 0; i < b.length; i++)
		{
			System.out.println("Enter number");
			b[i] = scr.nextInt();
		}
		System.out.println("-----Elements----");
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}

		int tmp = -1;
		for (int j = 1; j < b.length; j++)
		{
			for (int i = 0; i < b.length - 1; i++) 
			{
				if (b[i] > b[i + 1])
				{
					tmp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = tmp;
				}
			}
		}
		System.out.println("-----array Elements after soring----");
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}