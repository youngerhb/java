package copy;

public class firstpart {
	public static void main(String[] args) {
		System.out.println("=====================΢�⹤����צ������======================");

		Object glimmer1 = new Object();
		Object glimmer2 = new Object();
		Object glimmer3 = glimmer1;

		System.out.println("Object Test 0�Ľ���ǣ�" + glimmer1);
		System.out.println("Object Test 1�Ľ���ǣ�" + (glimmer1 == glimmer2));
		System.out.println("Object Test 2�Ľ���ǣ�" + (glimmer1.equals(glimmer2)));
		System.out.println("Object Test 3�Ľ���ǣ�" +(glimmer1.equals(glimmer3)));
		System.out.println("Object Test 4�Ľ���ǣ�" + (glimmer1 == glimmer3));
		System.out.println("Object Test 5�Ľ���ǣ�" + (glimmer2.equals(glimmer3)));
		System.out.println("Object Test 6�Ľ���ǣ�" + (glimmer2 == glimmer3));
	}

}
