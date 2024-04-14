class 이웃한칸 {
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];
        
        int answer = 0;
        
        int right = (w+1==board[0].length) ? 0 : 1;
        int left = (w-1==-1) ? 0 : 1;
        int height = (h-1==-1) ? 0 : 1;
        int below = (h+1==board.length) ? 0 : 1;
        
        if(right==1) answer = (board[h][w+1].equals(color)) ? answer + 1 : answer;
        if(left==1) answer = (board[h][w-1].equals(color)) ? answer + 1 : answer;
        if(height==1) answer = (board[h-1][w].equals(color)) ? answer + 1 : answer;
        if(below==1) answer = (board[h+1][w].equals(color)) ? answer + 1 : answer;
        
        return answer;
    }
}