package singlersponsibility.wrong;

//Single-Responsibility
public class Person {

    //Person class i temelde bize user ile ilgili olan fieldları alıp(get) vermek(set) ile sorumludur.

    private Integer Id;
    private String Name;
    private String Surname;
    /*Person içerisinde Country ve City bilgilerinin bulunması doğru değildir. Bu kısım Address ile ilgilidir.
      Person bize kişi ile ilgili özellikleri getirmeli o kişinin bulnduğu city veya Country bu özelliklerde bulunmamalı
      Ayrıca buraya ZipCode gibi fieldlar eklendiğinde Bu field doğrudan Person classini da etkileyecek ve Mantıksal olarak
      person ile ilgili detaylarda bilgi karmaşasına sebep olacaktır.

      -Burda yapılması gereken Country ve City bilgilerini ayrı bir class içersine almak olacaktır.
     */
    private String Country;
    private String City;

    //constructor, getters and setters


    /*
    add ve remove gibi işlemler ne kadar person bilgisine ihtiyaç duysada Person sınıfının sorumluluğunda değildir.
    Person class i sadece bize karşı get ve setten sorumludur. Burda bu işlemlerin yer alması Person class'ının amacı
    dışına çımasına, yanlış kullanılmasına, kod bütünlüğü ve yönetiminde problem çıkmasına sebep olacaktır.

    -Burda yapılması gereken bu fonksiyon işlemlerini ayrı bir class da yer alması olacaktır.
     */
    public void add(Person person) {
        //Db işlemleri
    }

    public void remove(int personId) {
        //Db işlemleri
    }

}
