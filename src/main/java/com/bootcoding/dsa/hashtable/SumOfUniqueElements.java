package com.bootcoding.dsa.hashtable;

import java.util.HashMap;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int a[] = {10, 20, 10, 30, 20, 40};
        //find unique elements in an array

        HashMap<Integer , Integer> store = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(store.containsKey(a[i])){
                int value = store.get(a[i]);
                store.put(a[i] ,value + 1);
            }
            else{
                store.put(a[i] ,1);
            }
        }
        int sum =0;
        for(Integer key : store.keySet()){
            int value =  store.get(key); // no. of occurences)
            if(value == 1){
               sum += key;
            }
        }
        System.out.println(sum);
    }
}
