
public class Counter implements Runnable{

	//成员变量
	private int num = 0;
	Object obj = new Object();
	//重写方法
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
