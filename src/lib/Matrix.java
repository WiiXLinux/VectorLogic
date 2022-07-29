package lib;

public final class Matrix {
    private double[][] matrix;
    private int[] bounds = new int[2];

    public double[][] getMatrix() {
        return matrix;
    }

    public int[] getBounds() {
        return bounds;
    }

    public static Matrix nullMatrix(int x, int y){
        return new Matrix(new double[]{0});
    }


    public Matrix(double[][] matrix){
        this.matrix = matrix;
        bounds[0] = matrix.length;
        bounds[1] = matrix[0].length;
    }

    public Matrix(double[] vector){
        this.matrix[0] = vector;
        bounds[0] = vector.length;
        bounds[1] = 1;
    }





    public static Matrix vectorProduct(Matrix a, Matrix b){
        return null;
    }

    public static double scalarProduct(Matrix a, Matrix b) throws Exception {
        if (a.bounds != b.bounds){
            throw new Exception("Matrix " + a +" and Matrix " + b + "are not of the same size");
        }

        double temp = 0;

        for(int i = 0; i < a.bounds[0]; i++){
            for(int j = 0; j < a.bounds[1]; j++){
                temp += a.matrix[i][j] * b.matrix[i][j];
            }
        }

        return temp;
    }

    public static Matrix sum(Matrix a, Matrix b) throws Exception {
        if (a.bounds != b.bounds){
            throw new Exception("Matrix " + a +" and Matrix " + b + "are not of the same size");
        }

        double[][] temp = new double[a.bounds[0]][a.bounds[1]];

        for(int i = 0; i < a.bounds[0]; i++){
            for(int j = 0; j < a.bounds[1]; j++){
                temp[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }

        return new Matrix(temp);
    }

}
