# (10) RESTful API Testing with REST Assured

## Poin Pertama
RESTful API (Representational State Transfer) adalah suatu arsitektur untuk membangun aplikasi web yang menggunakan
protokol HTTP untuk pertukaran data. RESTful API memungkinkan suatu sistem untuk berkomunikasi dengan sistem lainnya
melalui protokol HTTP dengan format data yang umum seperti XML dan JSON. RESTful API dirancang untuk mendukung metode
komunikasi yang sederhana dan ringkas antara klien dan server, sehingga memudahkan pengembangan aplikasi dan
pengintegrasian dengan sistem lainnya. Dalam RESTful API, setiap komponen dari sistem diidentifikasi melalui URI
(Uniform Resource Identifier) dan memiliki representasi data yang dapat diakses dengan metode HTTP seperti GET, POST,
PUT, dan DELETE.

## Poin Kedua
Rest Assured adalah sebuah library Java yang digunakan untuk melakukan pengujian (testing) pada RESTful API. Rest
Assured menyediakan berbagai macam fitur dan metode yang memudahkan pengguna untuk melakukan testing pada API, seperti
verifikasi status code, validasi response body, dan validasi header. Rest Assured juga dapat digunakan untuk menguji
API yang membutuhkan autentikasi dengan menyediakan metode untuk mengirim token dan cookie pada request. Rest Assured
sering digunakan dalam proses Continuous Integration (CI) dan Continuous Delivery (CD) untuk memastikan bahwa API yang
diuji berfungsi dengan baik sebelum dideploy ke lingkungan produksi.

## Poin Ketiga
Berikut fundamental dari API antara lain:

    Request-Response Model: API bekerja dengan menggunakan model permintaan-respon. Client membuat permintaan ke server 
    dengan menggunakan protokol yang telah ditentukan dan server akan memberikan respon kembali ke client.
    
    Data Formats: API menggunakan format data yang telah ditentukan, seperti JSON atau XML, untuk mengirim dan menerima
    data antara client dan server.
    
    Endpoints: API memiliki titik akhir atau endpoint yang digunakan untuk mengakses data atau layanan tertentu.
    Endpoint dapat dikonfigurasi untuk menerima permintaan dengan berbagai metode HTTP seperti GET, POST, PUT, DELETE, dll.
    
    Authentication: API biasanya memerlukan autentikasi untuk mengakses data atau layanan tertentu. Autentikasi dapat
    dilakukan dengan menggunakan token atau kunci API.
    
    Versioning: API harus dapat dikelola secara efektif dalam jangka panjang. Versi API dapat digunakan untuk memastikan
    bahwa perubahan dalam API tidak merusak aplikasi yang telah menggunakannya.
