
public class Counter implements Runnable{

	//��Ա����
	private int num = 0;
	Object obj = new Object();
	//��д����
	@Override
	public void run() {
	  for(int i = 0; i < 1000000; i++){
		  synchronized(obj) {
			  num++;
			  System.out.println(Thread.currentThread().getName() + ":" + num);
		  }
	    
	  }
	}

}
