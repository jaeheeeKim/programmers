class Solution {
    public int solution(int n, String control) {
        
        String [] arr = control.split("");
        
        for(String i : arr) {
            if(i.equals("w")) {
                n += 1;
            } else if(i.equals("s")) {
                n -= 1;
            } else if(i.equals("d")) {
                n += 10;
            } else {
                n -= 10;
            }    
        }
        return n;
    }
}