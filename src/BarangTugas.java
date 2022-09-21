//Tugas no.4
public class BarangTugas {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    BarangTugas(String kode, String namaBarang, int hargaDasar, float diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual(){
        int hargaJual = hargaDasar - (int)(diskon * hargaDasar);
        return hargaJual;
    } 

    public void tampilData(){
        System.out.println("Kode Barang         : "+ kode);
        System.out.println("Nama Barang         : "+ namaBarang);
        System.out.println("Harga Dasar         : "+ hargaDasar);
        System.out.println("Diskon Barang       : "+ diskon);
        System.out.println("Total Harga Barang  : "+ hitungHargaJual());
    }
    
}
