package com.choosemuse.example.libmuse;

/**
 * Created by User on 2016-11-19.
 */

public class DataPoint {
    double beta;
    double alpha;
    double theta;

    public DataPoint(double a, double b, double t){
        alpha = a;
        beta  = b;
        theta = t;
    }

    public String toString(){
        return alpha + "," + beta + "," + theta + "\n";
    }

    public boolean isFocused(){
        return true; //figure out the requirements for user to be focused
    }

}
