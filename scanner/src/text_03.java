import java.io.*;
import java.util.Scanner;
public class text_03 {
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
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String answer = "0";  //��ʼ��answer
		String str1, str2;
		String answers, lastanswer;
		int num1, num2, num3, num4, letter, lastline;	
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\����\\java\\01\\��������\\������.txt", true);  //�ļ������
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\����\\java\\01\\��������\\������.txt");  //�ļ�������
		String str = new String();
		try {
			answers = new String(fis.readAllBytes());
		    lastline = answers.lastIndexOf("\r\n", answers.length()-3);
		    lastanswer = answers.substring(lastline, answers.length()-1);
		    System.out.println("�ϴμ�����"+lastanswer);
		    System.out.println("����������һ��������һ�����������һ������������q�˳�");
		}catch (java.lang.StringIndexOutOfBoundsException e) {
			 System.out.println("��ǰ�޼����¼");
			 System.out.println("����������һ��������һ�����������һ������������q�˳�");
			 str = scan.nextLine();
		 }
		
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
				answer =str + "=" + num3;
				System.out.println("��������"+answer);	
				System.out.println("����q�˳�������s����˴μ�����");
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
					answer =str + "=" + num3;
					System.out.println("��������"+answer);		
					System.out.println("����q�˳�������s����˴μ�����");
					str = scan.nextLine();
				}
	        	if(str.indexOf('-')==0) {
	        		letter = str.indexOf("-",1);
	        		str1 = str.substring(0, letter);  //��strȡ����һ������				
					str2 = str.substring(letter+1, str.length());  //��strȡ����һ������				
					num1 = Integer.parseInt(str1);  //ת����int��				
					num2 = Integer.parseInt(str2);  //ת����int��				
					num3 = num1-num2;  //�ó����				
					answer =str + "=" + num3;
					System.out.println("��������"+answer);	
					System.out.println("����q�˳�������s����˴μ�����");
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
				answer =str + "=" + num3;
				System.out.println("��������"+answer);	
				System.out.println("����q�˳�������s����˴μ�����");
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
				answer =str + "=" + num3;
				System.out.println("��������"+answer);	
				System.out.println("����q�˳�������s����˴μ�����");
				str = scan.nextLine();
	        }		       
	        
	        if(str.equals("s") && !answer.equals("0")) {
	        	fos.write(answer.getBytes());
	        	fos.write("\r\n".getBytes());
	        	System.out.println("����ɹ�");
	        	System.out.println("����������һ��������һ�����������һ������������q�˳�");
	        	str = scan.nextLine();
	        }
	        
		} catch (NumberFormatException e) {
			System.out.println("�����ʽ����Ŷ������������");
			str = scan.nextLine();
		}
		}
        scan.close();
        fos.close();
        fis.close();
        System.out.println("�˳�����");
	}
}