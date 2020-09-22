package interfacesegregation.wrong;


/*Bir Bağlantıdan gelen verileri almak veya bir veri göndermek istediğimde bu Interface'in kullanılmasını istiyorum
 * fakat bu Interface üzerinde hem mesaj alıp gönderme ve bağlantı açıp kapatma gibi metodlar da bulunmakta
 * Interface segregation prensibine uymayan iki metodu da tek interaface üzerin de kullanmış oldum.
 * open() ve close() metodlarımı bir Interface üzerinde, consume() ve publish() metodlarımı
 * farklı bir Interface oalcak şekilde ayırmam gerekir.
 */
public interface Connection {

    void open();

    void close();

    byte[] consume();

    void publish(byte[] messages);

}
