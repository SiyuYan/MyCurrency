/**
 * Created by Administrator on 2014/11/18.
 */
public class Rubles extends Currency {

    Rubles(String name, String value) {
        super(name, value);
    }

    @Override
    double getRate() {
        return rateInit*6.0*6.0;
    }


}
