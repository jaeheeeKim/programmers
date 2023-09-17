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