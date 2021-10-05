package copy;

public class Teacher implements Cloneable {
	Teacher(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
    String name;
    int age;
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}