import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MetodePembayaran> daftarPembayaran = new ArrayList<>();

        daftarPembayaran.add(new EWallet());
        daftarPembayaran.add(new KartuKredit());

        for (MetodePembayaran m : daftarPembayaran) {
            
            m.bayar(100000);

            if (m instanceof EWallet) {
                EWallet dompet = (EWallet) m;
                dompet.bayar(100000, "081234567890");
            } 
     
            else if (m instanceof KartuKredit) {
                KartuKredit kartu = (KartuKredit) m;
                kartu.verifikasiPIN();
            }
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
