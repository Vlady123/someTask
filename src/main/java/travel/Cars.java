package travel;

import travel.cost.CostEvaluationStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static travel.Brand.*;
import static travel.Brand.FORD;

/**
 * Created by toofast on 09.03.2016
 */
public class Cars {

    private static Map<Brand, CostEvaluationStrategy> strategies = new HashMap<Brand, CostEvaluationStrategy>(){{

        put(FORD, new CostEvaluationStrategy(5d, 100d, 5d) );
        put(OPEL, new CostEvaluationStrategy(10d, 200d, 3d) );
    }};

    public static Car newCar(Brand brand){
        Car c = new Car();
        c.setBrand(brand);
        CostEvaluationStrategy strategy = strategies.get(brand);
        if(Objects.isNull(strategy)){
            throw new RuntimeException("No cost calculation strategy defined for the brand: " + brand);
        }
        c.setCostStrategy(strategy);
        return c;
    }


    public static Car newCustomCar(Brand brand, double amortizationCost, double repairCost, double amortizationMultiplier){
        Car c = new Car();
        c.setBrand(brand);
        CostEvaluationStrategy strategy = new CostEvaluationStrategy(amortizationCost, repairCost, amortizationMultiplier);
        c.setCostStrategy(strategy);
        return c;
    }





}
