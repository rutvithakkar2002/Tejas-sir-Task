import java.util.Scanner;
public class ByteStuffing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String msg=sc.nextLine();
		char flag='#';
		char esc='@';
		String stuffmsg=" ";
		for(int i=0;i<msg.length();i++)
		{
			if(msg.charAt(i)=='#')
			{
				stuffmsg=stuffmsg+'@'+msg.charAt(i);
			}
			else if(msg.charAt(i)=='@')
			{
				stuffmsg=stuffmsg+'@'+msg.charAt(i);
			}
			else
			{
				stuffmsg=stuffmsg+msg.charAt(i);
			}
		}
		
		System.out.println("Flag "+flag);
		System.out.println("Esc "+esc);
		System.out.println("Stuffedmsg "+stuffmsg);
		System.out.println("Sent Frame: "+flag+stuffmsg+" "+flag);
	}

}
