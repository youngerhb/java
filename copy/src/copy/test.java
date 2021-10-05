package copy;

public class test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Guys guy = new Guys("guy");
		Guys cguy = guy.clone();
		Bro bro = new Bro("bro", guy);
		Bro cbro = bro.clone();
		Java java = new Java("java", bro);
		Java cjava = java.clone();
		System.out.println(guy.getName());
		System.out.println(cguy.getName());
		System.out.println(bro.getName());
		System.out.println(cbro.getName());
	}

}
