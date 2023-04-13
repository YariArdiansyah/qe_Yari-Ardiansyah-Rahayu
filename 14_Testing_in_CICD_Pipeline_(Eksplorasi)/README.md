# (14) Testing in CI/CD Pipeline (Eksplorasi)

### Poin Kesatu
CI/CD adalah singkatan dari Continuous Integration/Continuous Deployment (atau Continuous Delivery). CI/CD merupakan 
praktik pengembangan perangkat lunak yang memungkinkan tim pengembang untuk mengintegrasikan kode mereka ke dalam 
repositori bersama dan mengotomatiskan proses pengujian, build, dan deployment perangkat lunak ke dalam lingkungan 
produksi secara terus-menerus dan cepat. Dengan CI/CD, tim pengembang dapat menyelesaikan pengujian dan merilis 
perangkat lunak dalam waktu singkat, sehingga memungkinkan mereka untuk merespons permintaan dan perubahan pasar dengan 
lebih cepat

Perbedaan utama antara CI dan CD adalah bahwa CI fokus pada otomatisasi dan pengujian perubahan kode, sedangkan CD lebih 
fokus pada otomatisasi penerapan dan pengiriman perangkat lunak ke lingkungan produksi atau staging. Meskipun kedua 
konsep ini saling terkait, namun CI dan CD memiliki tujuan yang berbeda dalam proses pengembangan perangkat lunak

### Poin Kedua
CI (Continous Integration) adalah proses otomatisasi di mana setiap kali seorang pengembang melakukan perubahan kode ke 
dalam repositori kode, perubahan itu diuji secara otomatis. Dalam CI, pengembang secara teratur mengirimkan perubahan ke 
repositori utama, dan setiap kali perubahan dikirimkan, tes otomatis dijalankan untuk memastikan bahwa perubahan 
tersebut tidak merusak kode yang sudah ada. Hasil tes ini kemudian memberikan umpan balik secepat mungkin ke pengembang, 
sehingga masalah dapat diidentifikasi dan diperbaiki dengan cepat

CD (Continous Delivery/Continous Deployment) adalah proses di mana perangkat lunak yang telah melalui CI diambil dan 
dideploy secara otomatis ke server produksi (Continous Deployment) atau server staging (Continous Delivery). Dalam CD, 
semua tes dilakukan secara otomatis, sehingga setiap kali kode berubah, perangkat lunak dapat dikirimkan ke produksi 
atau staging dengan sedikit atau tanpa intervensi manusia

### Poin Ketiga
GitHub Actions adalah platform CI/CD yang disediakan oleh GitHub. Beberapa komponen penting dalam GitHub Actions antara 
lain:
1. Workflows: Mendefinisikan serangkaian tugas yang harus dilakukan sebagai bagian dari CI/CD pipeline. Workflow menggunakan sintaks YAML dan dapat berisi satu atau beberapa tugas. Workflow diaktifkan oleh suatu trigger, seperti push ke repository atau pembukaan pull request.
2. Jobs: Jobs adalah kumpulan tugas yang dijalankan di runner pada lingkungan yang sama. Setiap tugas dalam job dieksekusi pada runner yang sama, dan setiap job dieksekusi pada runner yang berbeda. Jobs dapat memiliki dependensi dan harus diselesaikan dalam urutan yang tepat.
3. Steps: Steps adalah tindakan atau tugas individu yang dilakukan sebagai bagian dari job. Langkah-langkah ini bisa menjalankan skrip, membangun aplikasi, atau mengeksekusi perintah sistem lainnya.
4. Actions: Actions adalah paket perangkat lunak yang dapat digunakan kembali untuk melakukan tugas-tugas spesifik pada workflows. Actions dapat digunakan dalam beberapa repository dan workflows. Ada ribuan actions yang tersedia di GitHub Marketplace.
5. Runners: Runners adalah agen yang menjalankan tugas pada jobs dalam workflows. Runner dapat di-host sendiri atau digunakan dari layanan yang disediakan oleh GitHub.
6. Events: Events adalah tindakan atau kondisi yang menyebabkan sebuah workflow dijalankan. Beberapa contoh event adalah push ke repository, pembukaan atau penutupan pull request, atau tag baru.
7. Environment: Environment adalah konfigurasi yang berbeda yang dapat digunakan oleh jobs dalam workflows. Environment dapat diatur untuk pengujian, produksi, atau lingkungan lainnya. Setiap environment harus memiliki runner yang berbeda untuk menjalankan job pada lingkungan yang sesuai.