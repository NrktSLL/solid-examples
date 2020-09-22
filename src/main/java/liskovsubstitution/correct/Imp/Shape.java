package liskovsubstitution.correct.Imp;

/*
 * Dikdörtgen Kare ile farklı davranışlar gösterebiliyor o halde onu ayrı bir şekil olarak
 * Rectangle adlı bir sınıf yaratıp Shape’den implement edebiliriz.
 * Böylelikle Artık Kare ve Dikdörtgen kendi davranışlarına sahip olur.
 */
public interface Shape {
    long area();
}
