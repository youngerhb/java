package copy;

public class Bro implements Cloneable{
    String name;
    Guys guy;
    
    Bro(String name, Guys guy){
    	this.name = name;
    	this.guy = guy;    	
    }
    
    String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	Guys getGuy() {
		return this.guy;
	}
	void setGuy(Guys guy) {
		this.guy = guy;
	}
	
	@Override
	public Bro clone() throws CloneNotSupportedException {
		Bro bro = (Bro)super.clone();
		bro.guy = (Guys)this.guy.clone();		  
		return bro;
	}
	
}