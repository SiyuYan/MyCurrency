/**
 * Created by Administrator on 2014/11/18.
 */

public class Dollars extends Currency {

    Dollars(String name, String value) {
        super(name, value);
    }

    @Override
    double getRate() {
        return rateInit*1.0;
    }


}
