class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int biga = Integer.parseInt("" + a + b);
        int bigb = Integer.parseInt("" + b + a);
        answer = biga > bigb ? biga : bigb;

        return answer;
    }
}