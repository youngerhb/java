package copy;

public class Java implements Cloneable{
    String name;
    Bro bro;
    
   Java(String name, Bro bro){
		this.name = name;
		this.bro = bro;
	}
	
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	Bro getBro() {
		return this.bro;
	}
	void setBro(Bro bro) {
		this.bro = bro;
	}
	
	@Override
	public Java clone() throws CloneNotSupportedException {
		Java java = (Java)super.clone();
		java.bro = (Bro)this.bro.clone();
		return java;
	}
}
