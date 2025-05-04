package Behavioural.Startegy.PricingStartegy;

public class PricingStartegyFactory {

    public static PricingStrategy getPricingStrategy(PricingType pricingType)
    {
        switch (pricingType)
        {
            case DISTANCE_BASED -> {return  new DistanceBasedPricing();}
            case SURGE -> {return new SurgeBasedPricing();}
            case TIME_BASED -> {return new TimeBasedPricing();}
        }
        throw new IllegalArgumentException("Invalid price type");
    }
}
