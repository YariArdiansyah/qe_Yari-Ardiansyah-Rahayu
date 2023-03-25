# (8) RESTful API Introduction & Testing

## Materi 1 : RESTful API Introduction

### Poin Pertama
API adalah singkatan dari Application Programming Interface, API merupakan suatu penghubung yang memungkinkan suatu
aplikasi untuk berinteraksi dengan aplikasi lainnya dan berbagi data. REST (REpresentational State Transfer) merupakan
standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web

### Poin Kedua
Tujuan penggunaan API adalah untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga
developertidak perlu membuat fitur yang serupa
Umumnya menggunakan HTTP (Hypertext Transfer Protocol) sebagai protocol untuk komunikasi data.

### Poin Ketiga
API berperan sebagai pembawa pesan yang menerima permintaan pengguna dan memberitahu sistem apa yang harus dilakukan,
kemudian memberikan respons yang sesuai untuk permintaan tersebut.

## Materi 2 : API Testing

### Poin Pertama
Setiap melakukan testing API atau melakukan http method terdapat response :
200 OK: - Code indicates that the request was successful.
201 Created:- Code indicates that request was successful and a resource was created. It is used to confirm success of a
PUT or POST request
400 Bad Request :- It happens especially with POST and PUT requests, when the data does not pass validation, or is in
the wrong format.
404 Not Found:- response indicates that the required resource could not be found.
401 Unauthorized:- error indicates that you need to perform authentication before accessing the resource.
405 Method Not Allowed:- HTTP method used is not supported for this resource.
500 Internal Server Error:- Occurs due to some error on Server side.

### Poin Kedua
APA itu API Testing 
> API test sangat berbeda dengan GUI
> Mengirim request dan mendapatkan respon dari server
> Memverifikasi response yang benar dan error handling

### Poin Ketiga
Jenis jenis dari API testing :
> functionality → test seperti biasanya apakah suatu fitur sudah berfungsi atau belum
> Load test → Mengtest kekuatan sistem. mampu mengolah berapa banyak user
> security → mengetest keamanan sistem 