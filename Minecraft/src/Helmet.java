
public class Helmet extends Armor{
	
	Helmet(String material) {
		//调用父类构造器
		super(material);
		//给头盔10点防御补正值
		super.setDefensePoint(getDefensePoint()+10);
		//给头盔10点耐久补正值
		super.setDefensePoint(getDefensePoint()+10);
	}
	Helmet(){
		super();
	}

	
}
