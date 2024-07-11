package com.neoteric.passionprobike.model;

public class BikeService {

    public String engineOilchange;
    public String  engineOilName;
    public String  tyreChange;
    public String  tyreName;
    public String paintchange;
    public String waterWash;
    public String bore;


    @Override
    public String toString() {
        return "BikeService{" +
                "engineOilchange='" + engineOilchange + '\'' +
                ", engineOilName='" + engineOilName + '\'' +
                ", tyreChange='" + tyreChange + '\'' +
                ", tyreName='" + tyreName + '\'' +
                ", paintchange='" + paintchange + '\'' +
                ", waterWash='" + waterWash + '\'' +
                ", bore='" + bore + '\'' +
                '}';
    }
}
