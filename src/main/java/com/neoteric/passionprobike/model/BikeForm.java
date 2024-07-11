package com.neoteric.passionprobike.model;

public class BikeForm {

    public String FirstName;
    public String  LastName;
   public long phoneNumber;


   public Address address;

   public  String bikemodel;
  public String repairCondition;

    public String price;
  public String bore;

    @Override
    public String toString() {
        return "BikeForm{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address +
                ", bikemodel='" + bikemodel + '\'' +
                ", repairCondition='" + repairCondition + '\'' +
                ", price='" + price + '\'' +
                ", bore='" + bore + '\'' +
                '}';
    }
}
