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
	
	public static File[] allfiles(File file) { //ȡ�õ�ǰ�ļ����е�ȫ���ļ�
	    File[] filelist = file.listFiles();
	    return filelist;	   	 		
	}
	
	public static boolean isBinary(File file)  //�����ж��ļ��Ƿ�Ϊ�������ļ�
	 
	{ 
	boolean isBinary = false; 
	try { 
	FileInputStream fin = new FileInputStream(file); 
	long len = file.length();  
	 for (int j = 0; j < (int) len; j++) { 
	int t = fin.read(); 
	if (t < 32 && t != 9 && t != 10 && t != 13) { //�ж��ļ�������С��<32�Ҳ��ǻ��з� �ո� tab���ַ����еĻ����Ƕ�����
	isBinary = true; 
	break; //�ҵ�������ַ��Ϳ����ж��Ƕ������ļ��Ϳ�������ѭ����
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
			if(isBinary(allfiles[current])) {  //�ж��Ƿ�Ϊ������
				try {  //�Զ������ļ����и���
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
				try {  //���ı��ļ����и���			
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
