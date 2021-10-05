import java.io.*;
public class Process implements Runnable{
	File recentfile;
	File aimfile;
	Process(File recentfile, File aimfile){
		this.recentfile = recentfile;
		this.aimfile = aimfile;
		this.recentfilesize = recentfile.length();
		this.aimfilesize_before = aimfile.length();
	}
	long recentfilesize;
	final long aimfilesize_before;  //目的文件夹本来的大小
	long outfilesize;  //输出的文件大小
	float process = (float)0.01;

	@Override
	public void run() {
		while(outfilesize <= recentfilesize&&process !=0 ) {
			try {
				Thread.sleep(100);
				long aimfilesize_after = aimfile.length();
				outfilesize = aimfilesize_after-aimfilesize_before;
				process = (float)outfilesize/recentfilesize;  //计算出当前传输的文件大小				
				System.out.println("当前传输: "+String.format("%.2f", process)+"%");
				for(int i=0;i<process/0.1;i++)
					System.out.print("*");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		}	
		System.out.println("复制完毕");
	}
	

}
