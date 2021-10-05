
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
	}  //判断输入的算法
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请依次输入一个整数、一个运算符、另一个整数，输入q退出");
		String str = scan.nextLine();
		String str1, str2;
		int num1, num2, num3, num4, letter;	
		while(!str.equals("q")) {
		try {
			if(chooseway(str) == 0) {
	        	System.out.println("输入格式有误哦，请重新输入");
	        	str = scan.nextLine();
	        }
			
			if(chooseway(str) == 1) {
				letter = str.indexOf("+");			
				str1 = str.substring(0, letter);  //从str取出第一个数字
				str2 = str.substring(letter+1, str.length());  //从str取出第一个数字
				num1 = Integer.parseInt(str1);  //转化成int形
				num2 = Integer.parseInt(str2);  //转化成int形
				num3 = num1+num2;  //得出结果
				System.out.println(str + "=" + num3);
				str = scan.nextLine();
			}
			
			if(chooseway(str) == 2) {
				if(str.indexOf("-") !=0) {
					letter = str.indexOf("-");				
					str1 = str.substring(0, letter);  //从str取出第一个数字				
					str2 = str.substring(letter+1, str.length());  //从str取出第一个数字				
					num1 = Integer.parseInt(str1);  //转化成int形				
					num2 = Integer.parseInt(str2);  //转化成int形				
					num3 = num1-num2;  //得出结果				
					System.out.println(str + "=" + num3);				
					str = scan.nextLine();
				}
	        	if(str.indexOf('-')==0) {
	        		letter = str.indexOf("-",1);
	        		str1 = str.substring(0, letter);  //从str取出第一个数字				
					str2 = str.substring(letter+1, str.length());  //从str取出第一个数字				
					num1 = Integer.parseInt(str1);  //转化成int形				
					num2 = Integer.parseInt(str2);  //转化成int形				
					num3 = num1-num2;  //得出结果				
					System.out.println(str + "=" + num3);				
					str = scan.nextLine();
	        	}
	        }
			
	        if(chooseway(str) == 3) { 
	        	letter = str.indexOf("*");
				str1 = str.substring(0, letter);  //从str取出第一个数字
				str2 = str.substring(letter+1, str.length());  //从str取出第一个数字
				num1 = Integer.parseInt(str1);  //转化成int形
				num2 = Integer.parseInt(str2);  //转化成int形
				num3 = num1*num2;  //得出结果
				System.out.println(str + "=" + num3);
				str = scan.nextLine();
	        }
	        
	        if(chooseway(str) == 4) {
	        	letter = str.indexOf("/");
				str1 = str.substring(0, letter);  //从str取出第一个数字
				str2 = str.substring(letter+1, str.length());  //从str取出第一个数字
				num1 = Integer.parseInt(str1);  //转化成int形
				num2 = Integer.parseInt(str2);  //转化成int形
				num3 = num1/num2;  //得出结果
				num4 = num1%num2;
				System.out.println(str + "=" + num3 + "......" +num4);
				str = scan.nextLine();
	        }		       
	        
		} catch (NumberFormatException e) {
			System.out.println("输入格式有误哦，请重新输入");
			str = scan.nextLine();
		}
		}
        scan.close();
        System.out.println("退出运算");
	}
}