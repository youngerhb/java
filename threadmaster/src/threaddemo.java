
public class threaddemo {
	public static void main(String[] args) {
		Counter cou =new Counter();
		Thread counter1 = new Thread(cou, "counter1");
		Thread counter2 = new Thread(cou, "counter2");
		
		counter1.setPriority(10);
		counter2.setPriority(1);
		
		counter1.start();
		counter2.start();
	}		
}