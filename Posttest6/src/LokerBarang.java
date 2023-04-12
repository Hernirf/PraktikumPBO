public class LokerBarang extends Loker {
    private String namabarang;
    private int berat;
    
    public LokerBarang(String tanggal, int harga, int jumlahhari,
            int nomor_loker, String namabarang, int berat, String id_user) {
        super(id_user,tanggal, harga, jumlahhari, nomor_loker);
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
        System.out.println("Nomor Loker : " + nomor_loker);
        System.out.println("Nama Barang : " + namabarang);
        System.out.println("Berat Barang  : " + berat);
        System.out.println("Jumlah Hari : " + jumlahhari);
        System.out.println("Harga       : Rp." + harga);
        System.out.println("Tanggal     : " + tanggal);
    }

    
}
