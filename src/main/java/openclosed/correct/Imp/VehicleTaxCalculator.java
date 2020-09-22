package openclosed.correct.Imp;

/*Bu kısımda temelde istediğimiz şey araçların fiyatlarının tipine göre hesaplanması bu interface'imi baz alarak
    Diğer Classlarımın bu işlevi yerine getirmesini sağlayabiliriz. Böylelikle yeni bir araç geldiğinde var olan metodu
    değiştirmemiş olurum.
 */
public interface VehicleTaxCalculator {
    double calculateTax();
}
