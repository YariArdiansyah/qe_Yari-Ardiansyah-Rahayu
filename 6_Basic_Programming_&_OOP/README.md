# (6) Introduction Basic Programming & OOP

## Materi 1 : Introduction Basic Programming

### Poin Pertama
Berikut jenis jenis tipe data dalam bahasa pemograman java :
>Integer (int) | contoh : 100,10,087
>Float | contoh : 0.2, 0.05
>Double | contoh : 0.03235, 0.00231
>Boolean | contoh : True or False
>Char | contoh :'A','z'
>String | contoh : "Alterra","ID"

### Poin Kedua
Skema Input Output Java
Input - (Keyboard, File, Network, Program) - Java Program ("Character"Streams [Reader & Writer])
Output - (Console, File, Network, Program) - Java Program ("Byte" Streams [Input Streams & Output Streams])

### Poin Ketiga
JDK (Java Development Kit) adalah sebuah paket perangkat lunak yang disediakan oleh Oracle Corporation untuk
pengembangan aplikasi Java, dalam JDK, Java Runtime Environment (JRE) adalah komponen yang paling penting karena
merupakan lingkungan di mana program Java dapat dijalankan

## Materi 2 : OOP

### Poin Pertama
Apa itu class?
Class adalah blueprint, prototype atau cetakan untuk membuat Object, Class berisikan deklarasi semua properties dan
functions yang dimiliki oleh Object. Setiap Object dibuat dari Class dan sebuah Class bisa membuat Object sebanyak-banyaknya
### Poin Kedua
Object adalah data yang berisi field / properties / attributes dan method / function / behavior.
Declaration : mendeklarasikan nama sebuah objek
Instantiation : memerlukan sebuah perintah new untuk menciptakan objek
Initialization : inisialisasi dari sebuah objek setelah perintah new
### Poin Ketiga
Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain dalam artian, kita bisa membuat
class Parent dan class Child. Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak
class Child saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan
dimiliki oleh class Child untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu
diikuti dengan nama class parent nya.