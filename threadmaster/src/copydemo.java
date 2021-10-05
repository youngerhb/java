import java.io.*;
public class copydemo {
	public static void main(String[] args) throws java.io.FileNotFoundException{
		File recentfile = new File("C:\\Users\\Administrator\\Desktop\\ÕÐÐÂ\\java\\04\\recentfile");
		File aimfile = new File("C:\\Users\\Administrator\\Desktop\\ÕÐÐÂ\\java\\04\\aimfile");
		
		Copy copy = new Copy(recentfile, aimfile);
		Process pro = new Process(recentfile, aimfile);
		
		Thread th1 = new Thread(copy);
		Thread th2 = new Thread(copy);
		Thread th3 = new Thread(copy);
		Thread process = new Thread(pro, "process");		
			
		th1.start();
		th2.start();
		th3.start();
		process.start();
		
	}

}
