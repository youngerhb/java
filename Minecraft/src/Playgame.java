
public class Playgame {
	public static void main(String[] args) {
		//使用默认构造器构造一个玩家steve
		Player steve = new Player();

		System.out.println("穿哈皮革鞋子（金猴皮鞋）");
		System.out.println("当前护甲值: "+steve.getDefense());	    
		Boots boots1 = new Boots("Iron");
		System.out.println("鞋子的防御值: "+boots1.getDefensePoint());
		steve.wearArmor(boots1);
		System.out.println("当前护甲值: "+steve.getDefense());
		
		System.out.println("  ");
		System.out.println("换哈钻石鞋子");
		Boots boots2 = new Boots("Diamond");
		System.out.println("鞋子的防御值: "+boots2.getDefensePoint());
		steve.wearArmor(boots2);
		System.out.println("当前护甲值: "+steve.getDefense());
		
		System.out.println("  ");
		System.out.println("再穿个金胸甲");
		Chestplate chestplate = new Chestplate("Golden");
		System.out.println("胸甲的防御值: "+chestplate.getDefensePoint());
		System.out.println("当前护甲值: "+steve.getDefense());
		
		System.out.println("  ");
		System.out.println("杀戮的欲望正在高涨！");
		System.out.println("我的攻击值: "+steve.getAtk());
		System.out.println("拿上我的石剑");
		Sword stonesword = new Sword("Stone");
		stonesword.setOwner(steve);
		System.out.println("石剑的攻击值: "+stonesword.getAtk());
		System.out.println("石剑的耐久值: "+stonesword.getToughness());
		steve.getHand(stonesword);
		System.out.println("我的攻击值: "+steve.getAtk());
		System.out.println("换上我的铁剑");
		Sword ironsword = new Sword("Iron");
		ironsword.setOwner(steve);
		System.out.println("铁剑的攻击值: "+ironsword.getAtk());
		System.out.println("铁剑的耐久值: "+ironsword.getToughness());
		steve.getHand(ironsword);
		System.out.println("我的攻击值: "+steve.getAtk());
		
		System.out.println("  ");
		System.out.println("去挖点矿吧");
		System.out.println("我的挖矿效率: "+steve.getMinespeed());
		System.out.println("试下铁镐呢");
		Pickaxe pickaxe = new Pickaxe("Iron");
		pickaxe.setOwner(steve);
		steve.getHand(pickaxe);
		System.out.println("铁镐的挖矿效率: "+pickaxe.getMinespeed());
		System.out.println("我的挖矿效率: "+steve.getMinespeed());
		System.out.println(" ");
		
		System.out.println("  ");
		steve.changeHunger(-10);
		System.out.println("有点饿，该干饭了");
		System.out.println("我的饱腹值: "+steve.getHunger());
		System.out.println("吃个牛肉");
		steve.eatFood(new Food("Beef"));
		System.out.println("我的饱腹值: "+steve.getHunger());
		System.out.println("饭后甜点芦荟汁儿，干净又卫生嗷xdm");
		steve.eatFood(new Food("Aloe juice"));
		System.out.println("我的饱腹值: "+steve.getHunger());
		
		
		
	}

}
