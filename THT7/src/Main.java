import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LayananEkspedisi> daftarEkspedisi = new ArrayList<>(); // Deklarasi wadah koleksi polimorfis berbasis prinsip upcasting

        daftarEkspedisi.add(new LayananReguler("REG-11", 2.0, 50.0, 50.0, 50.0)); // Inisiasi data objek logistik kategori reguler
        daftarEkspedisi.add(new LayananExpress("EXP-22", 5.0, 10.0, 10.0, 10.0)); // Inisiasi data objek logistik kategori premium
        daftarEkspedisi.add(new LayananInternasional("INT-33", 3.0, 20.0, 20.0, 20.0, "Korea", 100.0)); // Data lintas negara

        double totalPendapatanPerusahaan = 0.0; // Inisialisasi instrumen akumulasi agregat finansial internal perusahaan

        for (LayananEkspedisi ekspedisi : daftarEkspedisi) { // Mekanisme iterasi otomatis untuk mengekstrak seluruh koleksi data paket
            ekspedisi.cetakResi();
            totalPendapatanPerusahaan += ekspedisi.hitungOngkir(); // Pencatatan pendapatan kotor operasional awal tanpa instrumen modifikasi

            if (ekspedisi instanceof LayananReguler) { // Proses identifikasi tipe objek menggunakan operator refleksi tipe data
                LayananReguler reguler = (LayananReguler) ekspedisi; // Transformasi tipe data ke struktur asal (downcasting) untuk hak akses penuh
                double hargaPromo = reguler.hitungOngkir(true, 25);
                System.out.println("Harga Layanan Reguler (Member & Jarak): Rp" + hargaPromo);
            } else if (ekspedisi instanceof LayananExpress) {
                LayananExpress express = (LayananExpress) ekspedisi; // Prosedur downcasting untuk mengesekusi fungsionalitas asuransi paket
                express.klaimAsuransi(1500000.0);
            } else if (ekspedisi instanceof LayananInternasional) {
                LayananInternasional internasional = (LayananInternasional) ekspedisi; // Akses ke fungsi pembuatan manifest kepabeanan barang
                internasional.cetakManifest();
            }
            System.out.println(); // Pemisah visual baris data antarpaket demi keterbacaan laporan output logis
        }

        System.out.println("Total Pendapatan Keseluruhan Perusahaan: Rp" + totalPendapatanPerusahaan); // Pelaporan akhir kinerja keuangan
    }
}
