# Fibabanka Java Bootcamp - 2. Hafta

## Generics
Java dilinde pek çok özellik çoğunlukla 1.0 versiyonunda eklenmiştir. Eklenen diğer tüm özellikler dilin kapsamını genişletmiştir 
ki bunlardan biri olan Jenerikler dili en çok şekillendirenlerdendir.

Jenerikler temelde parameetrik tip demektir. Yani parametrik bir sınıf, interface yada metod yaratırken aslında o kod parçasının
hangi tip data üzerinde işlem yapacağını bildiriyoruz. Bu ne demek ? Biraz daha açalım konuyu.

Diyelim ki bir sıralama algoritması yazdınız ve bu algoritmanın int, String, Thread, Object gibi farklı tipler üzerinde çalışmasını 
istiyorsunuz. Jenerikler javaya eklenmeden önce bunu yapmanın iki yolu vardı, ya algoritmayı kullandığımız her obje tipi
için yeniden yazmak, ki çok miktarda kod tekrarı demektir yada algoritmayı Object sınıfını baz alarak yazmaktı. Yani yaratacağınız sınıf, metodlar hepsi Object 
tipinde input alacak ve Object tipinde değer dönecek. Ancak bu şekilde genel bir algoritma implementasyonu mümkün oluyordu.
Tabi çağırdığımız her metoddan sonra bize geri dönen Object tipindeki değeri de istediğimiz tipe cast etmemiz gerekiyordu.
Bu beraberinde hem performans kaybı hemde runtime da hatalar almamıza neden oluyordu.

İşte bu sorunlara çözüm olarak Java dilini tasarlayanlar Jenerikleri dile kazandırdı. Jenerikler sayesinde algoritmalarda 
veri tipinden bağımsız genelleme, kodun tekrar kullanılabilirliği ve güvenlik arttı.

Şimdi basit bir jeneric implementasyonu görelim :

```java
public class GenericType<T> {

    private T obj;

    public GenericType(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of the class is " + this.obj.getClass().getName());
    }
}

public class Main {
    public static void main(String[] args) {

        GenericType<Integer> integerGenericType = new GenericType<>(7);
        integerGenericType.showType();
        Integer value1 = integerGenericType.getObj();
        System.out.println("Value of generic obj " + value1));

        GenericType<String> stringGenericType = new GenericType<>("--Generics--");
        stringGenericType.showType();
        String value2 = stringGenericType.getObj();
        System.out.println("Value of generic type " + value2);
    }
}
```    
Output :
```
Type of the class is java.lang.Integer
Value of generic obj 7
Type of the class is java.lang.String
Value of generic type --Generics--
```

Bu örnekte dikkat etmemiz gereken bir kaç nokta var. Birincisi jenerik sınıfımıza parametre tipini nasıl geçtiğimiz. Sınıf
isminden hemen sonra gelen <> sembolleri arasına tip ismini veriyoruz. Burada tek harflik bir isim seçmek ve T, V, E gibi
çok kullanılan tip isimlerini seçmek iyi olacaktır. Daha sonra bu tip ismini sınıf içindefarklı yerlerde kullanacağız.

Aynı T tipinde bir değişken tuttuğumuza ve sınıfın constructor unda bu değişkeni initialize ettiğimize dikkat edelim.

Daha sonra bu değişkene erişebilmek için bir getter metodu ekledik, bu metod daha sonra yarattığımız jenerik değerine 
ulaşmak için kullanılacak.

Jenerik sınıfın sonunda da bu parametre tipinin gerçek ismini ekrana basan bir metod ekledik.

Bu jenerik sınıftan obje yaratmak için Integer ve String tip parametrelerini ve bu tiplerden değerler kullandık. Bu jenerik 
sınaftan türettiğimiz objelerin değerlerine ulaşmak için getObj metodunu çağırdık ve type casting yapmadık.
 
Jenerik sınıflar birden fazla tip parametresi ile çalışabilir :

```java
public class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    void displayInfo() {
        System.out.println("Type of K " + key.getClass().getName());
        System.out.println("Type of V " + value.getClass().getName());
    }
}

public class Main {
    public static void main(String[] args) {

        KeyValuePair<String, String> strKeyValuePair = new KeyValuePair<>("name", "Java");
        strKeyValuePair.displayInfo();

        KeyValuePair<String, Integer> mixKeyValuePair = new KeyValuePair<>("age", 25);
        mixKeyValuePair.displayInfo();
    }
}
```
Output :
```
Type of K java.lang.String
Type of V java.lang.String
Type of K java.lang.String
Type of V java.lang.Integer
```

### Bounded generics
Daha önceki örneklerde herhangi bir referans tipin bir jenerik sınıf için tip parametresi olabildiğini gördük. Bazı durumlarda
bu bir avantaj olurken bazen de sadece belli tiplerde tip parametresi kabul etmek isteriz. Örneğin matematiksel işlemler yapan 
bir jenerik sınıf yaratacaksak sadece nümerik değerlerin parametre olmasını isteriz.

```java
public class NumericOperation<T extends Number> {
    private T obj;

    public NumericOperation(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    boolean isDividableByTen() {
        return obj.doubleValue() - obj.intValue() == 0 && obj.intValue() % 10 == 0;
    }
}

public class Main {
    public static void main(String[] args) {

        NumericOperation<Integer> intValue = new NumericOperation<>(23);
        System.out.println("Is " + intValue.getObj() + " dividable by ten : " + intValue.isDividableByTen());

        NumericOperation<Double> doubleValue = new NumericOperation<>(23.12);
        System.out.println("Is " + doubleValue.getObj() + " dividable by ten : " + doubleValue.isDividableByTen());

        NumericOperation<Double> doubleValue2 = new NumericOperation<>(30.0);
        System.out.println("Is " + doubleValue2.getObj() + " dividable by ten : " + doubleValue2.isDividableByTen());

        NumericOperation<String> stringNumericOperation = new NumericOperation<String>("invalid parameter type"); // HATA
    }
}
```
Output :
```
Is 23 dividable by ten : false
Is 23.12 dividable by ten : false
Is 30.0 dividable by ten : true
```