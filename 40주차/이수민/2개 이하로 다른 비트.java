class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i] = numbers[i];
        }
           for (int i = 0; i < numbers.length; i++) {
            answer[i]++; 
            answer[i] += (answer[i] ^ numbers[i]) >> 2;
        }
        return answer;
    }
}
