public class LokerBarang extends User {
    private String namabarang;
    private int berat;
    
    public LokerBarang(String nama, String nomorHp, String alamat, String tanggal, int harga, int jumlahhari,
            int nomor_loker, String namabarang, int berat) {
        super(nama, nomorHp, alamat, tanggal, harga, jumlahhari, nomor_loker);
        this.namabarang = namabarang;
        this.berat = berat;
    }


    public LokerBarang(){

    }

    public String getNamabarang() {
        return namabarang;
    }
    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }
    public int getBerat() {
        return berat;
    }
    public void setBerat(int berat) {
        this.berat = berat;
    }
    
    @Override
    public void tambah(){
        System.out.println("\nDATA KONSUMEN LOKER BARANG");
        System.out.println("Nama        : "+ nama);
        System.out.println("Nomor HP    : " + nomorHp);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Nomor Loker : " + nomor_loker);
        System.out.println("Nama Barang : " + namabarang);
        System.out.println("Berat Barang  : " + berat);
        System.out.println("Jumlah Hari : " + jumlahhari);
        System.out.println("Harga       : Rp." + harga);
        System.out.println("Tanggal     : " + tanggal);
        System.out.println("BERHASIL DITAMBAHKAN");
    }

    
    @Override
    public void edit(){
        System.out.println("\nDATA KONSUMEN LOKER BARANG BARU");
        System.out.println("Nama        : "+ nama);
        System.out.println("Nomor HP    : " + nomorHp);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Nomor Loker : " + nomor_loker);
        System.out.println("Nama Barang : " + namabarang);
        System.out.println("Berat Barang  : " + berat);
        System.out.println("Jumlah Hari : " + jumlahhari);
        System.out.println("Harga       : Rp." + harga);
        System.out.println("Tanggal     : " + tanggal);
    }

    
}
