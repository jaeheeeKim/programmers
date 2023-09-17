import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String morse = ".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..";
		String[] p1 = morse.split(",");
		String[] p2 = letter.split(" ");
		
		Map map = new HashMap<String, String>();
		for(int i=0; i<p1.length; i++) {
			map.put(p1[i], (char)(97+i));	
		}
		
		for(int i=0; i<p2.length; i++) {
			answer += map.get(p2[i]);
		}
        return answer;
    }
}

// 다른 사람의 풀이
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");

        for(int i=0;i<word.length;i++){
            for(int j=0;j<morse.length;j++){
                if(word[i].equals(morse[j])) answer+=(char)(j+97);
            }
        }

        return answer;
    }
}
