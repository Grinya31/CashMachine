package src;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CurrencyManipulator {

    private String currencyCode;
    private Map<Integer,Integer> denominations;

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
        this.denominations = new TreeMap<>();
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


}
