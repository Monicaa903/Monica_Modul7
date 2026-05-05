import java.util.ArrayList;

public class Main { 
    public static void main(String[] args) {
 
        ArrayList<PerangkatPintar> daftarPerangkat = new ArrayList<>();
   
        daftarPerangkat.add(new LampuPintar());
        daftarPerangkat.add(new AcPintar());

        System.out.println("~~~ Status Perangkat ~~~");

        for (PerangkatPintar p : daftarPerangkat) {
     
            p.aktifkan(); 

            if (p instanceof AcPintar) {
                AcPintar ac = (AcPintar) p; 
                ac.aturSuhu(20);           
            }
        }
    }
}
/* 
   SOAL 5:
   Error "cannot find symbol" terjadi karena Java Compiler 
   mengecek metode berdasarkan tipe referensi (PerangkatPintar), 
   bukan objek aktualnya (LampuPintar). Di kelas PerangkatPintar tidak ada metode aturKecerahan.

   Perbaikan kode:
   PerangkatPintar alat1 = new LampuPintar();
   ((LampuPintar) alat1).aturKecerahan(75, "Putih"); // Melakukan Downcasting
*/
