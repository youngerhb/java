import java.io.*;
public class Process implements Runnable{
	File recentfile;
	File aimfile;
	Process(File recentfile, File aimfile){
		this.recentfile = recentfile;
		this.aimfile = aimfile;

		this.recentfilesize = recentfile.length();
	
	}
	long recentfilesize;
	float process;

	@Override
	public void run() {
		while(aimfile.length() < recentfilesize) {
			try {
				Thread.sleep(100);
				long aimfilesize = aimfile.length();
				process = (float)aimfilesize/recentfilesize*100;  //计算出当前传输的文件大小				
				System.out.println("当前传输: "+String.format("%.2f", process)+"%");
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		}	
		System.out.println("复制完毕");
	}
	

}
