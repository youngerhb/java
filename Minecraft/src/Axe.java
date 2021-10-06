
public class Axe extends Tools implements Handable{

	Axe(String material) {
		super(material);
		if(material.equals("Stone"))	
			this.woodspeed = 25;
		if(material.equals("Iron"))	
			this.woodspeed= 50;
		if(material.equals("Golde"))
			this.woodspeed= 25;
		if(material.equals("Diamond"))
			this.woodspeed = 75;
	}
	Axe(){
		super();
	}
	
	private Player owner = new Player();
	public void setOwner(Player player) {
		this.owner = player;
	}

	private int woodspeed;
	public int getWoodspeed() {
		return woodspeed;
	}
	
	@Override
	public void getInHand() {
		owner.changeWoodspeed(woodspeed);;
	}

	@Override
	public void getOutHand() {
		owner.changeAtk(-owner.getAtk()+20);
		owner.changeMinespeed(-owner.getMinespeed()+20);
		owner.changeAtk(-owner.getWoodspeed()+20);
	}
	

}
