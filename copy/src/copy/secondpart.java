package copy;

public class secondpart {
	public static void main(String[] args) throws CloneNotSupportedException {
		Teacher teacher = new Teacher("G", 30);
		Student glimmer = new Student("glimmer", 18, teacher);
		Student glimmerClone = glimmer.clone();
		glimmerClone.setName("glimmerClone");
		glimmerClone.getTeacher().setName("GClone");
		glimmerClone.setAge(99);

		System.out.println("����glimmer���ҵ�����Ϊ " + glimmer.getName() + " �ҽ���" + glimmer.getAge() + "�� �ҵ���ʦ������Ϊ " + glimmer.getTeacher().getName());
		System.out.println("���ǿ�¡�壬�ҵ�����Ϊ " + glimmerClone.getName() + " �ҽ���" + glimmerClone.getAge() + "�� �ҵ���ʦ������Ϊ " + glimmerClone.getTeacher().getName());
	}

}
