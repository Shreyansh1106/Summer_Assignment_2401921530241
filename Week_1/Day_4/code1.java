class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int x=mat.length;
        int y=mat[0].length;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==j || i+j==x-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
