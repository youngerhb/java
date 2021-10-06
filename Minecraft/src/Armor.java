
public abstract class Armor extends Tools{
	//名称，材料，耐久属性在父类Tools里面
	Armor(String material){
		super(material);
		if(material.equals("Leather"))	
			this.defensePoint = 25;
		if(material.equals("Iron"))	
			this.defensePoint = 50;
		if(material.equals("Golde"))
			this.defensePoint = 25;
		if(material.equals("Diamond"))
			this.defensePoint= 75;					
	}
	Armor(){
		super();
	}
	//定义护甲值
	private int defensePoint;
	
	//取得护甲值
	public int getDefensePoint() {
		return this.defensePoint;
	}
	//取得耐久值
	public int getToughness() {
		return super.getToughness();
		
	}
	//设定护甲值
	public void setDefensePoint(int defensePoint) {
		this.defensePoint = defensePoint;
	}
}
