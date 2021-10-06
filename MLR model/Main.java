package com;

public class Main {
    public static void main(String[] args){
        double[][] dataSet = new double[][]{
                {41.9,  29.1,   251.3},
                {43.4,  29.3,   251.3},
                {43.9,  29.5,   248.3},
                {44.50, 29.7,   267.5},
                {47.3,  29.9,   273},
                {47.50, 30.3,   276.5},
                {47.9,  30.5,   270.3},
                {50.2,  30.7,   274.9},
                {52.8,  30.8,   285},
                {53.2,  30.9,   290},
                {56.7,  31.5,   297},
                {57,    31.7,   302.5},
                {63.5,  31.9,   304.5},
                {65.3,  32,     309.5},
                {71.1,  32.1,   321.7},
                {77,    32.5,   330.7},
                {77.8,  32.9,   349}
        };

        double x = 0.0;

        if (args.length > 0) {
            try {
                x = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument [" + args[0] + "] must be a number.");
                System.exit(1);
            }
        }

        MLR mlr = new MLR(dataSet);
    }
}
