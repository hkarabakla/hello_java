# Fibabank Java Bootcamp

## Java nedir ve neden önemlidir ?
- Java ilk olarak 1995 yılında release edildi
- Sınıf tabanlı, nesne yönelimli bir programlama dili olarak tasarlandı
- Ilk gunden itibaren write-once-run-everywhere slogani ile yoluna devam etti
- Yazilimcilar tarafından okadar sevildi ki Github’in yayinladigi raporda 2019 yılında en çok tercih edilen 3. programlama dili oldu
- 2019 yilinda 9 milyondan fazla yazilimci Java programlama dilini tercih etti

## Java ile geliştirme yapmak icin nelere ihtiyacım var ?
- Algoritmik dusunme yetenegine
- JDK (Java Development Kit)
- JRE (Java Runtime Environement)
- IDE (Integrated Development Environment)*

## Java ile ilk program
``` java
package com.hkarabakla;
 
 public class Main {
 
     public static void main(String[] args) {
 	    System.out.println("Hello Java World !");
     }
 }
```
- package : Iliskili siniflari guruplamamıza yarayan dizinler olarak dusunebiliriz. 
- class   : Nesne yonelimli bir programlama dili olan Java’da hersey bir class ile iliskilendirilmek zorundadır. Class gercek dünyayı yazılımda modellememize yardimci olur
- method  : Fonksiyon olarak da bilinen methodlar yazilimi oluşturan en kucuk birimlerdir. Yazılıma davranış kazandirirlar.

## Veri tipleri
Java **strongly typed** bir dildir. Yani butun islemler compile zamaninda type checking (veri tipi kontrolu) isleminden 
gecirilir.

### Primitive (basit) veri tipleri
Primitive tipler belli bir boyuta sahiptir ve ekstra fonksiyon sunmazlar.

| Data type | Size | Description |
| ----------- | ----------- | ---------- |
|byte	| 1 byte	| Stores whole numbers from -128 to 127 |
|short	| 2 bytes	| Stores whole numbers from -32,768 to 32,767 |
|int	| 4 bytes	| Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
|long	| 8 bytes	| Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
|float	| 4 bytes	| Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
|double	| 8 bytes	| Stores fractional numbers. Sufficient for storing 15 decimal digits |
|boolean	| 1 bit	| Stores true or false values |
|char	| 2 bytes	| Stores a single character/letter or ASCII values |

### Non-Primitive veri tipleri
Referans tipler olarak da bilinen tum objeler.
``` java
String name = "Huseyin";
Car myNewCar = new Car("A4", "Audi");
```

#### Primitive tipler ve non-primitive tipler arasındaki farklar
- Primitive tipler java tarafından predefined olarak sunulmaktadır fakat non-primitive tipler yazilimci tarafından yaratılır. (String hariç)
- Non-primitive tipler tuttukları deger uzerinde islem yapmaya yarayan metodlar sunabilirler
- Primitive tipler her zaman bir degere sahip olmak zorundadır bu nedenle default degerleri vardır, non-primitive tipler ise null olabilir

## Değişkenler
Değişkenler verileri (data) depolamaya yarar.
``` java
// type variable = value*;

int age = 10;
String organisation = "Kodluyoruz";
boolean isCool = true;

int x = 2, y = 3, z = 5;

int a, b, c;
a = 1;
b = 9;
c = 11;

// Good
int minutesPerHour = 60;
// OK, but hard to understand its purpose
int m = 60;
```
### Değişken isimleri belirlemede genel kurallar:
- Değişken isimleri anlamlı ve değişkenin gorevini açıklar nitelikte olmalıdır
- Değişken isimleri harf, rakam, alt çizgi(_) ve dolar işareti($) bulundurabilir
- Sadece harf ile baslayabilir
- Kucuk harfle baslamalıdır ve boşluk içeremez
- $ ve _ ile de baslayabilir fakat yaygın olarak tercih edilmez
- Değişken isimleri büyük kucuk harfe duyarlıdır
- Int, boolean… gibi Java icin rezerve edilmiş kelimeler değişken ismi olamaz

#### Tanimlama sirasinda deger atama
```java
int age = 10;
String organisation = "Kodluyoruz";
boolean isCool = true;
```
#### Dinamik deger atama
```java
int x = 2, y = 3, z = 5, w;
w = x * y * z;
```
#### Degiskenlerde scope kavrami
```java
package com.hkarabakla;

public class ScopeDemo {

    public static void main(String[] args) {
        int x = 10; // known to all code within main

        if (x == 10) { // start new scope
            int y = 20; // known only to this block

            // double x = 25; error, variable x already defined  

            // x and y both known in here
            System.out.println("x and y : " + x + " " + y);
            x = y * 2;
        }

        // y = 100; error y not known here
        
        // x still known here
        System.out.println("x is " + x);
    }
}
```
#### Tip donusturme (Type casting)
Bir tipte tanimlanmis degerin baska bir tipte tanimlanmis degiskene atanmasidir. Iki sekilde olur :

**Otomatik tip donusumu**

Kucuk boyutlu bir degerin daha butuk boyutlu bir bir tipte degiskene atanmasi
_byte -> short -> char -> int -> long -> float -> double_

```java
public class MyClass {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
```

**Manuel tip donusumu**

Kucuk boyutlu bir degerin daha buyuk boyutlu bir tipte degiskene atanmasi (deger kaybi)
_double -> float -> long -> int -> char -> short -> byte_ 

```java
public class MyClass {
  public static void main(String[] args) {
    double myDouble = 9.78;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```

## Operatorler
Operatorler degiskenler ve degerler uzerinde islem yapmaya yarar.

#### Aritmetik operatorler
|Operator	|Name	|Description	|Example|
| ----------- | ----------- | ---------- | ---------- |
|+	|Addition	|Adds together two values	|x + y	|
|-	|Subtraction	|Subtracts one value from another	|x - y|	
|*	|Multiplication	|Multiplies two values	|x * y	|
|/	|Division	|Divides one value by another	|x / y	|
|%	|Modulus	|Returns the division remainder	|x % y	|
|++	|Increment	|Increases the value of a variable by 1	|++x|	
|--	|Decrement	|Decreases the value of a variable by 1	|--x|

#### Atama operatorleri
|Operator	|Example	|Same As|
| ----------- | ----------- | ---------- |
|=	|x = 5|	x = 5|	
|+=	|x += 3|	x = x + 3|	
|-=	|x -= 3|	x = x - 3|	
|*=	|x *= 3|	x = x * 3|	
|/=	|x /= 3|	x = x / 3|	
|%=	|x %= 3|	x = x % 3|	
|&=	|x &= 3|	x = x & 3|	
||=	|x |= 3|	x = x | 3|	
|^=	|x ^= 3|	x = x ^ 3|	
|>>=	|x >>= 3|	x = x >> 3|	
|<<=	|x <<= 3|	x = x << 3|

#### Karsilastirma operatorleri
|Operator	|Name	|Example|
| ----------- | ----------- | ---------- |
|==|	Equal to|	x == y|	
|!=|	Not equal|	x != y|	
|\>	|Greater than|	x > y|	
|<|	Less than|	x < y|	
|>=|	Greater than or equal to|	x >= y|	
|<=|	Less than or equal to|	x <= y|

#### Mantiksal operatorler //TODO fix me
|Operator	|Name	|Description	|Example|
| ----------- | ----------- | ---------- | ---------- |
|&& 	|Logical and	|Returns true if both statements are true	|x < 5 &&  x < 10|	
| || 	|Logical or	|Returns true if one of the statements is true	|x < 5 \|\| x < 4|	
|!	|Logical not	|Reverse the result, returns false if the result is true	|!(x < 5 && x < 10)|

## Java'da karar mekanizmalari

### Konsoldan Scanner yardımıyla input alma
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome " + getUserName());
    }

    private static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.next();
        System.out.println();
        System.out.print("Enter your surname : ");
        String surname = scanner.next();

        return name + " " + surname;
    }
}
```

### if-else ifadesi
if ifadesi belirli bir kosul altinda program akisimizin ne sekilde devam edecegini belirlemeye yarar.

```java
    public boolean isEligibleToHaveADrivingLicence(int age) {
        if(age < 18) {
            System.out.println("It's too early to drive !!!");
            return false;
        }

        return true;
    }
```

else ifadesi ise if kosulu gerceklesmemesi durumda program akisimizin ne sekilde devam edecegini belirlemeye yarar.

```java
    public boolean isEqual(int value1, int value2) {
        if(value1 == value2) {
            return true;
        } else {
            return false;
        }
    }
```

if-else-if ifadesi ise if kosulu gerceklesmedigi taktirde ikinci bir kosulu test etmemizi ve bu kosul gerceklesmesi 
durumunda program akisimizi kontrol etmeye yarar.

```java
    public int isEqual(int value1, int value2) {
        if(value1 < value2) {
            return -1;
        } else if (value1 > value2) {
            return 1;
        } else {
            return 0;
        }       
    }
``` 

Istedigimiz kadar if-else-if ifadesi kullanabiliriz, fakat if-else-if ifadesi nekadar cok kullanilirsa kodun okunabilirligi 
okadar azalir. Bu nedenle Java'da daha okunabilir, daha sade ve daha cok esneklik sunan switch ifadesi **bazi durumlarda** 
if-else-if ifadesi yerine tercih edilebilir.

### switch ifadesi
Bir degere bagli olarak birden fazla kosul ve kod akis olasiligi oldugu durumlarda switch ifadesi kullanilabilir.
Bu deger **byte, short, int, char yada String** tipinde olabilir.

```java
    public String getDayNameOfWeek(int dayOfTheWeek) {
        
        String nameOfTheDay;
        
        switch (dayOfTheWeek) {
            case 1:
                nameOfTheDay = "Monday";
                break;
            case 2:
                nameOfTheDay = "Tuesday";
                break;
            case 3:
                nameOfTheDay = "Wednesday";
                break;
            case 4:
                nameOfTheDay = "Thursday";
                break;
            case 5:
                nameOfTheDay = "Friday";
                break;
            case 6:
                nameOfTheDay = "Saturday";
                break;
            case 7:
                nameOfTheDay = "Sunday";
                break;
            default:
                nameOfTheDay = "Unknown";
        }
        
        return nameOfTheDay;
    }
``` 
switch ifadesi bize birden fazla kosuldan herhangi birinin gerceklesmesi durumunda ayni kod akisinin isletilmesine olanak saglar
```java
    public String classifyFood(String nameOfTheFood) {
        String foodType;

        switch (nameOfTheFood) {
            case "apple":
                System.out.println("This is an apple");
            case "banana":
                System.out.println("This can be an apple or banana");
                foodType = "fruit";
                break;
            case "aubergine":
                System.out.println("This is aubergine");
            case "broccoli":
                System.out.println("This can be an aubergine or broccoli");
                foodType = "vegetable";
                break;
            default:
                System.out.println("Don't eat that food");
                foodType = "Unknown";
        }

        return foodType;
    }
``` 
Yukardaki metodun farkli parametreler ile calistirilmasi durumunda asagikadi ciktilari uretecektir:
```java
1. System.out.println(classifyFood("banana"));
This can be an apple or banana
fruit

2. System.out.println(classifyFood("banana"));
This is an apple
This can be an apple or banana
fruit

``` 

```
:raised_hands: Ne zaman if-else-if nezaman switch kullanmaliyiz ?
```



## Donguler
Java'da donguler tekrarli isleri gerceklestirmek icin kullanilir.

### for dongusu
```java
    for(initialization; condition; iteration) {
        statement sequence;
    }
```
Initialization ifadesi dongu kontrol degiskeninin ilk degerini aldigi kisimdir.
Condition ifadesi ise dongunun hangi sartlar altinda devam edecegini belirledigimiz kisimdir.
Iteration ifadesi dongu kontrol ifadesinin her bir dongu adiminda nasil degisecegini belirledigimiz kisimdir.

```java
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
```

Output :
```
    0
    1
    2
    3
    4
```

```java
    for(int i = 0, j = 10; i < j; i++, j--) {
        System.out.println("i and j :" + i + " " + j);
    }
```

Output :
```
    i and j :0 10
    i and j :1 9
    i and j :2 8
    i and j :3 7
    i and j :4 6
```

```java
    int i = 0;
    for(; i < 5;) {
        System.out.println("i :" + i++);
    }
```

Output :
```
    i :0
    i :1
    i :2
    i :3
    i :4
```
for dongusunun farkli bir versiyonu olan foreach dongusune daha sonra array konusunu isledigimiz zaman deginecegiz

### while dongusu
```java
    while(condition) {
        statement sequence;
    }
```

Condition ifadesi ise dongunun hangi sartlar altinda devam edecegini belirledigimiz kisimdir.

```java
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }
```

while dongusu iterasyone condition ifadesinin sonucunu test ederek baslar, condition ifadesi true doner ise dongu icindeki
kod calistirilir.

```java
    int i = 5;
      do {
         System.out.println("Iteration: "+ ++i);
      } while(i < 5);

    >Output>
    Iteration: 6
```
do-while dongusunde ise once do ifadesinin icinde bulunan kod calistirilir daha sonra while ifadesinin icinde yeralan 
condition ifadesinin dondurdugu degere bakilir. do-while dongusunde dongunun en az bir kere calismasi garantidir.

#### break ve continue ifadeleri
break ifadesi dongulerde, donguyu manuel olarak bitirmeye yarar

```java
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }
```

```java
    while (true) {
        char ch = (char) System.in.read();
        if (ch == 'q') {
            break;
        }
    
        System.out.println(ch);
    }
```

continue ifadesi dongulerde, continue'dan sonra gelen dongu icindeki kodun calistirilmadan bir sonraki dongu adimina gecilmesini saglar

```java
    for (int i = 0; i < 100; i++) {
        if (i % 10 != 0) {
            continue;
        }
        System.out.println("I : " + i);
    }
```

Output :
```
    I : 0
    I : 10
    I : 20
    I : 30
    I : 40
    I : 50
    I : 60
    I : 70
    I : 80
    I : 90
```
## Array İşlemleri
Array aynı tipten verileri depolamaya yarayan koleksiyonlara denir. Genellikle birbiri ile alakalı verileri tutmak için kullanılır. 
Java'da arrayler obje tipindedir. Arraylerin bize sunduğu en büyük avantajlardan biri de sakladıkları veriler üzerinde kolay işlem yapabilme 
olanağıdır. Örneğin bir arrayde elimizde bulunan programlama kitaplarının isimlerini saklayıp onları kolayca listeleyebiliriz.
Yada bir gurup insana ait gelir bilgilerini bir arrayde saklayıp kolayca ortalama geliri hesaplayabiliriz, yada bu verileri kolayca sıralayabiliriz.

### Bir boyutlu arrayler
Bir boyutlu arrayler aynı türden birbiri ile alakalı verileri tutmak için kullanılan diziler olarak düşünebiliriz.

```java
    type array_name[] = new type[array_capacity];
```

type : array içinde saklamak istediğimiz veri tipi
array_name : arrayimizin adı
new : yeni obje yaratma anahtar kelimesi (daha sonra detaylı göreceğiz)
array_capacity : arrayimizin saklayabileceği maksimum veri sayısı

```java
    int sample[] = new int[10];

    int sample2[];
    sample2 = new int[10];
```

Arrayler sakladıkları verileri indeksleri ile birlikte saklarlar. Bu nedenle bir arraye veri koyarken ve veriyi arrayden
alırken indeksleri kullanmamız gerekir.

```java
public class Main {

    public static void main(String[] args) {

        int[] sample = new int[10];

        for (int i = 0; i < 10; i++) {
            sample[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Sample [" + i + "] is " + sample[i]);
        }
    }
}
```

Output :
```  
    Sample [0] is 0
    Sample [1] is 1
    Sample [2] is 2
    Sample [3] is 3
    Sample [4] is 4
    Sample [5] is 5
    Sample [6] is 6
    Sample [7] is 7
    Sample [8] is 8
    Sample [9] is 9
```

Arraylerde indeks değeri herzaman sıfırdan başlar. Yani 10 elemanlı bir array oluşturursak arrayimizin ilk elamnına 
sıfırncı indeks ile ulaşırız ve en büyük indeksimiz de 9 olur.

![array yapısı](images/array%20structure.png)

```java
public class Main {

    public static void main(String[] args) {

        int[] numbers = {10, 23, -98, 76, 9, -123, -28, 0, 35};

        int max, min;
        min = max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println("Min : " + min + " , Max : " + max);
    }
}
```
Output :
```
    Min : -123 , Max : 76
```

```
Peki kapasitesi 10 olan bir arrayimiz var diyelim, -1. veya 10. indexe erişmeye çalışırsak ne olur ?
```

Şuana kadar öğrendiğimiz bilgilerle arraylerde sıralama yapabiliriz. Bunun için küçük arraylerde iyi performans gösteren
ama büyük arrayler için önerilmeyen bubble sort algoritmasını kullanacağız.

![bubble sort animasyon](images/Bubble-sort.gif)

```java
public class Main {

    public static void main(String[] args) {

        int[] numbers = {10, 23, -98, 76, 9, -123, -28, 0, 35};
        sort(numbers);
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length -1) System.out.print(" , ");
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int bigger = array[i];
                    array[i] = array[j];
                    array[j] = bigger;
                }
            }
        }
    }
}
```

### Çok boyutlu arrayler
Çok boyutlu arraylerin en basit hali 2 boyutlu arraylerdir. 2 boyutlu array aslında tek boyutlu arraylerin arrayi gibi
düşünülebir, yani matris gibi.

```java
public class Main {

    public static void main(String[] args) {

        int matris[][] = new int[3][4];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = i + j;
            }
        }

        for (int i = 0; i < 3; i++) {
            printArray(matris[i]);
            System.out.println();
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length -1) System.out.print(" , ");
        }
    }
}
```
Output :
```
    0 , 1 , 2 , 3
    1 , 2 , 3 , 4
    2 , 3 , 4 , 5
```

Tanımlama sırasında değer atama işlemi de aynı tek boyutlu arraylerdeki gibidir.

```java
int matris[][] = {
                {0, 1, 2, 3, 4},
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6 }
        };
```

Çok boyutlu arraylerin genel formülü şu şekildedir.

```java
    type array_name[][][]...[] = new tyepe[size1][size2][size3]...[sizeN];
```

### foreach tarzı for döngüsü
Arrayler üzerinde döngü kurmayı kolaylaştıran for döngüsünün özel bir formudur.
Array üzerindeki herbir eleman ile işlem yapmak istediğimizde kodu sadeleştirir ve işimizi kolaylaştırır.

```java
public class Main {

    public static void main(String[] args) {
    
        int matris[][] = {
                {0, 1, 2, 3, 4},
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6 }
        };

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.println(matris[i][j]);
            }
        }

        for (int[] values : matris) {
            for (int value: values) {
                System.out.println(value);
            }
        }
    }
}
```

Arrayler diğer veri tipleri gibi metodlara parametre olarak gönderilebilir yada bir metoddan çıktı olarak return edilebilir.

## String sınıfı ve başlıca string işlemleri
String Java gelirtiricilerin günlük hayatta en çok kullandığı veri tiplerinden birisidir. Pek çok programlama dilinde stringler 
karakter arrayi olarak tutulurken javada string bir objedir. 

Peki stringleri nasıl yaratırız ?

``` java
    String messageFromJava = "Java strings are powerfull";

    String anotherMessage = new Strıng("Hello Java");

    String lastMessage = new String(anotherMessage);
```

### string literal vs string obje
Aşağıdaki resimde de görüldüğü gibi literal string ifadeleri hafıza da string pool denilen özel bir bölmede tutulur.
Ve siz uygulamanızda bir string literali yaratırsanız string poolda bir değer yaratılır ve sizin değişkeniniz bu değere
refrans eder. Eğer aynı değerle başka bir string literal daha yaratırsanız bu sefer string poolda yeni bir değer yaratılmaz
sadece yeni değişkenin daha önce yaratılan değere referans etmesi sağlanır. 

String objeleri ise hafızada Heap adı verilen özel bölmede saklanır, diğer bğtğn objeler gibi. 

![string pool](images/string_pool.png)

### string karşılaştırma
String veri tipi üzerinde en çok yapılan işlemlerden biri karşılaştırma işlemidir. String karşılaştırma söz konusu olduğu 
zaman aklımıza iki şey gelmeli; string değişkenlerin değerlerinin eşitliği ya da referansların eşitliği (hafızada aynı objeye referans etme)

```java
    public static void main(String[] args) {

        String user1 = "userName";
        String user2 = "userName";
        String user3 = user2;
        String user4 = new String("userName");

        System.out.println("user1 == user2 : " + (user1 == user2));
        System.out.println("user2 == user3 : " + (user2 == user3));
        System.out.println("user3 == user4 : " + (user3 == user4));

        System.out.println("user1.equals(user2) : " + user1.equals(user2));
        System.out.println("user2.equals(user3) : " + user2.equals(user3));
        System.out.println("user3.equals(user4) : " + user3.equals(user4));
    }
```
Output :
```
    user1 == user2 : true
    user2 == user3 : true
    user3 == user4 : false
    user1.equals(user2) : true
    user2.equals(user3) : true
    user3.equals(user4) : true
```

### string işlemleri
String sınıfı oldukça büyük bir sınıf, iyi bir Java developer olmak için bu sınıfı iyi anlamak ve string objeleri üzerinde 
hangi işlemleri yapabileceğinizi biliyor olmanız gerekir. Başlıca string işlemleri şunlardır:

#### length() metodu
String değerinin kaç tane karakter taşıdığını gösterir. Java dilinde boşluk da bir karakterdir ve uzunluk hesabına katılır.
```java
public static void main(String[] args) {

    String userEmail = "user@email.com";
    if (userEmail.length() == 0) {
        System.out.println("Email is empty !");
    } else {
        System.out.println("Email is not empty !");
    }
}

```

#### isEmpty() metodu
Bu method string objesinin hiç karakter bulundurmaması durumunda true, herhangi bir karakter bulundurması durumunda ise false döner.
```java
public static void main(String[] args) {

    String userEmail = "user@email.com";
    if (userEmail.isEmpty()) {
        System.out.println("Email is empty !");
    } else {
        System.out.println("Email is not empty !");
    }
}
``` 

#### charAt() metodu
Bazen string içerisindeki belli bir posizyondaki karakteri kontrol etmemiz gerekebilir. İşte bu durumda yardımımıza charAt metodu koşuyor.

```java
private int getPositionOfChar(String value) {
        
    int positionOfAt = -1;
    for (int i = 0; i < value.length(); i++) {
        if (value.charAt(i) == '@') {
            positionOfAt = i;
            break;
        }
    }
    return positionOfAt;
}
```
> Önemli Not : charAt metodunda dikkat edilmesi gereken nokta metoda verdiğimiz int değeridir. Stringlerde karakter indeksleri aynı arraylerde 
olduğu gibi sıfırdan başlar, bu nedenle charAt metoduna verdiğimiz parametre değeri sıfırdan küçük yada stringin uzunluğuna
eşit veya daha büyük olmamalıdır, olursa **StringIndexOutOfBoundsException** alırız.

#### indexOf() metodu
Bazen de bir karakterin string içindeki indexini öğrenmek isteriz. indexOf metodu kendisine parametre olarak verdiğimiz 
karakteri stringin içinde arar ve ilk bulduğu eşleşmenin indeks değerini bize döner. Eğer hiç eşleşme bulamaz ise bu durumda
-1 değerini döner.

```java
String userEmail = "user@email.com";
int positionOfChar = userEmail.indexOf('@');

System.out.println("Position of @ : " + userEmail.indexOf('@'));
System.out.println("Position of 'email' : " + userEmail.indexOf("email"));
System.out.println("Position of 'email' : " + userEmail.indexOf("com", userEmail.indexOf('@')));
```
Output :
```
Position of @ : 4
Position of 'email' : 5
Position of 'email' : 11
```

#### replace() metodu
Bazen de bir string değer içindeki bir karakter yada bir karakter dizisini başka bir karakter yada karakter dizisi ile değiştirmek
isteriz. Bu durumda replace() metodu ve bu metodun diğer türevleri ihtiyacımızı karşılar. Bu meetod orijinal stringi değiştirmek
yerine yeni bir string değer döner.

```java
String userEmail = "user@email.com";
String userEmailWithNet = userEmail.replace("com", "net");
System.out.println(userEmail);
System.out.println(userEmailWithNet);
```
Output :
```
user@email.net
```

#### split() metodu
Elimizde özel bir karakter ile birleştirilmiş bir grup bilgi varsa ve bu bilgilere erişmemiz gerekirse bu durumda elimizdeki
string ifadeyi o özel karaktere göre parçalara ayırmamız gerekir. İşte tam da bu iş için string sınıfı içinde split metodu
yer alıyor.

```java
String userInformation = "user@email.com|name of the user|surname of the user|34";
String[] userDetails = userInformation.split("\\|");
for (String detail : userDetails) {
    System.out.println(detail);
}
```
Output :
```
user@email.com
name of the user
surname of the user
34
```

#### concat() metodu
Elimizde birden fazla string değeri varsa ve bunları birleştirerek yeni bir string değer yaratmamız gerekirse bu durumda
string sınıfı içinde yer alan concat() metodunu kullanabiliriz.

```java
String name = "Huseyin";
String middleName = "Cihangir";
String surname = "Karabakla";

String fullName = name.concat(" ").concat(middleName).concat(" ").concat(surname);
System.out.println("Full name of the user : " + fullName);
```
Output :
```
Full name of the user : Huseyin Cihangir Karabakla
```

Bazen üzerinde birleştirme işlemi yapmamız gereken string sayısı çok fazla olabilir bu durumda concat işlemini kullanmamız 
doğru olmaz. Çünkü yukardaki örnekte de görüldüğü gibi her string için concat metodunu çağırmamız gerekir. concat metoduna 
yaptığımız her çağrı yeni bir string objesi oluşturur hafıza da, bu da bir süre sonra uygulamamızın performansında düşüşlere 
yol açar. Bu tarz durumlar için Javada daha özel iki tane sınıf var, **StringBuilder**, **StringBuffer**:

```java
String first = "First sentence";
String second = "Second sentence";
String third = "Third sentence";
String fourth = "Fourth sentence";
String fifth = "Fifth sentence";
StringBuilder sb = new StringBuilder();
sb.append(first)
        .append(second)
        .append(third)
        .append(fourth)
        .append(fifth);

System.out.println(sb.toString());
```  
> Henüz thread-safety konusunu görmediğimiz için StringBuffer'dan daha sonra bahsedeceğiz.

## Sayılar
// TODO bu kisim eksik tamamlanacak

## Tarih işlemleri
Java dilinde built in olarak tarih ve zaman sınıfları yer almaz. Tarih ve zaman işlemleri yapabilmek için java.time paketinden
ihtiyacımız olan sınıfı import etmemiz gerekir. Bu pakette yer alan sınıflardan başlıcaları olan LocalDate, LocalTime, LocalDateTime,
DateTimeFormatter ve Duration sınıflarını ve bunların kullanımı yakından inceleyelim.

### LocalDate
Yıl, gün ve ay bilgisinden oluşan tarih işlemleri için LocalDate sınıfını kullanabiliriz. Default tarih formatı yyyy-mm-dd
Ayrıca LocalDate objeleri immutable ve thread-safe dir.

```java
LocalDate firstDayOfTheYear = LocalDate.of(2012, 1, 1);
System.out.println("firstDayOfTheYear " + firstDayOfTheYear);

LocalDate today = LocalDate.now();
System.out.println("today " + today);

LocalDate tomorrow = LocalDate.now().plusDays(1);
System.out.println("tomorrow " + tomorrow);

LocalDate nextMonth = LocalDate.now().withMonth(12);
System.out.println("nextMonth " + nextMonth);

LocalDate yesterday = LocalDate.parse("2020-11-22");
System.out.println("yesterday " + yesterday);

System.out.println("is today after tomorrow " + today.isAfter(tomorrow));
System.out.println("is today equals to yesterday " + today.isEqual(yesterday));
```
Output :
```
firstDayOfTheYear 2012-01-01
today 2020-11-23
tomorrow 2020-11-24
nextMonth 2020-12-23
yesterday 2020-11-22
is today after tomorrow false
is today equals to yesterday false
```

### LocalTime
Saat, dakika, saniye ve nanosaniye cinsinden veriler söz konusu olduğu zaman bakmamız gereken yer LocalTime.
LocalTime sınıfı da immutable ve thread safe dir. 

```java
LocalTime now = LocalTime.now();
System.out.println("Now : " + now);

LocalTime evening = LocalTime.of(20, 0, 0);
System.out.println("Evening : " + evening);

LocalTime afterThirtyMinutes = LocalTime.now().plusMinutes(30);
System.out.println("After 30 minutes from now : " + afterThirtyMinutes);

long hoursToNewDay = LocalTime.now().until(LocalTime.of(23, 59, 59, 59), ChronoUnit.MINUTES);
System.out.println("Remaining minutes to new day : " + hoursToNewDay);
```
Output :
```
Now : 23:39:39.211
Evening : 20:00
After 30 minutes from now : 00:09:39.217
Remaining minutes to new day : 20
```
### LocalDateTime
Hem tarih hemde zaman bilgisini birlikte tutmaya ve işlemeye yarayan sınıftır. LocalDate ve LocalTime gibi LocalDateTime da
immutable ve thread safe dir. 
```java
LocalDateTime now = LocalDateTime.now();
System.out.println("Now : " + now);

LocalDateTime evening = LocalDateTime.of(2020, 11, 24, 20, 45, 0);
System.out.println("Evening : " + evening);
```
Output :
```
Now : 2020-11-24T22:53:16.636
Evening : 2020-11-24T20:45
```
### DateTimeFormatter
Bazı durumlarda LocalDateTime objemizi belirli bir formatta string objesine çevirmemiz yada tam tersi belli bir formatta 
oluşturulmuş string objemizden LocalDateTime objesi oluşturmamız gerekebilir. Bu durumlarda LocalDateTimeFormatter dönüşüm 
konusunda işimizi kolaylaştırır. 
```java
LocalDateTime now = LocalDateTime.now();
System.out.println("Default format : " + now);

String formattedDateTime = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
System.out.println("Custom format : " + formattedDateTime);

String date = "11-24-2020 10:12:00";
LocalDateTime parsedDate = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));
System.out.println("Custom format parsed : " + parsedDate);
```
Output :
```
Default format : 2020-11-24T23:06:41.127
Custom format : 24-11-2020 23:06:41
Custom format parsed : 2020-11-24T10:12
```
### Duration
İki farklı zaman dilimi arasındaki farkı farklı zaman birimlerinde hesaplamaya yarayan sınıftır. 

```java
LocalDateTime now = LocalDateTime.now();
LocalDateTime myBirthDate = LocalDateTime.of(1987, 3, 7, 0, 0, 0);

Duration duration = Duration.between(myBirthDate, now);
System.out.println("My birthdate : " + myBirthDate);
System.out.println("Now : " + now);
System.out.println("Days between min date and now : " + duration.toDays());
```
Output :
```
My birthdate : 1987-03-07T00:00
Now : 2020-11-24T23:13:11.127
Days between min date and now : 12316
```

## Nesneye Yönelik Programlama (OOP)
Nesne (object) Java dilinin özüdür temelde. Nesneler classlardan üretilir ve class kavramı Javanın temel yapı taşıdır.
Bu nedenle Javayı anlamak için class ve object kavramını çok iyi anlamak gerekir.

Etrafımızda gördüğümüz herşey bir obje olarak modellenebilir. Nesneye dayalı programlamanın gücü de burdan gelir. Gerçek hayatı
modellemek için iyi bir araçtır.

### Class ve Object kavramları
Javada hersey classların içinde döner, aslında eğitimin başından beri classları çokca kullandık fakat oldukça basit classlardı bunlar.
Bir class çeşitli türden veriler ve bu veriler üzerinde işlem yapmaya yarayan metodlar içerir. Bu haliyle class objeler için
bir şablon görevi görür, yani tek başına class bir işe yaramaz. Onun hafızada bir yer kaplaması ve programın döngüsüne katılabilmesi için
kendisinden objeler yaratılmalıdır.

Sınıfın içinde bulunan verilere ve metodlara sınıfın üyeleri adı verilir. Sınıfın içinde bulunan verilere tek başına 
instance variable da denir.

Bir sınıf hem veri hem metod barındırabileceği gibi bunlardan sadece birini de barındırabilir.

```java
class classname {
    // declare instance variables
    type var1;
    type var2;
    // ...
    type varN;

    // declare methods
    type method1(parameters) {
     // body of method
    }
    type method2(parameters) {
     // body of method
    }
    // ...
    type methodN(parameters) {
     // body of method
    }
}
```

Bir class tanımlarken burada önemli olan sınıfın birbiri ile alakalı bilgiler içeriyor olmasıdır. Örneğin bir kullanıcı sınıfı
tanımlıyorsak içine kullanıcı adı, email adresi gibi bilgiler koyarken stok bilgisi ile ilakalı veriler koymaktan kaçınmalıyız.

Bir java uygulamasında main() metodu uygulamanın başlangıç noktasını işaret eder. O nedenle eğer yazdığımız sınıf uygulamanın 
başlangıç noktası değilse o sınıf main() metodunu içermemelidir.

Şimdi bir Vehicle sınıfı yaratalım ve bundan instancelar üretelim :
```java
public class Vehicle {

    int passengers;
    double fuelCapacity;
    int fuelConsumptionPerKm;
}
```

```java
public class Main {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelCapacity = 70;
        minivan.fuelConsumptionPerKm = 6;

        double range = minivan.fuelCapacity / minivan.fuelConsumptionPerKm;
        System.out.println("Minivan can carry " + minivan.passengers + " people for " + range + " km");
    }
}
```
Output :
```
Minivan can carry 7 people for 11.666666666666666 km
```

#### Instance variables
Daha önce class degişkenlerine instance variables denildiğini öğrenmiştik. Şimdi bu değikenlere biraz daha yakından bakalım.
Bu değişkenlerin default değerleri vardır, yani bir classdan bir instance yarattığımızda eğer değişkenlerine biz değer atamazsak
Java arka planda bu değişkenlere bir değer ataması yapar.

```java
public class Vehicle {
    int passengers;
    double fuelCapacity;
    int fuelConsumptionPerKm;
    boolean isSport;
    String brand;
}
```
```java
public class Main {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        System.out.println(
                "Brand " + minivan.brand +
                " passengers : " + minivan.passengers +
                " fuel capacity : " + minivan.fuelCapacity +
                " consumption per km : " + minivan.fuelConsumptionPerKm +
                " is sport car : " + minivan.isSport
        );
    }
}
```
Output :
```
Brand null passengers : 0 fuel capacity : 0.0 consumption per km : 0 is sport car : false
```
Burada gördüğümüz gibi instance değişkenleri biz onlara değer atamazsak default değerleri java tarafından atanır.

#### Metodlar
Daha önce instance değişkenlerini görmüştük şimdi ise bu değişkenler üzerinde işleem yapmak için metod tanımına bakacağız.
```java
return-type methodName( parameter-list ) {
    // body of method
}
```
Burada methodName metodumuzun ismini temsil etmektedir ve daha sonra bu metoda erişmek istediğimizde kullanacağız.
parameter-list ise metodumuzun kabul ettiği argüman listesini temsil etmektedir. Son olarak return-type metod işletildiği
zaman metodun çağırıldığı yere hangi tipte bir veri döneceğini belirtir. Return tipi bir primitive tip olabileceği gibi
 bir class da olabilir(yani metod bir obje dönebilir). Bazı durumlarda bir metod hiçbir değer de dönmeyebilir,
yine de bu durumda metodun dönüş tipini özel bir kelime ile belirtmemiz gerekir; **void**

Şimdi daha önce yarattığımız Vehicle sınıfına bir metod ekleyelim.
```java
public class Vehicle {
    int passengers;
    double fuelCapacity;
    int fuelConsumptionPerKm;
    boolean isSport;
    String brand;

    double range () {
        return fuelCapacity / fuelConsumptionPerKm;
    }
}
```

```java
public class Main {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelCapacity = 70;
        minivan.fuelConsumptionPerKm = 6;

        double range = minivan.range();
        System.out.println("Minivan can carry " + minivan.passengers + " people for " + range + " km");
    }
}
```
Output :
```
Minivan can carry 7 people for 11.666666666666666 km
```
Burada range() metodunun fuelCapacity ve fuelConsumptionPerKm değerlerine obje ismi kullanmadan eriştiğine dikkat ediniz.
Ayrıca metoddan çıkmak ve değer dönmek için **return** ifadesinin kullanıldığına da dikkat ediniz.

```java
public class SimpleMath {

    int add (int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    boolean isOddNumber(int a) {
        if (a % 2 == 0) {
            return false;
        }
        return true;
    }

    boolean isFactor(int a, int b) {
        return a % b == 0;
    }

    public int addAll(int[] args) {
        int sum = 0;
        for (int value : args) {
            sum += value;
        }
        return sum;
    }
}
``` 
```java
public class Main {

    public static void main(String[] args) {

        SimpleMath simpleMath = new SimpleMath();
        int addThreeAndFive = simpleMath.add(3, 5);
        boolean factorElevenAndThree = simpleMath.isFactor(11, 3);
        int sum = simpleMath.addAll(new int[]{1, 2, 3});
    }
}
```
#### Constuctor
```java
Vehicle minivan = new Vehicle();
minivan.passengers = 7;
minivan.fuelCapacity = 70;
minivan.fuelConsumptionPerKm = 6;
```
Daha önceki örneklerimizde yukarıdakine benzer objenin değişkenlerine değer atama işlemleri görmüştük.
Profesyonel bir uygulamada buna benzer değer atama işlemlerini göremeyiz, bunun yerine değişkenlerin ilk değerlerini atamak
için constructor dediğimiz metodlara benzeyen yapıları kullanırız.

Constructorlar ait oldukları class ile aynı ismi taşırlar ve bir dönüş değerleri yoktur. Bir constructorun içinde instance variablelara
ilk değer atama işlemi yapılırken ayrıca objenin tam olarak işlevini yerine getirmesini sağlayacak diğer konfigürasyon işlemleri de yer 
alabilir.
```java
public class Vehicle {
    int passengers;
    double fuelCapacity;
    int fuelConsumptionPerKm;
    boolean isSport;
    String brand;

    public Vehicle() {
        passengers = 4;
        fuelCapacity = 60;
        fuelConsumptionPerKm = 6;
        isSport = false;
        brand = "BMW";
    }
}
```

Burada görülen constructor hiç bir parametre almazken içinde bütün instance değişkenlerine default değerler atanmıştır.

```java
public class Main {

    public static void main(String[] args) {

        Vehicle bmw = new Vehicle();
        System.out.println(
                "Brand " + bmw.brand +
                        " passengers : " + bmw.passengers +
                        " fuel capacity : " + bmw.fuelCapacity +
                        " consumption per km : " + bmw.fuelConsumptionPerKm +
                        " is sport car : " + bmw.isSport
        );
    }
}
```
Output :
```
Brand BMW passengers : 4 fuel capacity : 60.0 consumption per km : 6 is sport car : false
```

Constructorlar aynı zamanda bütün bu değerleri dışarıdan argüman olarak da alabilir, bu durumda ilk değerleri set etme görevi
objeyi yaratan kod parçasına düşer.

```java
public Vehicle(int passengers, double fuelCapacity, int fuelConsumptionPerKm, boolean isSport, String brand) {
    this.passengers = passengers;
    this.fuelCapacity = fuelCapacity;
    this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    this.isSport = isSport;
    this.brand = brand;
}
```
```java
Vehicle bmw = new Vehicle(4, 75, 7, false, "Volkswagen");
```

Eğer hiç bir constructor eklemezsek sınıfa bu durumda Java otomatik olarak default constructoru ekler (hiçbir parametre almayan constructor)
ve değişkenler default değerlerini alır.

 #### Bir obje yaratıldığında arka planda neler olur ? 
 
![memory model](images/java-memory-model.png)

Jvm (Java virtual machine)'de memory yönetimi şu şekilde yapılır :
Memory ikiye ayrılmıştır, Stack ve Heap. Yaratılan her bir obje memoryde Heap adı verilen bu özel alanda saklanır. 
Bunun yanında uygulama sırasında yaratılan her bir thread için bir Stack alanı açılır ve bu alan threadin çaşıltırdığı metodları
sırası ile tutar. Çalıştırılan metodların yanında local değişkenler de stackde saklanır. 

Burada önemli bir kaç nokta vardır. Memorydeki stack alanları threadlere özeldir, yani bir threadin stack alanına sadece o thread erişebilir.
Fakat heap memorydeki paylaşılan alandır, yani bir thread bir obje yaratırsa heap alanında bu obje diğer threadler için de erişilebilirdir.
Bu multithread uygulamalarda herzaman istenmeyen bir olaydır, concurrency ve multithreading konuları gelince bu konuya tekrar detaylıca değineceğiz.
Bunun yanında bir method içinde bir lokal değişken bir objeye referans ediyor diyelim, referans stack kısmında saklanırken objenin kendisi
heap alanında saklanır. 

Peki heap ve stack alanlarında ne kadar veri saklayabiliriz ? Memory dediğmiz kısım fiziksel bir cihazdan ibaret olduğu için
tabiki maksimum kullanabileceğimiz bir limit var. Fakat basit bir uygulamada bu limiti doldurmak okadar kolay değil merak etmeyin
sadece döngüler içinde obje yaratırken dikkatli olun yeter =) Yinede jvm parametreleri ile stack ve heap için nekadar 
yerayırmak istediğimizi kontrol edebiliyoruz. Olurda yinede ayırdığımız stack alanı yeterli gelmezse java.lang.StackOverFlowError 
exceptionı fırlatılır. Eğer heap alanı yeterli gelmez ise java.lang.OutOfMemoryError hatası fırlatılır.

#### new ve this anahtar kelimeleri
new operatorünün yeni nesne yaratmak için kullanıldığını daha önce görmüştük. new operatoru ile yarattığımız nesneyi bir
referans değişkenine atayarak bu referans değişkenin ismiyle objenin fieldlarına ve metodlarına erişebildiğimizi de görmüştük.

Şimdi this anahtar kelimesine bakalım biraz da ;
```java
public class Power {
    int base;
    int power;
    int value;

    public Power(int base, int power) {
        this.base = base;
        this.power = power;

        if (power == 0) return;
        
        this.value = 1;
        for (int value = 0; value < power; value++) {
            this.value = this.value * base;
        }
    }
}
```
Burada value ifadesine dikkat edelim. Hem instance variable olarak tanımlanmış, hem de for döngüsü içinde local değişken olarak 
tanımlanmış. Javada bu tarz durumlarda eğer this anahtar kelimesini kullanmazsak jvm instance değişkenini görünmez kılar ve
for döngüsü içinde local değişken olan value değeri kullanılır. bu şekilde this anahtar kelimesi bize instance değişkenine 
objenin kendi içinde erişme imkanı verir. Yani sadece bir objenin içinde objenin alanlarına/metodlarına erişmek için kullanılır.

#### Pass by value / pass by reference
Mülakatlarda en çok karşımıza çıkan konseptlerden birisi budur. Daha önce metodlara argüman verilebildiğini görmüştük.
Peki bir metoda bir değişkeni gönderdiğimizi düşünelim, ve bu metodun da gönderdiğimiz değişkenin değerinde değişiklik yaptığını 
varsayalım. Bu durumda metodu çağırdığımız yerde tekrar parametre olarak gönderdiğimiz değişkenlere erişmek istersek hangi
değere erişiriz ?

```java
public static void main(String[] args) {

    int value = 5;
    Vehicle vehicle = new Vehicle(4, 60, 6, false, "BMW");

    System.out.println("Value : " + value);
    System.out.println("Brand of vehicle : " + vehicle.brand);

    doSomeOperation(value, vehicle);
    System.out.println("After the operation -------");
    System.out.println("Value : " + value);
    System.out.println("Brand of vehicle : " + vehicle.brand);
}

public static void doSomeOperation(int value, Vehicle vehicle) {
    value = 10;
    vehicle.brand = "Mercedes";
}
```
Output :
```
Value : 5
Brand of vehicle : BMW
After the operation -------
Value : 5
Brand of vehicle : Mercedes
```

Burada görüldüğü gibi metoda bir primitive tipte değişken gönderirsek o değişkenin değerinin bir kopyası metoda ulaşmış olur
ve orijinal değer üzerinde yapacağımız değişiklikleerden etkilenmez. Buna pass by value denir.

Fakat bir metoda bir objeyi parametre olarak gönderirsek aslında metoda o objenin referansı yani memorydeki adresi ulaşmış olur
bizde metodun içinde o referansı kullanark objeye erişir ve değerleri değiştirirsek orijinal objede değişiklik yapmış olur.
Buna pass by reference denir.

Yani Javada metodlar hem pass by value hemde pass by refernce dir. Metoda ne gönderdiğinize bağlı olarak. 

#### Garbage Collector
Daha önce objelerin memorynin heap adı verilen özel alanlarında tutulduğunu ve bu alanın bir limitinin olduğundan bahsetmiştik.
BU nedenle uygulamada yarattığımız objelerin kendilerine ihtiyaç kalmadığından memoryden temizlenmesi gerekir. C gibi bazı
dillerde bu işlem manuel olarak uygulamanın içinden yapıldığı gibi Javada bu işlem tamemn JVM tarafından Garbage Collector
dediğimiz bileşen tarafından otomatik olarak yürütülür. Yani developer olarak bizim birşey yapmamıza gerek yok. 

Garbage collector bir nesneye ait referans kalmadığında memeoryde bu nesnenin memoryde tuttuğu alanı temizleer ve tekrar kullanıma 
açar. Bu işlemi kod içinde tetiklemenin bir yolu yok. Masraflı bir işlem olduğu için işlemin zamanına Garbage Collector kendisi
karar verir. 

## Inheritance, Polymorphism, Encapsulation

### Inheritance
Inheritance (kalıtım) nesne yönelimli programlamanın üç ana bileşeninden birisidir. Inheritance yardımıyla sınıflar arası 
hierarşi oluşturmak ve ortak özellikleri başka sınıflara aktarmak mümkündür.

Kalıtımda iki ana unsur vardır, ortak özellikleri taşıyan ve diğer sınıflara aktaran superclass ve superclass dan kalıtımla 
ortak özellikleri alıp üzerine kendine has özellikleri ekleyen subclass.

Kalıtımı sağlamak için Javada **extends** ifadesini kullanırız. Genel syntax şu şekildedir.

```java
class SuperClass {
}

class SubClass extends SuperClass {
}

class SubToSubClass extends SubClass {
}
```

> Java dilinde bir subclass sadece bir superclass ı extend edebilir. Mülakatlarda bu konu çok sıklıkla sorulmaktadır.
> Javada bu şekilde multiple inheritance mümkün değildir. Bunun sebebini ilerleyen konularda göreceğiz.

![class_hierarchy](images/inheritance_1.png)

Şimdi bu yukarda gördüğümüz örnek dizaynı nasıl implemente edebiliriz bakalım, 

```java
public class Vehicle {
    String brand;
    String model;
    String fuel;
    int tankCapacity;
    double remainingFuel;

    void fillTheTank(double amount) {
        if (amount + remainingFuel < tankCapacity) {
            tankCapacity += amount;
        }
    }
}

public class Car extends Vehicle {
    int numberOfSits;
}

public class Train extends Vehicle {
    boolean isPassengerTrain;
    int numberOfWaggons;

    void addWaggon(int waggons) {
        numberOfWaggons += waggons;
    }
}

public class Truck extends Vehicle {
    int loadCapacityInTons;
    int currentLoad;

    void loadTruck(int load) {
        if (load + currentLoad <= loadCapacityInTons) {
            currentLoad += load;
        }
    }
}
```

#### super anahtar ifadesi
Yukarıdaki örnekte de görüldüğü gibi Car, Train ve Truck sınıfları Vehicle sınıfını extend ediyor ve kalıtım yolu ile 
Vehicle sınıfının değişkenlerine ve metoduna sahip oluyorlar. Subclass lar superclass tarafından sunulan değişken ve metodlara 
super ifadesi aracılığıyla erişebilirler. Bu erişim tek yönlüdür, yani superclass subclass ın bileşenlerine erişemez.

```java
public class Car extends Vehicle {
    int numberOfSits;

    void printCarNameAndBrand() {
        System.out.println("Brand : " + super.brand + " Model : " + super.model);
    }   
}
``` 

#### Inheritance ve constructor işlemleri
Üst sınıflar alt sınıflardan bağımsızdır fakat alt sınıflar üst sınıflara bağımlıdır. Örneğin üst sınıfların objeleri
bağımsız olarak yaratılabilir.

```java
public class Vehicle {
    String brand;
    String model;
    String fuel;
    int tankCapacity;
    double remainingFuel;

    public Vehicle(String brand, String model, String fuel, int tankCapacity, double remainingFuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
        this.remainingFuel = remainingFuel;
    }

    void fillTheTank(double amount) {
        if (amount + remainingFuel < tankCapacity) {
            tankCapacity += amount;
        }
    }
}

public class Truck extends Vehicle {
    int loadCapacityInTons;
    int currentLoad;

    public Truck(String brand, String model, String fuel, int tankCapacity, double remainingFuel, int loadCapacityInTons, int currentLoad) {
        super(brand, model, fuel, tankCapacity, remainingFuel);
        this.loadCapacityInTons = loadCapacityInTons;
        this.currentLoad = currentLoad;
    }
    
    void loadTruck(int load) {
        if (load + currentLoad <= loadCapacityInTons) {
            currentLoad += load;
        }
    }
}
```

Üst sınıfa bir constructor eklersek bu constructor ı alt sınıflara da constructor ekleyerek üst sınıfın constructorunu 
uygun şekilde çağırmamız gerekir. Aksi durumda compiler hata verir. Onun dışında alt sınıfın ihtiyacı olan bilgileri de 
constructora ekleyip alt sınıfın değişkenlerine atayabiliriz. Burada this ifadesini kullanarak içinde bulunduğumuz objeye
değerleri atarız.

Burada önemli olan herzaman üst sınıfın constructorunun alt sınıf constructorunda ilk olarak çağrılması gerektiğidir.
Çünkü herzaman sınıf hieraşisinde ilk olarak üst sınıfın constructoru çalıştırılır ve biter.

```java
public class A {
    public A() {
        System.out.println("Constructing class A");
    }
}

public class B extends A {
    public B() {
        System.out.println("Constructing class B");
    }
}

public class C extends B {
    public C() {
        System.out.println("Constructing class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
    }
}
```

Output :
```
Constructing class A
Constructing class B
Constructing class C
```

#### Süper sınıf referans ve alt sınıf obje
Java dilinin tip ve değer uyumunu kontrol ederken çok katıdır. Yani diyelimki X sınıfı ve Y sınıfı diye iki tane sınıfınız var.
Bu sınıflar arasında üst sınıf alt sınıf ilişkisi yok. Bu durumda X tipinde bir değişkene Y tipinde bir objeyi değer olarak
atayamayız. Java buna compile sırasında hata vererek engel olur. 

```java
public class X {
    
}

public class Y {
   
}

public class Main {
    public static void main(String[] args) {
        X x = new Y(); // Hata
    }
}
```

Fakat X ve Y siniflari arasinda üst alt sınıf ilişkisi varsa bu drumda X tipinde bir değişkene Y tipinde bir objeye referans edebilir.
Fakat bu durumda referans üzerinden sadece Y objesi tarafından sunulan ortak bileşenlere erişilebilir. Bunun tam tersi mümkün değildir,
yani alt sınıf tipinde bir değişken üst sınıf tipinde bir objeye referans gösteremez.

```java
public class X {
    int valueByX;
}

public class Y extends X {
   int valueByY;
}

public class Main {
    public static void main(String[] args) {
        X x = new Y();
        x.valueByX = 10;
        x.valueByY = 10; // Hata
        
        Y y = new X(); // Hata
 
    }
}
```
#### Method overriding ve method overloading
En çok karıştırılan ve bu nedenle de mülakatlarda en çok soru sorulan konulardan biri method overriding/overloading konusudur.  
Her nekadar fonotik olarak birbirine benzeselerde birbirinden tamamen farklıdır bu iki kavram. Öncelikle doğrudan kalıtım
konusuyla da ilgili olan overriding kavramına bakalım.

Üst sınıf tarafından alt sınıfa miras bırakılan metodların alt sınıftan bir obje yaratılarak erişilebildiğini daha önce öğrenmiştik.
Bazı durumlarda üst sınıf tarafında kalıtımla alt sınıflara miras bırakılan metodlar alt sınıfın ihitiyacını tam olarak karşılayamazlar.
Bu durumda bu metodun alt sınıfta onun kendi ihtiyacına uygun olarak tekrardan yazılması gerekir. Burada önemli olan metod 
imazsının aynen korunmasıdır. Bu noktada alt sınıftan yaratılan obje artık üst sınıfın metodunu değil kendi metodunu kullanabilecektir.
 İşte bu olaya üst sınıfın metodunu ezme yani method overriding denir.
 
```java
public class Animal {

    void speak() {
        System.out.println("All animals speak.");
    }
}

public class Dog extends Animal {

    void speak() {
        System.out.println("Dogs bark");
    }
}

public class Ant extends Animal {

    void speak() {
        System.out.println("Ants don't speak much");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();

        Ant ant = new Ant();
        ant.speak();
    }
}
```

Output :
```
All animals speak.
Dogs bark
Ants don't speak much
```

Method overloading ise aynı sınıf yada üst sınıfta yer alan bir metodun ismini korumak şartıyla imzasının değiştirilerek
farklı şekilde implemente edilmesidir.

```java
public class Animal {

    void speak() {
        System.out.println("All animals speak.");
    }
}

public class Ant extends Animal {

    void speak() {
        System.out.println("Ants don't speak much");
    }

    void speak(String word) {
        System.out.println(word);
    }
}

public class Main {

    public static void main(String[] args) {

        Ant ant = new Ant();
        ant.speak();
        ant.speak("Overloaded method");
    }
}
```

Output :
```
Ants don't speak much
Overloaded method
```

> Method overriding olabilmesi için kalıtımın olması ve override edilen metodun imzası değiştirilmeden sadece implementasyon 
 kısmının değişmesi şarttır.Fakat overloading olması için kalıtım olması şart değildir, metodun imzasının değişmesi 
 yeterlidir (metod ismi aynı kalmalı).

### Polymorphism (Çok biçimlilik)
Java dilinde iki tip polymorphism vardır; ilki compile time polymorphism, ikincisi ise runtime polymorphism.

#### Compile time polymorphism
Java dilinde method overloadingin ne demek olduğunu ve nasıl yapıldığını daha önceki konularımızda öğrenmiştik. Şimdi bunun
compiler açısından ne demek olduğuna bakalım. Diyelimki bir Math sınıfımız var ve bu sınıfın içine basit toplama işlemi 
için metodlar eklemek istiyoruz. Bu metodlar iki tane sayısal parametre alsın ve bunları toplayıp sonucunu dönsün.

Burada Math sınıfını kullanacak diğer sınıfları toplama işleminin karmaşasından uzaklaştırmak ve toplama işlemini parametrelerin
tipinden bağımsız hale getirmek için meethod overloading yöntemini kullanırız. Yani aynı isimli toplama metodları farklı türle 
parametreler alır ve aldığı parametre tipinde sonuç döner.

```java
public class Math {

    int add (int a, int b) {
        return a + b;
    }

    double add (double a, double b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {

        Math math = new Math();
        int addInt = math.add(5, 4);
        double addDouble = math.add(1.2, 5.7);
    }
}
```   

Örnekte görüldüğü gibi Main sınıfının main metodu Math sınıfından bir obje yaratıyor sonra int ve double değerleri topluyor.
Bu iki işlem için aynı metod ismini kullanıyor. Bu uygulamayı compile ettiğimiz zaman arka planda compiler hangi metodun 
çağrılacağına compile time da karar veriyor. Buna compile time polymorphism denir.

#### Runtime polymorphism
Daha önce super class, sub class ve mothod overriding kavramlarından bahsetmiştik. Hatta super class tipinde bir değişkenin 
sub class tipinde bir objeye referans gösterebileceğini de söylemiştik.

Böyle bir durumda sub classın bir metodu override ettiğini ve referans değişken ile override edilen metodun çağırıldığını düşünelim
Bu durumda JVM hangi metodu kullanacak ? JVM in hangi metodu çağıracağını compile time da bilme şansı yoktur. Çünkü referans 
değişkenine obje atama işlemi run time da gerçekleşir. JVM de runtime da referans edilen objenin ilgili metodunu çağırır.
Burda yazılımcı olarak önemli olan metodun nasıl çağrılacağını bilmektir. Geri kalan iş JVM tarafından runtime da halledilir.

```java
public class Animal {

    void speak() {
        System.out.println("All animals speak.");
    }
}

public class Dog extends Animal {

    void speak() {
        System.out.println("Dogs bark");
    }
}

public class Ant extends Animal {

    void speak() {
        System.out.println("Ants don't speak much");
    }
}

public class Main {

    public static void main(String[] args) {

        letTheAnimalSpeak(new Dog());
        letTheAnimalSpeak(new Ant());
        letTheAnimalSpeak(new Animal());
    }
    
    static void letTheAnimalSpeak(Animal animal) {
        animal.speak();
    }
}
```    
Burada letTheAnimalSpeak metodu bir Animal objesi kabul ediyor ve objenin speak metodunu çağırıyor. Burada hangi metodun 
çalıştırılacağına runtime da JVM gelen parametreye göre karar veriyor. İşte buna runtime polymorphism denir. 

### Abstract method ve abstract class
Daha önce inheritance yardımıyla bir sınıfın başka sınıfların yerine metodları nasıl implemente ettiğini görmüştük.

Bazı durumlarda super class bu metod implementasyonunu kendisi yapmak yerine bunu sub classlara bırakmak ister. Kendisi
sadece metod imzasını verir ve metodun içini doldurma işlemini subclass dan bekler.

Bu durumda aşağıdaki yapıda abstract metod tanımlaması yapılır.
```java
abstract class AbstractClassName {
    abstract returnType methodName();
}
``` 
Burada önemli olan abstract metodların subclasslar tarafından implemente edilmesi gerektiğidir. Aksi durumda onlar da abstract 
class olmak zorunda ve implementasyonu kendi subclasslarina birakmak zorundalardır. Ayrıca abstract 
metodların yalnızca abstract class içinde yer alabileceğini unutmayalım. Abstract classlar abstract metodların yanında
metod implementasyonları da içerebilir.

```java
public abstract class Animal {

    void doSomething() {
        System.out.println("I'm doing something else");
    }

    abstract void doSomethingElse();

    abstract void speak();
}

public class Dog extends Animal {

    void speak() {
        System.out.println("Dogs bark");
    }
    
    void doSomethingElse() {
        System.out.println("Something something else");
    }


}

public abstract class Ant extends Animal {
    void doSomethingElse() {
        System.out.println("Something something else from Ant");
    }
}
```  
Yukardaki örnekte Dog sınıfının Animal sınıfı tarafından tanımlanan tüm abstract metodları implemente etmek zorunda kaldığına
Ant sınıfının ise abstract olduğu için Animal tarafından tanımlanan tüm abstract mettodları impleemente etmek zorunda olmadığına
dikkat edelim.

> Abstract classların new operatörü yardımıyla objelerinin yaratılamayacağını unutmayalım.

### Interface
Abstract sınıflar tarafından sunulan abstraction ın bir adım daha ileri taşınmış halidir interface.
Abstract class da yer alan abstract metodlar metod imzasını verir metodun implementasyonunu subclass a bırakır. Yani ne yapılması
gerektiğini tarif eder fakat nasıl yapılması gerektiğini söylemez. Bunun yanında abstract class ful implemente edilmiş 
metodlar, private metodlar yada instance değişkenleri de barındırabilir. İşte interface tam da bu noktada farklılık gösteriyor.
Java 8 öncesi versiyonlarda interfaceler sadece metod imzalarını içinde barındırabiliyor implementasyon kısmını interface i
implemente eden sınıfa bırakıyordu. Java 8 ile birlikte interfaceler içinde sabit değişkenler ve default metodlar (ful implemente
edilmiş) da ekleyebiliyoruz. Java 9 ve 10 ile birlikte daha yeni özellikler de eklendi ama biz onlara değinmeyeceğiz.

```java
access interface name {
    returnType methodName1(parameter list);
    returnType methodName2(parameter list);
    
    default returnType defaultMethod1(parameter list) {
        ...
    }

    type var1 = value;
    type var2 = value;
}
```

Burada dikkat edilmesi gereken noktaların başında class yerine kullandığımız interface anahtar kelimesi gelir. 
Bunun yanında bir interface sadece 2 farklı erişim belirleyici alabilir. Public yada default (Erişim belirleyicilere 
daha sonra detaylı olarak değineceğiz)
Bir interface hangi erişim belirleyiciyi alırsa içindeki metodlar o erişim belirleyiciye otomatik olarak sahip olur 
yani tekrar erişim belirleyici almalarına gerek olmaz ve bu değiştirilemez.
Interface içinde tanımlanan bütün değişkenler otomatik olarak class düzeyinde (public, static, final) değişken olurlar ve bir ilk değer 
almak zorundalar. Buna constant yani sabit değer diyeceğiz.
Default metodlar, default anahtar kelimesini almaları dışında normal metodlar gibi davranır ve interface i implemente eden 
sınıfa davranışları aktarırlar.

Interfacelerin nasıl implemente edildiğine bakalım :
```java
class ClassName extends SuperClass implements Interface1, Interface2, Interface3 {
}
```

Bir class hem bir super class ı extend edip hemde bir yada birden fazla interface i implemente edebilir. Bir interface i
implemente etmek için yukarda görüldüğü gibi implements anahtar kelimesini kullanmak yeterlidir. Eğer birden fazla interface i
implemente etmek gerekirse bunları virgül ile ayırmak yeterli olur.

Eğer bir sınıf bir yada birkaç interface i implemente ediyor ise bu interfacelerde yer alan tüm metodları implemente etmek zorundadır.
Eğer tüm metodları implemente etmek istemezsek bu durumda bu sınıfı abstract sınıf yapmak zorundayız böylece implemente etmediğimiz
metodlar otomatikman abstract metod gibi davranacak ve implemente etmek zorunda kalmayacağız. Bu abstract sınıfı extend ettiğimiz
sınıf içinde bu metodları implemente etmemiz gerekecek. Böyle bir durumda eğer interface içinde bir default metod var ise 
bu metodu abstract class içinde override etmek de mümkündür. 

```java
abstract class Animal {
    String name;
    String mainLand;
    int averageLife;
    double averageHeight;
    double averageWeight;

    public Animal(String name, String mainLand, int averageLife, double averageHeight, double averageWeight) {
        this.name = name;
        this.mainLand = mainLand;
        this.averageLife = averageLife;
        this.averageHeight = averageHeight;
        this.averageWeight = averageWeight;
    }
}

public interface Flyer {
    void fly();
}

public interface Runner {
    void run();
}

public interface Swimmer {
    void swim();
}

public class Dog extends Animal implements Runner, Swimmer {

    public Dog(String name, String mainLand, int averageLife, double averageHeight, double averageWeight) {
        super(name, mainLand, averageLife, averageHeight, averageWeight);
    }

    public void run() {
        System.out.println("A dog can run.");
    }

    public void swim() {
        System.out.println("A dog can swim.");
    }
}

public class Eagle extends Animal implements Flyer {


    public Eagle(String name, String mainLand, int averageLife, double averageHeight, double averageWeight) {
        super(name, mainLand, averageLife, averageHeight, averageWeight);
    }

    public void fly() {
        System.out.println("An eagle can fly");
    }
}

public class Puffin extends Animal implements Swimmer, Flyer {

    public Puffin(String name, String mainLand, int averageLife, double averageHeight, double averageWeight) {
        super(name, mainLand, averageLife, averageHeight, averageWeight);
    }

    public void fly() {
        System.out.println("A puffin can fly");
    }
    
    public void swim() {
        System.out.println("A puffin can swim");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Lessi", "Anywhere on the earth", 15, 60, 35);
        Animal eagle = new Eagle("Rocky", "Rocks", 25, 60, 30);
        Animal puffin = new Puffin("Puffin", "North", 8, 40, 25);

        printSkills(dog);
        printSkills(eagle);
        printSkills(puffin);
    }

    static void printSkills(Animal animal) {
        if (animal instanceof Flyer) {
            ((Flyer) animal).fly();
        }

        if (animal instanceof Swimmer) {
            ((Swimmer) animal).swim();
        }

        if (animal instanceof Runner) {
            ((Runner) animal).run();
        }
    }
}

``` 

Output :
```
A dog can swim.
A dog can run.
An eagle can fly
A puffin can fly
A puffin can swim
```

Bir interface başka bir interface i extend edebilir, uygulanış şekli normal sıfınıfların birbirini extend etmesi gibidir.
Eğer bir sınıf başka bir interface i extend eden bir intterface i implemente derse bu durumda heer iki interface de de bulunan 
tüm metodları implemente etmesi gerekir.

```java
interface A {
    void method1();
} 

interface B extends A {
    int method2();
}

class C implements B {
    void method1() {
    }
    
    int method2() {
    }   
}
``` 

### Multiple Inheritance

### Encapsulation
Şuana kadar örneklerimizde sadece 1-2 sınıftan oluşan basit kod parçaları gördük fakat gerçek hayatta yazılımlar çok daha
karmaşık olabilmekte. Bir yazılım içinde onlarca, yüzlerce, binlerce hatta milyonlarca sınıf bulunabiliyor. Bunun üzerine 
yazılımınız tarafından kullanılan kütüphaneleri de eklediğimiz zaman ortaya çok karmaşık bir yapı çıkmakta. Ve uygulamada 
bazı bilgilerin diğer sınıf/objelerin erişiminden saklanması ihtiyacı ortaya çıkmakta. Java dili bize bu gizlenmeyi ve 
beraberinde güvenliği sağlama noktasında bir kaç adımdan oluşan güçlü bir mekanizma sunuyor. Şimdi bu adımlarda kullanmamız gereken
bileşenlere göz atalım:

#### Package kavramı
Package dediğimiz kavram aslında dosya sisteminde dizin (folder) den ibarettir. Mantıksal olarak birlikte bulunması gereken
sınıfları birlikte gruplamaya yarar. Ayrıca aynı isme sahip sınıflar için isim karmaşasını önler. Son olarak da erişim 
kontrol mekanizmasında önemli bir rol oynar. Şimdi paketlerin nasıl tanımlandığına ve kullanıldığına göz atalım.

Javada paketler **src** dizininin altında yer alır ve src dizininin altından yaratılan dizinler daha sonra o dizinler
içinde yaratılacak sınıfların paket ismini oluşturur, yani java paket isimlerinde dosya sistemini kullanır. 

Eğer uygulamada hiçbir paket yaratmazsak ve sınıflarımızı doğrudan src dizinine koyarsak java bizim için default paketi 
kullanır.

Bir paket yaratılırken isimlendirmeye dikkat etmek gerekir. Javada paket isimleri case sensitive dir, yani büyük küçük harfe duyarlıdır.
Pratikte paket isimlendirmede vereceğimiz ismin her bir harfi için bir dizin oluşturulur ve tamamen küçük harfler tercih edilir.
```java
src
 |
 |--pckg1
    |
    |--pckg2
        |
        |--pckg3
            |
            |--pckg4
```

Bir sınıfın hangi pakete ait olduğunu öğrenmek için o sınıfın ilk satırına bakarız, paket bilgisi aşağıdaki gibi tanımlanır.

```java
package pckg1.pckg2.pckg3.pckg4;
```

Başka bir pakette tanımlanmış bir sınıfa başka bir pakette tanımlanmış bir sınıftan erişmek istersek o sınıfı paket bilgisi 
ile birlikte import etmemiz gerekir.

```java
package com.hkarabakla.example;

import java.util.UUID;

public class UserDetails {
    String username;
    UUID userId;
    String name;
    String surname;

    public UserDetails(String username, UUID userId, String name, String surname) {
        this.username = username;
        this.userId = userId;
        this.name = name;
        this.surname = surname;
    }
}
```

```java
package com.hkarabakla;

import UserDetails;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails("nesUser", UUID.randomUUID(), "name", "surname");
        userDetails.username = "anotherName";
    }
}
```

Yukarıdaki örnekte görüldüğü gibi UserDetails objesini yaratabiliyor ve constructor unu kullanarak instance değişkenlerine
değer atayabiliyoruz. Fakat yarattığımız objenin bir değişkenin değiştirmek istersek ne olur ? 

#### Access Modifiers (Erişim belirleyiciler)
Önceki bölümde gördüğümüz gibi paketler birtakım kodları ve bilgileri saklamakta bize yardımcı oluyor fakat tek başına yeterli değil.
Kod erişimini farklı seviyelerde engelleyen bir de erişim belirleyiciler vardır. Java dilinde 4 adet erişim belirleyici vardır :
public, protected, private ve default. İlk üç erişim belirleyiciyi kullanmazsak otomatikman default erişim belirleyici atanır.

Şuana kadar hep default erişim belirleyiciyi ve public ifadesini kullandık. Şimdi bunların detaylarına bakalım :

![access modifiers](images/access_modifiers.jpg)

Bu tablodaki kurallar sadece class members için geçerlidir.

Default erişim belirleyiciye sahip değişken ve metodlar sadece aynı paket içinde bulunan diğer sınıf ve metodları tarafından erişilebilir.
Bu nendenle bu erişim belirleyciye package access modifier da denir.

Public erişim belirleyici en geniş erişim hakkı sununa ifadedir. Aynı pakette olsun olmasın tüm sınıf ve metodlar tarafından erişilebilir.

Private erişim belirleyici sadece sınıf içi erişim hakkı verir, paket ve subclass ilişkilerine bakmaksızın.

Protected ifadesi ise kendisi ile aynı pakette bulunan diğer kodlara ve diğer paketlerde bulunan sadece subclass larına erişim hakkı verir.

Söz konusu class olduğunda ise kullanabileceğimiz sadece 2 tane erişim belirleyici var; default ve public.
Bir class public olarak tanımlanırsa bu durumda tüm uygulama tarafından erişilebilir aynı sınıf bileşenlerinde olduğu gibi.
Default olarak tanımlanır ise bu durumda sadece tanımlandığı paketteki sınıflar tarafından erişilebilir.

 
