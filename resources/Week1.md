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

## Degiskenlere daha yakindan bakis
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
