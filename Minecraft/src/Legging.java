
public class Legging extends Armor{

	Legging(String material) {
		super(material);
		//给裤子10点防御补正值
		super.setDefensePoint(getDefensePoint()+15);
		//给裤子10点耐久补正值
		super.setDefensePoint(getDefensePoint()+15);
	}
	Legging(){
		super();
	}

	
}
