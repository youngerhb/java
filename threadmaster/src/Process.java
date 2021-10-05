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
	final long aimfilesize_before;  //Ŀ���ļ��б����Ĵ�С
	long outfilesize;  //������ļ���С
	float process = (float)0.01;

	@Override
	public void run() {
		while(outfilesize <= recentfilesize&&process !=0 ) {
			try {
				Thread.sleep(100);
				long aimfilesize_after = aimfile.length();
				outfilesize = aimfilesize_after-aimfilesize_before;
				process = (float)outfilesize/recentfilesize;  //�������ǰ������ļ���С				
				System.out.println("��ǰ����: "+String.format("%.2f", process)+"%");
				for(int i=0;i<process/0.1;i++)
					System.out.print("*");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		}	
		System.out.println("�������");
	}
	

}
