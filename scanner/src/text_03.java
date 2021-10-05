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
	}  //判断输入的算法
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String answer = "0";  //初始化answer
		String str1, str2;
		String answers, lastanswer;
		int num1, num2, num3, num4, letter, lastline;	
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\招新\\java\\01\\第三部分\\计算结果.txt", true);  //文件输出流
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\招新\\java\\01\\第三部分\\计算结果.txt");  //文件输入流
		String str = new String();
		try {
			answers = new String(fis.readAllBytes());
		    lastline = answers.lastIndexOf("\r\n", answers.length()-3);
		    lastanswer = answers.substring(lastline, answers.length()-1);
		    System.out.println("上次计算结果"+lastanswer);
		    System.out.println("请依次输入一个整数、一个运算符、另一个整数，输入q退出");
		}catch (java.lang.StringIndexOutOfBoundsException e) {
			 System.out.println("当前无计算记录");
			 System.out.println("请依次输入一个整数、一个运算符、另一个整数，输入q退出");
			 str = scan.nextLine();
		 }
		
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
				answer =str + "=" + num3;
				System.out.println("计算结果："+answer);	
				System.out.println("输入q退出，输入s保存此次计算结果");
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
					answer =str + "=" + num3;
					System.out.println("计算结果："+answer);		
					System.out.println("输入q退出，输入s保存此次计算结果");
					str = scan.nextLine();
				}
	        	if(str.indexOf('-')==0) {
	        		letter = str.indexOf("-",1);
	        		str1 = str.substring(0, letter);  //从str取出第一个数字				
					str2 = str.substring(letter+1, str.length());  //从str取出第一个数字				
					num1 = Integer.parseInt(str1);  //转化成int形				
					num2 = Integer.parseInt(str2);  //转化成int形				
					num3 = num1-num2;  //得出结果				
					answer =str + "=" + num3;
					System.out.println("计算结果："+answer);	
					System.out.println("输入q退出，输入s保存此次计算结果");
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
				answer =str + "=" + num3;
				System.out.println("计算结果："+answer);	
				System.out.println("输入q退出，输入s保存此次计算结果");
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
				answer =str + "=" + num3;
				System.out.println("计算结果："+answer);	
				System.out.println("输入q退出，输入s保存此次计算结果");
				str = scan.nextLine();
	        }		       
	        
	        if(str.equals("s") && !answer.equals("0")) {
	        	fos.write(answer.getBytes());
	        	fos.write("\r\n".getBytes());
	        	System.out.println("保存成功");
	        	System.out.println("请依次输入一个整数、一个运算符、另一个整数，输入q退出");
	        	str = scan.nextLine();
	        }
	        
		} catch (NumberFormatException e) {
			System.out.println("输入格式有误哦，请重新输入");
			str = scan.nextLine();
		}
		}
        scan.close();
        fos.close();
        fis.close();
        System.out.println("退出运算");
	}
}