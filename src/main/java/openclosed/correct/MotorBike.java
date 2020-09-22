package openclosed.correct;

import openclosed.correct.Imp.VehicleTaxCalculator;

public class MotorBike extends Vehicle implements VehicleTaxCalculator {

    public MotorBike(Integer price) {
        super(price);
    }

    @Override
    public double calculateTax() {
        return this.getPrice() * 0.20;
    }
}
