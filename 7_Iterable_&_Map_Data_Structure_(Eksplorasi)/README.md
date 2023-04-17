# (7) Iterable & Map Data Structure (Eksplorasi)

## Materi 1 : Iterable

### Poin Pertama
Iterable adalah sebuah interface dalam Java yang merepresentasikan sebuah objek yang dapat dilooping atau di-iterasi. Objek yang diiterasi dapat berupa collection, array, atau struktur data lainnya yang dapat diakses secara berurutan. Interface Iterable memiliki satu method bernama iterator() yang mengembalikan Iterator, sebuah objek yang dapat digunakan untuk mengakses elemen-elemen pada struktur data yang diiterasi secara berurutan. Dengan menggunakan Iterable, kita dapat melakukan loop atau iterasi pada struktur data yang tidak mengetahui ukuran atau panjangnya terlebih dahulu.

### Poin Kedua
Dalam Java, objek yang biasa digunakan sebagai objek iterable adalah kelas ArrayList, LinkedList, HashSet, TreeSet,
HashMap, TreeMap, dan sejenisnya
Objek iterable dalam Java dapat diproses secara berulang menggunakan loop, seperti for loop, dan dapat digunakan dengan
built-in function seperti forEach()

### Poin Ketiga
Interface java.lang.Iterable memiliki satu method yang harus diimplementasikan oleh kelas yang menggunakannya, yaitu
method iterator(), Method ini mengembalikan suatu objek iterator, yang digunakan untuk mengakses elemen-elemen dalam
objek iterable secara berulang


## Materi 2 : Map Data Structure

### Poin Pertama
Map adalah salah satu struktur data yang tersedia dalam bahasa pemrograman Java. Map merupakan kumpulan pasangan
key-value, dimana setiap key memiliki value yang terkait, Map juga dikenal dengan nama associative array atau dictionary
di beberapa bahasa pemrograman lainnya

### Poin Kedua
Dalam Map, key harus unik dan value dapat diakses menggunakan key yang terkait. Map tersedia dalam beberapa implementasi
di Java, seperti HashMap, TreeMap, dan LinkedHashMap
HashMap: HashMap adalah implementasi dasar dari antarmuka Map. Ini menyimpan pasangan kunci-nilai dalam tabel hash. Ketika elemen-elemen tersebut dimasukkan ke dalam HashMap, elemen-elemen tersebut dihash ke dalam indeks menggunakan fungsi hash, dan kemudian diakses menggunakan indeks ini. Karena elemen-elemen tersebut diakses melalui indeks hash, waktu yang dibutuhkan untuk operasi get dan put konstan O(1), kecuali saat terjadi tabrakan hash
TreeMap: TreeMap adalah implementasi yang berbeda dari antarmuka Map. Ini menyimpan pasangan kunci-nilai dalam struktur pohon merah-hitam yang diurutkan berdasarkan kunci. Ini berarti bahwa ketika elemen-elemen dimasukkan ke dalam TreeMap, mereka secara otomatis diurutkan berdasarkan kunci. Oleh karena itu, saat menggunakan TreeMap, kunci diurutkan secara alami
LinkedHashMap: LinkedHashMap adalah implementasi dari antarmuka Map yang mempertahankan urutan elemen dengan cara menggunakan daftar terhubung ganda. Seperti halnya HashMap, elemen-elemen tersebut diakses melalui indeks hash, namun ditambahkan ke daftar terhubung ganda, yang mempertahankan urutan elemen.

### Poin Ketiga
Framework adalah sebuah kerangka kerja yang terdiri dari kumpulan perangkat lunak atau kode program yang digunakan sebagai dasar dalam mengembangkan aplikasi atau sistem. Framework menyediakan struktur dan aturan yang konsisten yang memudahkan para pengembang dalam membuat aplikasi dengan cepat dan efisien. Dalam pengembangan aplikasi, framework biasanya menyediakan berbagai macam fitur dan fungsionalitas, seperti manajemen database, routing, pengelolaan pengguna, keamanan, dan lain sebagainya. Dengan menggunakan framework, pengembang dapat menghemat waktu dan upaya dalam pengembangan aplikasi, serta memperoleh aplikasi yang lebih andal dan mudah di-maintain
