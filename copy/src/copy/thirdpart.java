package copy;

public class thirdpart {
	public static void main(String[] args) throws CloneNotSupportedException {
		Guys guy = new Guys("guy");
		Guys cguy = new Guys("cguy");
		Bro bro = new Bro("bro", guy);
		Bro cbro = new Bro("broc", cguy);
		Java java = new Java("java", bro);
		Java cjava = new Java("cjava", cbro);
		Glimmer glimmer = new Glimmer("glimmer", guy, bro, java);
		Glimmer glimmerclone = glimmer.clone();
		System.out.println("glimmer  "+"名字:"+glimmer.getName()+"  Guy:"+glimmer.getGuy().getName()+"  Bro"+glimmer.getBro().getName()+"  Java:"+glimmer.getJava().getName());
		System.out.println("glimmerclone  "+"名字:"+glimmerclone.getName()+"  Guy:"+glimmerclone.getGuy().getName()+"  Bro:"+glimmerclone.getBro().getName()+"  Java:"+glimmerclone.getJava().getName());		
		System.out.println("修改后");
		glimmerclone.setName("glimmerclone");
		glimmerclone.setBro(cbro);
		glimmerclone.setGuy(cguy);
		glimmerclone.setJava(cjava);
		System.out.println("glimmer  "+"名字:"+glimmer.getName()+"  Guy:"+glimmer.getGuy().getName()+"  Bro:"+glimmer.getBro().getName()+"  Java:"+glimmer.getJava().getName());
		System.out.println("glimmerclone  "+"名字:"+glimmerclone.getName()+"  Guy:"+glimmerclone.getGuy().getName()+"  Bro:"+glimmerclone.getBro().getName()+"  Java:"+glimmerclone.getJava().getName());	
	}

}
