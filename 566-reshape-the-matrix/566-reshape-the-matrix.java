class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matr=mat.length,matc=mat[0].length;
        if(matr*matc!=r*c) return mat;
        int[][] result=new int[r][c];
        int newArrayC=0,newArrayR=0;
        for(int i=0;i<matr;i++){
            for(int j=0;j<matc;j++){
                result[newArrayR][newArrayC++]=mat[i][j];
                if(c==newArrayC){
                    newArrayC=0;
                    newArrayR++;
                }
            }
        }
        return result;
    }
}