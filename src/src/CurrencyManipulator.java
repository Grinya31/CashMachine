package src;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CurrencyManipulator {

    private String currencyCode;
    private Map<Integer,Integer> denominations;

    public CurrencyManipulator(String currencyCode) {
        if (currencyCode == null || currencyCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Currency code cannot be null or empty");
        }
        this.currencyCode = currencyCode.toUpperCase();
        this.denominations = new HashMap<>();
        System.out.println("CurrencyManipulator created for: " + this.currencyCode);
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void addAmount(int denomination, int count) throws IOException {
            if (denominations.containsKey(denomination)) {
                denominations.put(denomination, denominations.get(denomination) + count);
            } else {
                denominations.put(denomination, count);
            }


    }

    public int getTotalAmount(){
        int a = 0;
        for (Integer denomination: denominations.keySet()) {
            a += denomination * denominations.get(denomination);
        }
        return a;
    }

    public boolean hasMoney(){
        int a = 0;
        for ( Integer count : denominations.values()){
            a+= count;}
        if ( a <=  0 ){ return false;}
        else { return true;}
    }



}
