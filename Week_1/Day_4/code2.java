class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int temp[][]=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        int a=0,b=0;
        if(m*n != r*c) return mat;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[a][b]=mat[i][j];
                b++;
                if(b==c){
                    b=0;
                    a++;
                }
            }
        }
        return temp;
    }
}
