import java.io.File;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("d:\\temp\\royal.txt");//this line will link the file if file exist otherwise it will create a new file
		f.createNewFile();  //checked exception
		System.out.println("Done...");
	}

}