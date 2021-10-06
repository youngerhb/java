
public class Tools {
	Tools(String material){
		this.material = material;
		if(material.equals("Stone"))
			this.toughness = 25;
		if(material.equals("Iron"))	
			this.toughness = 50;
		if(material.equals("Golde"))
			this.toughness = 25;
		if(material.equals("Diamond"))
			this.toughness = 75;
		if(material.equals("Leather"))	
			this.toughness = 25;  //这个是护甲特有的材料
		
	}	//构造器
	Tools(){
		this.material = "没穿呢";
	}
	private String material;
	private int  toughness;	
	private String name;
	private Player owner;
	
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	public Player getOwenr() {
		return this.owner;
	}
	
	public String getName() {
		return this.name;
	}

	public String getMaterial() {
		return this.material;
	}
	
	public int getToughness() {
		return this.toughness;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setToughness(int toughness) {
		this.toughness = toughness;		
	}
	
}
