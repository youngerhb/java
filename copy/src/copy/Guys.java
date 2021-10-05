package copy;

public class Guys implements Cloneable{
	String name;
	
	Guys(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}

	@Override
	public Guys clone() throws CloneNotSupportedException{
		return (Guys)super.clone();
	}
}
