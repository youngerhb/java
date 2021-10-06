
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Streamdemo {
    public static void main(String[] args) {
        String text = "In a village of La Mancha, the name of which I have no desire to call to\n"
                + "mind, there lived not long since one of those gentlemen that keep a lance\n"
                + "in the lance-rack, an old buckler, a lean hack, and a greyhound for\n"
                + "coursing. An olla of rather more beef than mutton, a salad on most\n"
                + "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra\n"
                + "on Sundays, made away with three-quarters of his income.";
        List<String> tops = top3(text);
        tops.forEach(System.out::println);
    }

    public static List<String> top3(String s) {
        //todo д�����������   	
    	List<String> tops3 = Arrays.asList(s.split("\n|\\ |, |\\.")).stream()  //ȡ���ı��ĵ�������
    			.map(str -> str+" "+Collections.frequency(Arrays.asList(s.split("\n|\\ |, |\\.")), str)) //�����ںϣ��Ѹ����ʺ���������ı��еĴ��������������á� ���ո�����������ʹ��
    			.distinct()  //ɾ���ظ��ĵ���
    			//ȡ�������ʺ�������ֲ���������
    			.sorted((word1, word2) -> Integer.parseInt(word2.substring(word2.indexOf(" ")+1, word2.length())) 
    					- Integer.parseInt(word1.substring(word1.indexOf(" ")+1, word1.length())))
    			.limit(3)  //ֻ��ǰ��������
    			.map(str -> str.substring(0, str.indexOf(" ")))
    			.toList();  			
        return tops3;
    }
}