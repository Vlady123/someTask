package travel.cost;

/**
 * Created by toofast on 10.03.2016
 */
public class CostEvaluationStrategy {
    //Use DI in the real application
    private static SomeInnerLogicService innerLogicService = new SomeInnerLogicService();

    private double amortizationCost;
    private double repairCost;
    private double amortizationMultiplier;

    public CostEvaluationStrategy(double amortizationCost, double repairCost, double amortizationMultiplier) {
        this.amortizationCost = amortizationCost;
        this.repairCost = repairCost;
        this.amortizationMultiplier = amortizationMultiplier;
    }

    public double evaluateTravelCost(){

        return (amortizationCost * amortizationMultiplier + repairCost) * innerLogicService.getMultiplier();
    }
}
