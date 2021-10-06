package com;

public class MLR {
    private double[][] X, Y, XT;
    private int rows, cols;

    public MLR(double[][] dataSet){
        rows = dataSet.length;
        cols = dataSet[0].length;

        X = getXMatrix(dataSet);
        //Y = getXMatrix(dataSet);
        //XT = getXMatrix(dataSet);
    }

    private double[][] getXMatrix(double[][] dataSet){
        double[][] X = new double[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 1; j < cols; j++){
                X[i][0] = 1;
                X[i][j] = dataSet[i][j - 1];
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(X[i][j] + " | ");
            }
            System.out.println();
        }


        return X;
    }
}
