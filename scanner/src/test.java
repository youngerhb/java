import java.io.*;

public class test {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\Administrator\\Desktop\\����\\java\\03\\������.txt");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f, true);
		fos.write(98);
		FileInputStream fis = new FileInputStream(f);
		System.out.println(fis.read());
		fos.close();
		fis.close();	
	}

}