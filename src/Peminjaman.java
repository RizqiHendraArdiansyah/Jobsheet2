//Tugas no.2
public class Peminjaman{
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamasewa;
    public int hargaBayar;

    public void totalHarga(){
        hargaBayar = lamasewa * harga;
    }
    public void cetakData(){
        System.out.println("id Pelanggan        :  " + id);
        System.out.println("Nama Pelanggan      :  " + namaMember);
        System.out.println("Nama Game           :  " + namaGame);
        System.out.println("Harga Sewa          :  " + harga); 
        System.out.println("Lama Sewa           :  " + lamasewa);
        System.out.println("Total Bayar         :  " + hargaBayar);

    }
}
