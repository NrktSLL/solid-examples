package openclosed.wrong;

//Open-Closed Principle
public class VehicleValueCalculator {

    /*
     * calculateVehicle metoduna bakıldığında Car veya MotorBike a göre farklı değerlendirme yapmakta
     * Bu kısma Vechile metodundan kalıtılan yeni bir class gelirse
     * örn Bike sınıfı içinde değerlendirme yapılmak istenirse
     * 3. bir if sorgusu yazmamız gerekerecek ve bu sürekli bu şekilde devam edecek
     * Open-Closed Principle;Bir sınıf ya da fonksiyon halihazırda var olan özellikleri
     * korumalı ve değişikliğe izin vermemelidir ama  yeni özellikler kazanabiliyor olmalıdır.
     */

    public double calculateTax(Vehicle vehicle) {
        double value = 0;
        if (vehicle instanceof Car) {
            value = vehicle.getPrice() * 0.20;
        } else if (vehicle instanceof MotorBike) {
            value = vehicle.getPrice() * 0.40;
        }
        return value;
    }

}
