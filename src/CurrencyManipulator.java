import java.util.Map;

public class CurrencyManipulator {

    private String currencyCode;
    private Map<Integer,Integer> denomination;

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }


}
