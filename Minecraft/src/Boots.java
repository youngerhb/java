
public class Boots extends Armor{

	Boots(String material) {
		super(material);
		//给脚甲5点防御补正值
		super.setDefensePoint(getDefensePoint()+5);
		//给脚甲5点耐久补正值
		super.setDefensePoint(getDefensePoint()+5);
	}
	
	Boots(){
		super();
	}

}
