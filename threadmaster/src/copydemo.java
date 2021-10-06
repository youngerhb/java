import java.io.*;
public class copydemo {
	public static void main(String[] args) throws IOException{
		File recentfile = new File("C:\\Users\\Administrator\\Desktop\\招新\\java\\04\\recentfile");  //当前文件夹
		File safefile = new File("C:\\Users\\Administrator\\Desktop\\招新\\java\\04\\aimfile");  //目标文件保险柜
		//只需要输入上面这两个文件夹的路径就行
		
		File aimfile = new File(safefile.getAbsolutePath()+"//"+recentfile.getName());  
		aimfile.mkdir();
		
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
