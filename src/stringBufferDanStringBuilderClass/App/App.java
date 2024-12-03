package stringBufferDanStringBuilderClass.App;

// String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang dilakukan di Java adalah membuat String baru.
// Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String,  karena akan memakan memory yang cukup besar,
// untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder..




public class App {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("arif");
        builder.append("rizal");
        builder.append("buka");

        StringBuffer buffer = new StringBuffer();
        buffer.append("dia");
        buffer.append("hanya");
        buffer.append("bercanda");


    }
}
