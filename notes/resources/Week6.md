# Fibabanka Java Bootcamp - 6. Hafta

## Spring Boot

![spring boot](images/Top%2020%20Spring%20Boot%20Interview%20Questions%20with%20Answers.png)


Daha önce Spring Framework ve bu frameworkun hayatımıza kattıklarına bakmıştık. Bu bölümde Spring Framework üzerine inşa edilmiş
olan Spring Boot detaylarına bakacağız. 

Spring framework; Spring JDBC, Spring MVC, Spring Security gibi Java ile uygulama geliştirmeyi kolaylaştıran harika modüllerden
oluşmaktadır. Fakat bu modülleri kullanabilmek için pek çok konfigürasyon yapmak gerekir. Bütün bu konfigürasyonları daha 
kolay hale getirmek için Spring Boot'a auto-configuration özelliği eklenmiştir. Spring Boot bir uygulamanın ihtiyacı olan
pek çok konfigüreasyonu default değerler ile projeye kazandırır fakat gerektiği zaman bu konfigürasyonları override etmemize de
izin verir.

Spring MVC ile bir web uygulaması geliştirdiğimiz zaman uygulamayı çalıştırabilmek için bir application sunucusuna ihtiyaç
duyulur. Tomcat, Jetty gibi uygulama sunucuları geliştirdiğimiz uygulamaları deploy etmek ve çalıştırabilmek için konfigüre
edilmesi gerekir. Spring Boot bu konfigürasyon işlemini ortadan kaldırmak için application sunucusunu, yazdığımız uygulamanın
derleenmesi sonucu ortaya çıkan jar dosyasına embedded olarak konulmaktadır. Yani harici bir application sunucusuna gerek 
yoktur.

Spring Framework ile uygulama geliştirirken ihtiyacımız olan bağımlılıkları Maven yada Gradle aracılığıyla projeye eklenebilir.
Maven/Gradle transitive bağımlılıkların çözümlenmesi ve projenin classpathine eklenmesi konusunda çok iyi iş çıkarsa da 
doğrudan ilişkisi olmayan ama genellikle birlikte kullanılan bağımlılıkları çözümleyemez. Bu noktada Spring Boot 
starter denilen ve birbiri ile ilişkili bağımlılıkları grup halinde projeye ekleme olanağı sunan özelliğiyle karşımıza çıkıyor.  

Bunların yanında Spring Boot bize prod ortamına deploy etmeye hazır bir takım özellikler de sunuyor; metrikler, health checkler
ve external config gibi. Prod ortammında çalışan her uygulamanın ihtiyaç duyduğu bu özellikler Spring Boot ile otomatik olarak
uygulamaya eklenir.

Şimdi bütün bu özellikler nasıl kullanılır daha detaylı bakalım;

### Spring Boot nasıl kullanılır

#### Kod düzeni
Spring Boot uygulamalarında da diğer Spring Framework uygulamalarında olduğu gibi `Layered Architecture` dediğimiz yapıda 
olmalıdır. Spring Boot uygulamalarının çalışması için gereken @SpringBootApplication anotasyonu genelde main() metodun bulunduğu
sınıfa verilir ve bu sınıf root package'ın içinde yer alır. Daha sonra kalan diğer sınıflar entity isimlerine göre aşağıda gösterildiği
gibi package'lara ayrılır.

```
com
 +- example
     +- myapplication
         +- Application.java
         |
         +- customer
         |   +- Customer.java
         |   +- CustomerController.java
         |   +- CustomerService.java
         |   +- CustomerRepository.java
         |
         +- order
             +- Order.java
             +- OrderController.java
             +- OrderService.java
             +- OrderRepository.java
```

#### Auto configuration
Spring Boot pek çok boilerplate konfigürasyonu arka planda otomatik olarak yapar, bunu classpath'deki jarları tarayarak 
yapar. Örneğin classpath'de H2 varsa Spring Boot in memory bir veritabanından datasource objesini ve gerekli diğer 
beanleri otomatik olarak oluşturur ve Spring contextine koyar. Otomatik konfügüre edilen beanlerden birini kendimiz oluşturarak 
override etmek istersek bu durumda o beani bir configuration sınıfı altında oluşturmamız yeterlidir. Bir oto konfigürasyon 
sınıfını tamamen disable edebiliriz bunun için S@pringBootApplication anotasyonun exclude fieldını doldurmak yeterli olur.

```java
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.*;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MyApplication {
}
```

#### Spring Boot ve dependency injection
Yukarıdaki yapıda proje yapısı oluşturulduğu zaman @SpringBootApplication anotasyonu projenin root paketinde yer aldığında 
root paket ve altındaki alt paketlerde yeralan bütün spring beanlerini otomatik olarak tarayabilir. Bunu @SpringBootApplication
anotasyonu içinde yeralan @ComponentScan anotasyonu yardımıyla yapar. Bu durumda @Component, @Service, @Repository, @Controller gibi
anotasyonlar ile işaretlenen beanler otomatik olarak contexte eklenir.
