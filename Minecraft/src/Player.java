
public class Player {
	
	/*玩家属性*/
	private String name;    //玩家名称
	private int health=20;    //玩家血量默认20
	private int hunger=20;    //玩家饥饿值默认20
	private int defensePoint=20;    //玩家防护值默认20
    private int atk=20;  //玩家的供给制默认20  塔塔开！
    private int minespeed=20;  //玩家挖矿速度默认20
    private int woodsspeed=20;  //玩家砍树速度默认20

	/*玩家装备*/
	private Chestplate chestplate = new Chestplate();
	private Boots boots = new Boots();
	private Helmet helmet = new Helmet();
	private Legging legging = new Legging();
	
	/*构造玩家*/
    public Player(String name) {
		this.name=name;
	}
    
    public Player() {
    	this("steve");
    }  //默认的玩家名称
    
    
    //属性值查看及改变
    
    public void changeName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    //玩家血量改变
    public void changeHealth(int i) {
    	this.health = this.health + i;
    }
    //查看玩家当前血量
    public int getHealth() {
    	return this.health;
    }
    //玩家饥饿值改变
    public void changeHunger(int i) {
    	this.hunger = this.hunger + i;
    }
    public int getHunger() {
    	return this.hunger;
    }
    //玩家防护值改变
    public void changeDefense(int i) {
    	this.defensePoint = this.defensePoint + i;
    }
    public int getDefense() {
    	return this.defensePoint;
    }
    //玩家攻击值改变
    public void changeAtk(int i) {
    	   	this.atk = this.atk + i;   	    	
    }
    public int getAtk() {
    	return this.atk;
    }
    //玩家挖矿速度改变
    public void changeMinespeed(int i) {
    	this.minespeed = this.minespeed + i;
    }
    public int getMinespeed() {
    	return this.minespeed;
    }
    //玩家砍树速度改变
    public void changeWoodspeed(int i) {
    	this.woodsspeed = this.woodsspeed + i;
    }
    public int getWoodspeed() {
    	return this.woodsspeed;
    }

  
    //一些动作
    public void wearArmor(Helmet helmet) {
    	this.changeDefense(-this.helmet.getDefensePoint());
    	this.helmet = helmet;
    	this.changeDefense(helmet.getDefensePoint());
    }
    
    public void wearArmor(Chestplate chestplate) {
    	this.changeDefense(-this.chestplate.getDefensePoint());
    	this.chestplate = chestplate;
    	this.changeDefense(chestplate.getDefensePoint());
    }
    
    public void wearArmor(Legging legging) {
    	this.changeDefense(-this.legging.getDefensePoint());
    	this.legging = legging;
    	this.changeDefense(legging.getDefensePoint());
    }
    
    public void wearArmor(Boots boots) {
    	this.changeDefense(-this.boots.getDefensePoint());
    	this.boots = boots;
    	this.changeDefense(boots.getDefensePoint());
    }
    //手上工具
    public void getHand(Handable taget) {
    	taget.getOutHand();
    	taget.getInHand(); 
    }

    //吃东西
    public void eatFood(Food food) {
    	this.hunger = this.hunger + food.getFoodValue();
    }
    
}




