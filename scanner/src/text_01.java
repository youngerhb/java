
import java.util.Scanner;

public class text_01{
    public static int factorial(int n) {
        int result=1;
        for(int i=1;i<=n;i++) 
            result=result*i;
        return result;
    }   //ʵ�ֽ׳�����ķ���

    public static int sum(int n) {
        int result=0;
        for(int i=1;i<=n;i++)
            result=result+factorial(i);
        return result;
    }    //ʵ�ֽ׳˵ĺ�

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);  // �Ӽ����ж�ȡ��������
        int num;
        int result;
        while(num1.hasNextInt()){
        	num=num1.nextInt();
        	if(num<=0)
                System.out.println("������������");
            else {
                result = sum(num);
                    System.out.println("���Ϊ"+result);
            }   
        }
    	num1.close();  
    }
}
