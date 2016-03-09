package travel;

import travel.cost.CostEvaluationStrategy;

/**
 * Created by toofast on 09.03.2016
 */
public class Car implements Leasable{
    private Brand brand;

    private CostEvaluationStrategy costStrategy;

    public CostEvaluationStrategy getCostStrategy() {
        return costStrategy;
    }

    public void setCostStrategy(CostEvaluationStrategy costStrategy) {
        this.costStrategy = costStrategy;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }


    @Override
    public double getTravelCost() {
        return costStrategy.evaluateTravelCost();
    }
}
