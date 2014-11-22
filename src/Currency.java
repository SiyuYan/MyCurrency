/**
 * Created by Administrator on 2014/11/18.
 */
//import java.util.*;
abstract public class Currency {

    //默认汇率，美元为参照
    static double rateInit = 1.0;
    private String name="未定义货币";
    private double value;
    abstract double getRate();

    Currency(String name, String value) {
        this.name = name;
        this.setValue(new Double(value).doubleValue());
    }
    public void Add(Currency currency) {
        this.setValue(this.getValue() + currency.getValue()/currency.getRate()*this.getRate());
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}