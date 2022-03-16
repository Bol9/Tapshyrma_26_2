package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {
	// write your code here
        City city = new City();


        Map<Integer,String> cityMap = new HashMap<>();
        cityMap.put(city.setCode(07),city.setName("Talas"));
        cityMap.put(city.setCode(01),city.setName("Bishke"));
        cityMap.put(city.setCode(2131323221),city.setName("Osh"));
        cityMap.put(city.setCode(2324),city.setName("Batken"));
        cityMap.put(city.setCode(1223),city.setName("Naryn"));
        cityMap.put(city.setCode(23243), city.setName("Chuy"));

        //System.out.println(cityMap);
        Map<Integer,String> oddCityCode = new TreeMap<>();

        for (Map.Entry elem: cityMap.entrySet()
             ) {

            if(((int)elem.getKey() % 2) == 1){
                oddCityCode.put((int) elem.getKey(),(String) elem.getValue());

            }
        }
        for (Map.Entry element: oddCityCode.entrySet()
             ) {
            System.out.println(element.getKey()+"  "+element.getValue()); // TreeSet itak kicineden chongo karap saktait

        }
        //System.out.println(oddCityCode);



    }
}
