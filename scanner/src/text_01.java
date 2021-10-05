
import java.util.Scanner;

public class text_01{
    public static int factorial(int n) {
        int result=1;
        for(int i=1;i<=n;i++) 
            result=result*i;
        return result;
    }   //实现阶乘运算的方法

    public static int sum(int n) {
        int result=0;
        for(int i=1;i<=n;i++)
            result=result+factorial(i);
        return result;
    }    //实现阶乘的和

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);  // 从键盘中读取输入数字
        int num;
        int result;
        while(num1.hasNextInt()){
        	num=num1.nextInt();
        	if(num<=0)
                System.out.println("输入数字有误");
            else {
                result = sum(num);
                    System.out.println("结果为"+result);
            }   
        }
    	num1.close();  
    }
}
