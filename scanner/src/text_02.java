
import java.util.Scanner;
public class text_02 {
	public static int chooseway(String str) {
		if(str.indexOf('+') != -1)
			return 1;
		if(str.indexOf('*') != -1)
			return 3;
		if(str.indexOf('/') != -1)
			return 4;	
		if(str.indexOf('-') != -1)
			return 2;	
		return 0;
	}  //�ж�������㷨
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������һ��������һ�����������һ������������q�˳�");
		String str = scan.nextLine();
		String str1, str2;
		int num1, num2, num3, num4, letter;	
		while(!str.equals("q")) {
		try {
			if(chooseway(str) == 0) {
	        	System.out.println("�����ʽ����Ŷ������������");
	        	str = scan.nextLine();
	        }
			
			if(chooseway(str) == 1) {
				letter = str.indexOf("+");			
				str1 = str.substring(0, letter);  //��strȡ����һ������
				str2 = str.substring(letter+1, str.length());  //��strȡ����һ������
				num1 = Integer.parseInt(str1);  //ת����int��
				num2 = Integer.parseInt(str2);  //ת����int��
				num3 = num1+num2;  //�ó����
				System.out.println(str + "=" + num3);
				str = scan.nextLine();
			}
			
			if(chooseway(str) == 2) {
				if(str.indexOf("-") !=0) {
					letter = str.indexOf("-");				
					str1 = str.substring(0, letter);  //��strȡ����һ������				
					str2 = str.substring(letter+1, str.length());  //��strȡ����һ������				
					num1 = Integer.parseInt(str1);  //ת����int��				
					num2 = Integer.parseInt(str2);  //ת����int��				
					num3 = num1-num2;  //�ó����				
					System.out.println(str + "=" + num3);				
					str = scan.nextLine();
				}
	        	if(str.indexOf('-')==0) {
	        		letter = str.indexOf("-",1);
	        		str1 = str.substring(0, letter);  //��strȡ����һ������				
					str2 = str.substring(letter+1, str.length());  //��strȡ����һ������				
					num1 = Integer.parseInt(str1);  //ת����int��				
					num2 = Integer.parseInt(str2);  //ת����int��				
					num3 = num1-num2;  //�ó����				
					System.out.println(str + "=" + num3);				
					str = scan.nextLine();
	        	}
	        }
			
	        if(chooseway(str) == 3) { 
	        	letter = str.indexOf("*");
				str1 = str.substring(0, letter);  //��strȡ����һ������
				str2 = str.substring(letter+1, str.length());  //��strȡ����һ������
				num1 = Integer.parseInt(str1);  //ת����int��
				num2 = Integer.parseInt(str2);  //ת����int��
				num3 = num1*num2;  //�ó����
				System.out.println(str + "=" + num3);
				str = scan.nextLine();
	        }
	        
	        if(chooseway(str) == 4) {
	        	letter = str.indexOf("/");
				str1 = str.substring(0, letter);  //��strȡ����һ������
				str2 = str.substring(letter+1, str.length());  //��strȡ����һ������
				num1 = Integer.parseInt(str1);  //ת����int��
				num2 = Integer.parseInt(str2);  //ת����int��
				num3 = num1/num2;  //�ó����
				num4 = num1%num2;
				System.out.println(str + "=" + num3 + "......" +num4);
				str = scan.nextLine();
	        }		       
	        
		} catch (NumberFormatException e) {
			System.out.println("�����ʽ����Ŷ������������");
			str = scan.nextLine();
		}
		}
        scan.close();
        System.out.println("�˳�����");
	}
}