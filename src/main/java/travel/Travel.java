package travel;

import java.util.Objects;
import java.util.Random;

/**
 * Created by Vladimir.
 */
public class Travel {

    public Leasable vehicle;

    public Travel(Leasable vehicle) {
        this.vehicle = vehicle;
    }

    public void doTravel() {
            double travelCost = vehicle.getTravelCost();

            System.out.println(String.format("The travel cost is: %s", travelCost));
    }
}

