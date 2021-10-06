
public class Food {
	private String name;
	private int foodValue;
	
	Food(String name){
		this.name = name;		
		//只写了三种食物
		if(name.equals("Aloe juice"))  //芦荟汁
			this.foodValue = 1;
		if(name.equals("Beef"))  //芦荟汁
			this.foodValue = 3;
		if(name.equals("Aloe juice"))  //芦荟汁
			this.foodValue = 2;		
	}
	
	public int getFoodValue() {
		return this.foodValue;
	}

}
