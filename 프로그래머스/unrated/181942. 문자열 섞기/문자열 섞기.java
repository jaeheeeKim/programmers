class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int a=0; a<str1.length(); a++){
            answer += "" + str1.charAt(a) + str2.charAt(a);
        }

        return answer;
    }
}