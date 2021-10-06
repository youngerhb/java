
public class Sword extends Tools implements Handable{
	Sword(String material) {
		super(material);
		//根据材料判断攻击值
		if(material.equals("Stone"))	
			this.atk = 25;
		if(material.equals("Iron"))	
			this.atk = 50;
		if(material.equals("Golde"))
			this.atk = 25;
		if(material.equals("Diamond"))
			this.atk = 75;	
	}
	Sword(){
		super();
	}
	
	public int atk;
	
	public int getAtk() {
		return atk;
	}
	
	private Player owner = new Player();
	public void setOwner(Player player) {
		owner = player;
	}
	
	@Override
	public void getInHand() {
		owner.changeAtk(this.atk);		
	}
	@Override
	public void getOutHand() {
		owner.changeAtk(-owner.getAtk()+20);
		owner.changeMinespeed(-owner.getMinespeed()+20);
		owner.changeAtk(-owner.getWoodspeed()+20);
	}	
	
	
}
