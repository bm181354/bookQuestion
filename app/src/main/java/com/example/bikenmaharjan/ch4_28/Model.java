package com.example.bikenmaharjan.ch4_28;

/**
 * Created by bikenmaharjan on 10/1/17.
 */



public class Model {

    public Model(){}

    public double conMetersToMiles(double miles){

        double meters = miles / 0.62137;
        return meters;

    }
    public double conMilesToMeters(double meters){

        double miles = meters * 0.62137;
        return miles;
    }

    public String getType(int type){

        if(type == 0){

            return "Meters";
        }
        else {

            return "Miles";
        }

    }
}
