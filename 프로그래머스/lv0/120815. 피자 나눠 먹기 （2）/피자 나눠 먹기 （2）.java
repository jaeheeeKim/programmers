class Solution {
    public int solution(int n) {
        int answer = 0;
        int max = 0;
        if(1 <= n && n <= 100){
            for(int i=1; i<=n; i++){
                if(n%i == 0 && 6%i == 0){
                    max = i;
                }
                answer = (n*6 / max) / 6;
            }            
        }
        return answer;
    }
}