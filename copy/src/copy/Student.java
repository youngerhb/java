package copy;

public class Student implements Cloneable {
	Student(String name, int age, Teacher teacher){
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	Teacher getTeacher() {
		return this.teacher;
	}
	
    String name;
    int age;
    Teacher teacher;

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student)super.clone();
        student.setTeacher((Teacher)this.teacher.clone());
        return student;
    }
}