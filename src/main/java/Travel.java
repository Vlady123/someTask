import java.util.Random;

/**
 * Created by Vladimir.
 */
public class Travel {

    public Leasable car;

    public Travel() {
        car = new Ford();
    }

    public void setCar(Leasable leasableCar){
        car = leasableCar;
    }

    public void doTravel() {
        if (car != null) {
            System.out.println((car.amortization() * 5 + car.repair()) * someInnerLogic());
        }
    }

    private float someInnerLogic() {
        return new Random().nextFloat() + 1;
    }

}

