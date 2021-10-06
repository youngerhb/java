
public class Hoe extends Tools implements Handable{

	Hoe(String material) {
		super(material);
	}
		
	Hoe(){
		super();
	}
	
	private Player owner = new Player();
	public void setOwner(Player player) {
		this.owner = player;
	}

	@Override
	public void getInHand() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getOutHand() {
		// TODO Auto-generated method stub
		
	}

}
