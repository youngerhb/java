package copy;

public class secondpart {
	public static void main(String[] args) throws CloneNotSupportedException {
		Teacher teacher = new Teacher("G", 30);
		Student glimmer = new Student("glimmer", 18, teacher);
		Student glimmerClone = glimmer.clone();
		glimmerClone.setName("glimmerClone");
		glimmerClone.getTeacher().setName("GClone");
		glimmerClone.setAge(99);

		System.out.println("我是glimmer，我的名字为 " + glimmer.getName() + " 我今年" + glimmer.getAge() + "岁 我的老师的名字为 " + glimmer.getTeacher().getName());
		System.out.println("我是克隆体，我的名字为 " + glimmerClone.getName() + " 我今年" + glimmerClone.getAge() + "岁 我的老师的名字为 " + glimmerClone.getTeacher().getName());
	}

}
