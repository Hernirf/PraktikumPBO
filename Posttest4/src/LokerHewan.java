public class LokerHewan extends User{
    private String jenis_hewan;
    private String nama_hewan;
    
    
    public LokerHewan() {
        
    }

    public LokerHewan(String nama, String nomorHp, String alamat, String tanggal, int harga, int jumlahhari,
            int nomor_loker, String jenis_hewan, String nama_hewan) {
        super(nama, nomorHp, alamat, tanggal, harga, jumlahhari, nomor_loker);
        this.jenis_hewan = jenis_hewan;
        this.nama_hewan = nama_hewan;
    }

    



   





    public String getJenis_hewan() {
        return jenis_hewan;
    }



    public void setJenis_hewan(String jenis_hewan) {
        this.jenis_hewan = jenis_hewan;
    }



    public String getNama_hewan() {
        return nama_hewan;
    }



    public void setNama_hewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
    }
    
    @Override
    public void tambah(){
        System.out.println("\nDATA KONSUMEN LOKER HEWAN");
        System.out.println("Nama        : "+ nama);
        System.out.println("Nomor HP    : " + nomorHp);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Nomor Loker : " + nomor_loker);
        System.out.println("Jenis Hewan : " + jenis_hewan);
        System.out.println("Nama Hewan  : " + nama_hewan);
        System.out.println("Jumlah Hari : " + jumlahhari);
        System.out.println("Harga       : Rp." + harga);
        System.out.println("Tanggal     : " + tanggal);
        System.out.println("BERHASIL DITAMBAHKAN");
    }

    
    @Override
    public void edit(){
        System.out.println("\nDATA KONSUMEN LOKER HEWAN BARU");
        System.out.println("Nama        : "+ nama);
        System.out.println("Nomor HP    : " + nomorHp);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Nomor Loker : " + nomor_loker);
        System.out.println("Jenis Hewan : " + jenis_hewan);
        System.out.println("Nama Hewan  : " + nama_hewan);
        System.out.println("Jumlah Hari : " + jumlahhari);
        System.out.println("Harga       : Rp." + harga);
        System.out.println("Tanggal     : " + tanggal);
    }

    
    

}
