public class RotateImage {
    public void rotate(int[][] matrix) {
transposeMatrix(matrix);
reverseRows(matrix);
    }

    private void transposeMatrix(int matirx[][]){
        for (int i=0;i<matirx.length;i++){
            for (int j=0;j<=i;j++){
                int temp=matirx[i][j];
                matirx[i][j]=matirx[j][i];
                matirx[j][i]=temp;
            }
        }
    }
    private void reverseRows(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            int left=0;
            int right=matrix.length-1;
            while (left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right++;
            }

        }
    }
    //Transpose Matrix
    // reverse the transpose the matrix
    public static void main(String[] args) {

    }
}
