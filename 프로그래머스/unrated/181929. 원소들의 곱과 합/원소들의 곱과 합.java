class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int mulSum = 1;
        
        for(int x : num_list){
            
            sum += x;
            mulSum *= x;
            
            if(sum*sum > mulSum){
                answer = 1;
            } else {
                answer = 0;
            }            
        }        
        return answer;
    }
}