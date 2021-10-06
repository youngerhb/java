
public class Chestplate extends Armor{

	Chestplate(String material) {
		super(material);
		//给胸甲20点防御补正值
		super.setDefensePoint(getDefensePoint()+20);
		//给胸甲20点耐久补正值
		super.setDefensePoint(getDefensePoint()+20);
	}
	Chestplate(){
		super();
	}

}
