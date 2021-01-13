package com.altimetrik.microservicedemo.service;

import com.altimetrik.microservicedemo.client.PartClient;
import com.altimetrik.microservicedemo.model.PartsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MicroserviceDemoService {

    @Autowired
    private PartClient partClient;

    public String printPart(Long id){
        PartsResponse response = partClient.printPart(id).getBody();
        String partName = response.getName();
        Double price = response.getPrice_per_unit();
        return "Price per unit of " + partName + " is $" +price;
    }

}
