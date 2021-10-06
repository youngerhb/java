
public class Pickaxe extends Tools implements Handable{
	Pickaxe(String material){
		super(material);
		if(material.equals("Stone"))	
			this.minespeed = 25;
		if(material.equals("Iron"))	
			this.minespeed= 50;
		if(material.equals("Golde"))
			this.minespeed = 25;
		if(material.equals("Diamond"))
			this.minespeed= 75;	
	}
	Pickaxe(){
		super();
	}
	
	private int minespeed;
	public int getMinespeed() {
		return minespeed;
	}
	
	private Player owner = new Player();
	public void setOwner(Player player) {
		this.owner = player;
	}
		
	@Override
	public void getInHand() {
		owner.changeMinespeed(minespeed);
	}

	@Override
	public void getOutHand() {
		owner.changeAtk(-owner.getAtk()+20);
		owner.changeMinespeed(-owner.getMinespeed()+20);
		owner.changeAtk(-owner.getWoodspeed()+20);
		
	}

}
