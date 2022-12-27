class Solution {
    public int solution(int num) {
        int answer=0;
        /* 파라미터는 int 타입이지만, int의 최대치로 인하여 오버플로우 발생.
           그렇기에, 타입을 long 으로 놓고 풀어야 하는 문제. */
        long longNum=num; 
        
        //1.1이 될 때까지 반복
        while(longNum!=1){
        	//짝수 만들기
            if(longNum%2==0){
                longNum=longNum/2;
            } 
            //홀수 만들기
            else{
                longNum=longNum*3+1;
            }
            //몇번째의 작업 한지 세기.
            answer++;
        }
        //만약 500회가 넘을 경우에 -1 반환 
        if(answer>500){
            return -1;
        }
        return answer;
    }
}
