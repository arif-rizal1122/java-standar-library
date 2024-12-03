# RUNTIME CLASS

1. Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan
2. Informasi itu terdapat di class Runtime.
3. Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses  object  
4. tersebut menggunakan static method getRuntime() milik class Runtime



Method                             Keterangan

int availableProcessors()          Mendapatkan jumlah core cpu
long freeMemory()                  Mendapatkan jumlah memory bebas di JVM
long totalMemory()                 Mendapatkan jumlah total memory di JVM
long maxMemory()                   Mendapatkan jumlah maksimum memory di JVM
void gc()                          Menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai

