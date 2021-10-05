package copy;

public class Glimmer implements Cloneable{
	String name;
    Guys guy;   
    Bro bro;
    Java java;
    
    Glimmer(String name, Guys guy, Bro bro, Java java){
    	this.name = name;
    	this.guy = guy;
    	this.bro = bro;
    	this.java = java;
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
	
	Bro getBro() {
		return this.bro;
	}
	void setBro(Bro bro) {
		this.bro = bro;
	}
	
	Java getJava() {
		return this.java;
	}
	void setJava(Java java) {
		this.java = java;
	}
	
	@Override
	public Glimmer clone() throws CloneNotSupportedException{
		Glimmer glimmer = (Glimmer)super.clone();
		glimmer.guy = (Guys)this.guy.clone();
		glimmer.bro = (Bro)this.bro.clone();
		glimmer.java = (Java)this.java.clone();
		return glimmer;
	}
}
