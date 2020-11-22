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

