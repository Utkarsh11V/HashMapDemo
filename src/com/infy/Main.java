package com.infy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("orderId","132456");
        hm.put("messageType","Pending");
        hm.put("orderType","buy");

        System.out.println(hm);

        /* for(int i=0; i<hm.size(); i++){

        } */
        System.out.println("** Iteration using Iterator ***");
        Set keys = hm.keySet();
        Iterator itr = keys.iterator();
        while(itr.hasNext()){
            String key = (String) itr.next();
            System.out.println("key : "+key+"   value : "+hm.get(key));
        }
        System.out.println("*** Iteration using Map.Entry *****");
        Set<Map.Entry<String, String>> hset = hm.entrySet();
        Iterator<Map.Entry<String,String>> itr1 = hset.iterator();
        while(itr1.hasNext()) {
            Map.Entry<String, String> em = (Map.Entry<String, String>)itr1.next();
            System.out.println("key : "+ em.getKey()+ "  value: "+em.getValue());
        }

        System.out.println("** Iteration using Map.Entry Again ***");
        Iterator<Map.Entry<String, String>>  itr2=hm.entrySet().iterator();
        while(itr2.hasNext()){
            Map.Entry<String, String> em1 = itr2.next();
            System.out.println("key : "+ em1.getKey()+ "  value: "+em1.getValue());
        }


    }
}
