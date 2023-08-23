class Solution {
    public int[] solution(int n) {
        int[] arr;
        
        if(n%2 == 0){
            arr = new int[n/2];
        }else{
            arr = new int[n/2+1];
        }
        int j = 0;
        for(int i=0; i<=n; i++){
            if(i%2 == 1){
                arr[j]  = i;
                j++;
            }
        }
        
        return arr;
    }
}