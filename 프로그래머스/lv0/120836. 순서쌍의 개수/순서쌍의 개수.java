class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i*j == n){
                    answer++;
                }
                if(i*j > n){
                    break;
                }
            }
        }
        return answer;
    }
}

// 다른 사람의 풀이
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer++;
            }
        }
        return answer;
    }
}
