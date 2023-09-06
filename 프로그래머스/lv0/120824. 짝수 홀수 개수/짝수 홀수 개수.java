class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                answer[0] += 1;
            }else{
                answer[1] += 1;
            }
        }
        
        return answer;
    }
}

// 다른 사람의 풀이
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}
