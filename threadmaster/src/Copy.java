import java.io.*;

public class Copy implements Runnable {
	Copy(File recentfile, File aimfile){
		this.recentfile = recentfile;
		this.aimfile = aimfile;
	}
	
	private int num=-1;
	private File recentfile;
	private File aimfile;
	private int by, len;
	
	Object obj = new Object();
	
	public static File[] allfiles(File file) { //取得当前文件夹中的全部文件
	    File[] filelist = file.listFiles();
	    return filelist;	   	 		
	}
	
	public static boolean isBinary(File file)  //用来判断文件是否为二进制文件
	 
	{ 
	boolean isBinary = false; 
	try { 
	FileInputStream fin = new FileInputStream(file); 
	long len = file.length();  
	 for (int j = 0; j < (int) len; j++) { 
	int t = fin.read(); 
	if (t < 32 && t != 9 && t != 10 && t != 13) { //判断文件中有无小于<32且不是换行符 空格 tab的字符，有的话就是二进制
	isBinary = true; 
	break; //找到了这个字符就可以判断是二进制文件就可以跳出循环了
	} 
	} 
	 fin.close();
	} catch (Exception e) { 
	e.printStackTrace(); 
	} 
	return isBinary; 
	} 
	

	@Override
	public void run(){
		File[] allfiles = allfiles(recentfile);
		while(num<allfiles.length-1) {	
			int current;
			synchronized(obj) {
				if(num<allfiles.length-1)
				    num++;
				current = num;			
			}
			if(isBinary(allfiles[current])) {  //判断是否为二进制
				try {  //对二进制文件进行复制
					FileInputStream fis = new FileInputStream(allfiles[current].getPath());
					FileOutputStream fos = new FileOutputStream(aimfile+"\\"+allfiles[current].getName());
				    System.out.println(Thread.currentThread().getName()+" "+current+"\n"+allfiles[current].getPath()+"\n"+aimfile+"\\"+allfiles[current].getName());
				    byte[] bys = new byte[1024];
				    while((len = fis.read(bys)) != -1) {
				    	fos.write(bys, 0, len);
				    }
				    fis.close();
				    fos.close();
				} catch (FileNotFoundException e) {				
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}
			else {
				try {  //对文本文件进行复制			
				    FileInputStream fis = new FileInputStream(allfiles[current].getPath());
				    FileOutputStream fos = new FileOutputStream(aimfile+"\\"+allfiles[current].getName());
				    System.out.println(Thread.currentThread().getName()+" "+current+"\n"+allfiles[current].getPath()+"\n"+aimfile+"\\"+allfiles[current].getName());
				    while((by=fis.read()) != -1) {
					    fos.write(by);						
				    }			
				    fis.close();
				    fos.close();  
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
			
			
		}	
	}

}
