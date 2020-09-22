package openclosed.correct;

import openclosed.correct.Imp.VehicleTaxCalculator;

public class Car extends Vehicle implements VehicleTaxCalculator {

    public Car(Integer price) {
        super(price);
    }

    @Override
    public double calculateTax() {
        return this.getPrice() * 0.40;
    }
}
