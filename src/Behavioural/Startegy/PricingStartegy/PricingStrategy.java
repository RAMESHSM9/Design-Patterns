package Behavioural.Startegy.PricingStartegy;

//@ interface to be implemented by the different implementations
//@ Distance based price
//@ Time based Price
//@ Surge Pricing
public interface PricingStrategy {
    PricingType supportsType();
    public Double calculatePrice(RideDetails rideDetails);
}
