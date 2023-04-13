# (12) Fundamental Performance Test & Performance Testing with JMeter (Eksplorasi)

## Materi 1 : Fundamental Performance Test

### Poin Kesatu
Performance testing adalah jenis pengujian perangkat lunak yang dilakukan untuk mengevaluasi kinerja, kecepatan,
stabilitas, dan skalabilitas sebuah sistem atau aplikasi dalam kondisi beban kerja tertentu. Tujuan dari performance
testing adalah untuk mengidentifikasi batasan sistem dalam menangani volume data tertentu dan menemukan masalah kinerja
seperti lambatnya respon waktu, penggunaan memori yang tinggi, atau terjadinya bottleneck pada sistem. Dengan melakukan
performance testing, tim pengembang dapat mengetahui bagaimana aplikasi berperilaku dalam situasi beban kerja tinggi dan
menemukan cara untuk meningkatkan kinerja dan skalabilitas sistem

### Poin Kedua
Jenis jenis dari performance testing : 
> Load Testing: menguji kinerja aplikasi pada beban yang tinggi atau maksimal untuk melihat apakah aplikasi masih dapat
                berjalan dengan baik
> Stress Testing: menguji batas atas kapasitas sistem untuk melihat apakah sistem masih dapat berjalan secara stabi
                  ketika dihadapkan dengan kondisi yang ekstrem.
> Spike Testing: menguji sistem dengan lonjakan lalu lintas yang tiba-tiba untuk melihat bagaimana sistem menangani
                 beban yang tiba-tiba
> Endurance Testing: menguji kinerja aplikasi dalam jangka waktu yang lama, biasanya dalam beberapa jam atau bahkan
                     beberapa hari
> Volume Testing: menguji kinerja aplikasi pada volume data yang besar untuk melihat apakah aplikasi masih dapat bekerja
                  dengan baik pada kapasitas maksimum
> Scalability Testing: menguji kemampuan sistem untuk berkembang dengan menambahkan sumber daya seperti CPU, memori,
                       atau penyimpanan
> Baseline Testing: menguji kinerja sistem dalam kondisi normal untuk membandingkannya dengan kinerja di masa mendatang
                    setelah melakukan perubahan atau peningkatan pada sistem.

### Poin Ketiga
Hal hal yang diukur dalam performance testing antara lain:
1. Response time: Waktu yang dibutuhkan untuk memberikan respons terhadap permintaan pengguna.
2. Throughput: Jumlah permintaan yang dapat ditangani oleh sistem dalam satu waktu.
3. Scalability: Kemampuan sistem untuk meningkatkan kapasitasnya dalam mengatasi beban kerja yang semakin meningkat.
4. Load capacity: Kemampuan sistem untuk menangani jumlah pengguna dan volume data yang besar secara bersamaan.
5. Resource utilization: Penggunaan sumber daya sistem seperti CPU, memori, dan jaringan dalam menjalankan fungsinya.
6. Stability: Kemampuan sistem untuk tetap berjalan secara stabil dalam waktu yang lama tanpa terjadi kegagalan atau kerusakan.
7. Availability: Ketersediaan sistem dalam memberikan layanan kepada pengguna dalam waktu yang diinginkan.
8. Error rate: Tingkat kegagalan atau kesalahan yang terjadi pada sistem saat melakukan beban kerja yang tinggi.

## Materi 2 : Performance Testing with JMeter

### Poin Kesatu
Apache JMeter adalah sebuah perangkat lunak open-source yang digunakan untuk melakukan pengujian beban (load testing),
pengujian performa (performance testing), dan pengujian fungsional (functional testing) pada berbagai aplikasi dan
layanan seperti web, database, dan FTP. JMeter dapat digunakan untuk mensimulasikan beban kerja yang berbeda dan
memonitor respons dari sistem dalam situasi tersebut, sehingga dapat membantu dalam mengidentifikasi masalah kinerja
pada aplikasi dan layanan yang diuji. JMeter juga dilengkapi dengan fitur-fitur seperti pengumpulan data performa,
pengukuran waktu respons, dan analisis hasil pengujian

### Poin Kedua
Komponen Komponen Jmeter Script yaitu :
Thread Group: Menentukan jumlah pengguna (users) dan pengulangan (loop) yang akan dijalankan dalam pengujian.
1. Sampler: Mewakili permintaan (request) yang dikirim ke server, seperti HTTP request atau database query.
2. Logic Controller: Menentukan bagaimana thread group akan berjalan dan berinteraksi dengan sampler, seperti mengatur
                     ulang urutan eksekusi.
3. Listener: Menyimpan dan menampilkan hasil dari pengujian, seperti grafik, tabel, dan laporan.
4. Configuration Elements: Menyediakan konfigurasi untuk thread group dan sampler, seperti pengaturan jeda waktu,
                           header HTTP, dan pengaturan proxy.
5. Timer: Mengatur jeda waktu antara permintaan (request) dari pengguna (user).
6. Assertions: Memvalidasi bahwa respons (response) yang diterima dari server sesuai dengan harapan.
7. Pre-Processor dan Post-Processor: Menjalankan tindakan sebelum atau setelah sampler, seperti mengambil nilai dari
                                     variabel dan memodifikasi data permintaan (request).

### Poin Ketiga
Kelebihan Kelebihan Jmeter dibanding dengan tool yang lain :
1. Open-source: JMeter adalah perangkat lunak open-source, yang berarti dapat digunakan secara gratis tanpa harus
                membayar lisensi.
2. Cross-platform: JMeter dapat dijalankan di berbagai sistem operasi, seperti Windows, Linux, dan Mac OS.
3. Mendukung berbagai protokol: JMeter mendukung berbagai protokol, termasuk HTTP, HTTPS, FTP, JDBC, SOAP, dan lain-lain.
4. Dukungan plugin: JMeter memiliki dukungan plugin, sehingga pengguna dapat memperluas fitur dan fungsionalitas JMeter
                    sesuai dengan kebutuhan mereka.
5. Integrasi dengan CI/CD tools: JMeter dapat diintegrasikan dengan berbagai alat CI/CD, seperti Jenkins dan Bamboo,
                                 untuk memudahkan pengujian performa pada tahap pengembangan aplikasi.