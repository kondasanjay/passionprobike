package com.neoteric.passionprobike.service;

import com.neoteric.passionprobike.model.BikeForm;
import com.neoteric.passionprobike.model.BikeService;

public class BikeServiceSer {


    public BikeService getBikeService(BikeForm customer1){

        BikeService bikeService=null;

        if(customer1.price =="8000"){

            bikeService=new BikeService();

            bikeService.engineOilchange="yes";
            bikeService.engineOilName="castrol";
            bikeService.tyreChange="yes";
            bikeService.tyreName="MRF";
            bikeService.paintchange="yes";
            bikeService.waterWash="yes";
            bikeService.bore="No(new condition)";


        }

        return bikeService;
    }
}
