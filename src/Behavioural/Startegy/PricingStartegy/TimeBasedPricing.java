package Behavioural.Startegy.PricingStartegy;

public class TimeBasedPricing implements  PricingStrategy{
    static final double PER_MINUTE_RATE = 0.5; // Rate per minute
    private static final double BASE_FARE = 5.0; // Base fare amount

    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
