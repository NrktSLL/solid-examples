package liskovsubstitution.wrong;

/*
 * Matematiksel olarak Kare, bütün kenarları ve açıları birbirine eşit olan düzgün dörtgendir.
 * Kare için setWidth setHeight metodlarını override edebiliriz.
 * Matematiksel olarak karenin dikdörtgenden türediğini varsayabiliriz.Fakat her dörtgenin farklı özellikleri vardır.
 * Ama davranışsal olarak Kare Dikdörtgenin yerine geçmez, bu hiyerarşi Liskov prensibini (LSP) ihlal eder.
 */
public class Square extends Rectangle {

    @Override
    public void setWidth(int value) {
        super.setWidth(value);
        super.setHeight(value);
    }

    @Override
    public void setHeight(int value) {
        super.setHeight(value);
        super.setWidth(value);
    }

}
