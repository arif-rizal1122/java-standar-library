
# IMUTABLE STRING

1. String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang dilakukan di Java adalah membuat String baru.
2. Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String,  
3. karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder

# STRING BUFFER VS STRING BUILDER

1. Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
2. Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe
3. Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak butuh paralel, cukup gunakan StringBuilder
4. Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder

