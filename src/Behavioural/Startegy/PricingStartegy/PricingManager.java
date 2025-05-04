package Behavioural.Startegy.PricingStartegy;

public class PricingManager {

    private PricingStrategy pricingStrategy;
    private PricingType pricingType;
    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingType = pricingType;
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.calculatePrice(rideDetails);
    }

}
