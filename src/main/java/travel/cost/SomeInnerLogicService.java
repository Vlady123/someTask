package travel.cost;

import java.util.Random;

/**
 * Created by toofast on 10.03.2016
 */
public class SomeInnerLogicService {

    public double getMultiplier() {
        return new Random().nextDouble() + 1;
    }

}
