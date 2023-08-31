class Solution {
    public int[] solution(String[] strlist) {
        int x = strlist.length;
        int[] y = new int[x];
        int z = 0;

        for(int i = 0; i<x; i++) {
            y[i] = strlist[i].length();
        }

        int[] answer = {z};
        return y;
    }
}

// 다른 사람의 풀이가 더 깔끔한듯
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i=0; i<strlist.length;i++){
            answer[i]= strlist[i].length();
        }
        return answer;
    }
}
