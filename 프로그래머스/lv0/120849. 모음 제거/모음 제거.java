class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        String[] result = my_string.split("");
        
        for(int i=0; i<my_string.length(); i++){
            if(result[i].equals("a") || result[i].equals("e") || result[i].equals("i") || result[i].equals("o") || result[i].equals("u")){
                continue;
            }
            sb.append(result[i]);
        }
        
        return sb.toString();
    }
}