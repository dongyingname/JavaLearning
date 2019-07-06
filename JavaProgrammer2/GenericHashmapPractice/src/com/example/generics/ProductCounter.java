/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.generics;

import java.util.*;

/**
 *
 * @author yingd
 */
public class ProductCounter {

    private Map<String, Long> productCountMap = new HashMap<>();
    private Map<String, String> productNames = new TreeMap<>();

    public static void main(String[] args) {
        String[] parts = new String[]{"1s01", "1s01", "1s01", "1s01", "1s01",
            "1s01", "1s02", "1s02"};
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1s01");
        productNames.put("Black Polo Shirt", "1s02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug", "1M02");
        
        ProductCounter pc1 = new ProductCounter(productNames);
        pc1.processList(parts);
        pc1.printReport();

    }

    public ProductCounter(Map productNames) {
        this.productNames =  productNames;
    }

    public void processList(String[] list){
        long curVal = 0 ;
        for (String itemNumber: list){
            if (productCountMap.containsKey(itemNumber)){
                curVal = productCountMap.get(itemNumber);
                curVal++;
                productCountMap.put(itemNumber, new Long(curVal));
            } else {
                productCountMap.put(itemNumber,new Long(1));
            }
        }
    }
    
    public void printReport(){
        System.out.println("=== Product Report===");
        for (String key:productNames.keySet()){
            System.out.print("Name: " + key);
            System.out.println("\t\tcount: " + 
                    productCountMap.get(productNames.get(key)));
        }
    }
    


    
}
