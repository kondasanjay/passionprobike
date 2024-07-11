package com.neoteric.passionprobike;

import com.neoteric.passionprobike.model.Address;
import com.neoteric.passionprobike.model.BikeForm;
import com.neoteric.passionprobike.model.BikeService;
import com.neoteric.passionprobike.service.BikeServiceSer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BikeServiceTest {


    @Test

    public void bikeserviceafterrepair(){

        BikeForm customer1=new BikeForm();

        customer1.FirstName="sanjay";
        customer1.LastName="konda";
        customer1.phoneNumber=9876543212l;
        customer1.bikemodel="pulsar125";
        customer1.repairCondition="bore";
        customer1.bore="yes";
        customer1.price="8000";


        Address address=new Address();

        address.StreetName = "manasa nagar";
        address.Area = "busstand backside";
        address.City = "suryapet";
        address.District = "suryapet";
        address.PinCode = 232222;

        customer1.address=address;


        BikeServiceSer bikeServiceSer=new BikeServiceSer();
        BikeService bikeService=bikeServiceSer.getBikeService(customer1);

        System.out.println(customer1);
        System.out.println(address);
        System.out.println(bikeService);

       Assertions.assertEquals(8000,customer1.price);
       Assertions.assertNotNull(bikeService);

    }
}
