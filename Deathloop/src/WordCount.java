import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordCount {
	    public static void main(String[] args) {
	        String text = "In a village of La Mancha, the name of which I have no desire to call to\n"
	                + "mind, there lived not long since one of those gentlemen that keep a lance\n"
	                + "in the lance-rack, an old buckler, a lean hack, and a greyhound for\n"
	                + "coursing. An olla of rather more beef than mutton, a salad on most\n"
	                + "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra\n"
	                + "on Sundays, made away with three-quarters of his income.";
	        List<String> tops = top3(text);
	        List<String> textWords = new ArrayList<String>();
	        
	        for (String line: text.split("\n")){	
	        	for (String word: line.split(" ")){
	        		if(word.endsWith(",")||word.endsWith(".")||word.endsWith("?")||word.endsWith("!"))
	        		word = word.substring(0, word.length()-1);	        			
	        		word = word.toLowerCase();
	        		textWords.add(word);
	        	}	        
	        }        
	        
	        tops.forEach(System.out::println);
	    }

	    public static List<String> top3(String s) {
	        //todo 写完这个方法！
	        List<String> textWords = new ArrayList<String>();
	        List<String> tops3 = new ArrayList<String>();
	        //最高出现单词的次数	        
	        int firstNum = 0;
	     	int secondNum = -1;      
	        int thirdNum = -2;
	        
	        String firstWord = new String("FirstWord");
	        String secondWord = new String("SecondWord");
	        String thirdWord = new String("ThirdWord");
	        
	        //把文本拆成单词
	        for (String line: s.split("\n")){	
	        	for (String word: line.split(" ")){
	        		if(word.endsWith(",")||word.endsWith(".")||word.endsWith("?")||word.endsWith("!"))
	        		word = word.substring(0, word.length()-1);	        			
	        		word = word.toLowerCase();
	        		textWords.add(word);
	        	}	        
	        }        
	    	//遍历单词找出现率高的单词
	        for (String word: textWords) {
	        	int num;
	        	num = Collections.frequency(textWords, word);
	        	if(num>thirdNum && num<secondNum) {
	        		thirdWord = word;	
	        		thirdNum = num;
	        	}
	        	
	        	if(num>secondNum && num<firstNum) {        		
	        		thirdWord = secondWord;
	        		secondWord = word;	     
	        		secondNum = num;
	        	}
	        	
	        	if(num>firstNum) {
	        		thirdWord = secondWord;
	        		secondWord = firstWord;
	        		firstWord = word;
	        		firstNum = num;
	        	}
	        	        	
	        }

	    	tops3.add(firstWord);
	    	tops3.add(secondWord);
	    	tops3.add(thirdWord);        
	        
	    	return tops3;
	        
	        
	        
	    }
	}

