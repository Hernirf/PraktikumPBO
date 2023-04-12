import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class User extends Aktor implements RoleUser {

    static int nomor_loker_hewan = 0;
    static int nomor_loker_barang = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<LokerBarang> loker_barang = new ArrayList<LokerBarang>();
    static ArrayList<LokerHewan> loker_hewan = new ArrayList<LokerHewan>();
    static LokerBarang barang1 = new LokerBarang();
    static LokerHewan hewan1 = new LokerHewan();
    static final String jeloHewan = "LOKER HEWAN";
    static final String jeloBarang = "LOKER BARANG";

    public User(String id,String nama, String nomorHp, String alamat, String username, String pass) {
        super(id,nama, nomorHp, alamat, username, pass);
    }

    public User(){
        
    }
    

    @Override
    public void add(LokerHewan hewan1) throws IOException {
        nomor_loker_hewan += 1;
        int lokerNomor = nomor_loker_hewan;
        System.out.print("Masukkan tanggal: ");
        String addtanggal = br.readLine();
        System.out.print("Masukkan jumlah hari penitipan: ");
        int addjumlah_hari = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jenis hewan: ");
        String jenis_hewan = br.readLine();
        System.out.print("Masukkan nama hewan: ");
        String addnama_hewan = br.readLine();
        int addharga = 20000*addjumlah_hari;
        String id_user = Main.idLogin;
        LokerHewan hewan = new LokerHewan(addtanggal,addharga,addjumlah_hari,lokerNomor,jenis_hewan,addnama_hewan, id_user);
        loker_hewan.add(hewan);
        hewan.tambah();
        
    }

    @Override
    public void add(LokerBarang barang1)  throws IOException {
        nomor_loker_barang += 1;
        int lokerNomor1 = nomor_loker_barang;
        System.out.print("Masukkan tanggal: ");
        String tanggal = br.readLine();
        System.out.print("Masukkan jumlah hari penitipan: ");
        int jumlah_hari = Integer.parseInt(br.readLine());
        System.out.print("Masukkan nama barang: ");
        String nama_barang = br.readLine();
        System.out.print("Masukkan berat barang (KG): ");
        int berat = Integer.parseInt(br.readLine()) ;
        int harga = berat*2000*jumlah_hari;
        String id_user = Main.idLogin;
        LokerBarang barang = new LokerBarang(tanggal,harga,jumlah_hari,lokerNomor1,nama_barang,berat, id_user);
        loker_barang.add(barang);
        barang.tambah();
        
    }

    @Override
    public void delete(LokerHewan hewan1) throws IOException{
        read(hewan1);
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin dihapus: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_hewan.size(); i++){
            if (idx == loker_hewan.get(i).getNomor_loker() && loker_hewan.get(i).getId_user().equals(Main.idLogin)){
                System.out.println("ID User     : " + loker_hewan.get(i).getId_user());
                System.out.println("Nomor Loker : " + loker_hewan.get(i).getNomor_loker());
                System.out.println("Jenis Hewan : " + loker_hewan.get(i).getJenis_hewan());
                System.out.println("Nama Hewan  : " + loker_hewan.get(i).getNama_hewan());
                System.out.println("Jumlah Hari : " + loker_hewan.get(i).getJumlahhari());
                System.out.println("Harga       : " + loker_hewan.get(i).getHarga());
                System.out.println("Tanggal     : " + loker_hewan.get(i).getTanggal());
                System.out.print("Apakah tetap ingin menghapus data loker? (0/1) ");
                int pil = Integer.parseInt(br.readLine());
                if (pil == 1){
                    loker_hewan.remove(i);
                    kondisi = 1;
                    System.out.println("Data loker berhasil dihapus");

                }
                else{
                    kondisi = 0;
                    break;
                }

            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal dihapus");

        }
        
    }

    @Override
    public void delete(LokerBarang barang1) throws IOException{
        read(barang1);
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin dihapus: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_barang.size(); i++){
            if (idx == loker_barang.get(i).getNomor_loker() && loker_barang.get(i).getId_user().equals(Main.idLogin)){
                System.out.println("ID User     : " + loker_barang.get(i).getId_user());
                System.out.println("Nomor Loker : " + loker_barang.get(i).getNomor_loker());
                System.out.println("Nama Barang : " + loker_barang.get(i).getNamabarang());
                System.out.println("Berat Barang: " + loker_barang.get(i).getBerat());
                System.out.println("Jumlah Hari : " + loker_barang.get(i).getJumlahhari());
                System.out.println("Harga       : " + loker_barang.get(i).getHarga());
                System.out.println("Tanggal     : " + loker_barang.get(i).getTanggal());
                System.out.print("Apakah tetap ingin menghapus data loker? (0/1) ");
                int pil = Integer.parseInt(br.readLine());
                if (pil == 1){
                    loker_barang.remove(i);
                    kondisi = 1;
                    System.out.println("Data loker berhasil dihapus");

                }
                else{
                    kondisi = 0;
                    break;
                }

            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal dihapus");

        }
        
    }

    @Override
    public void loker(LokerHewan hewan1) throws IOException{
        while(true){
            System.out.println(" ");
            System.out.println("             "+jeloHewan);
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Loker");
            System.out.println("2. Tampilkan Data Loker");
            System.out.println("3. Update Data Loker");
            System.out.println("4. Hapus Data Loker");
            System.out.println("5. Kembali");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    add(hewan1);
                    break;
                case 2:
                    read(hewan1);
                    break;
                case 3:
                    update(hewan1);
                    break;
                case 4:
                    delete(hewan1);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
        
    }

    @Override
    public void loker(LokerBarang barang1) throws IOException{
        while(true){
            System.out.println(" ");
            System.out.println("             "+jeloBarang);
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Loker");
            System.out.println("2. Tampilkan Data Loker");
            System.out.println("3. Update Data Loker");
            System.out.println("4. Hapus Data Loker");
            System.out.println("5. Kembali");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    add(barang1);
                    break;
                case 2:
                    read(barang1);
                    break;
                case 3:
                    update(barang1);
                    break;
                case 4:
                    delete(barang1);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;

            }
        }
        
    }

    @Override
    public  void menu() throws IOException{
        while(true){
            System.out.println(" ");
            System.out.println("        SELAMAT DATANG");
            System.out.println("    PROGRAM LOKER SERBAGUNA");
            System.out.println("=====================================");
            System.out.println("1. Loker Hewan");
            System.out.println("2. Loker Barang");
            System.out.println("3. Logout");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    loker(hewan1);
                    break;
                case 2:
                    loker(barang1);
                    break;
                case 3:
                    Main.menu_utama();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
        
    }

    @Override
    public void read(LokerHewan hewan1) {
        if (loker_hewan.size()==0){
            System.out.println("Data loker hewan kosong");
        }
        else{
            for (int i=0; i <  loker_hewan.size(); i++){
                if (Main.idLogin.equals(loker_hewan.get(i).getId_user())){
                    System.out.println("ID User     : " + loker_hewan.get(i).getId_user());
                    System.out.println("Nomor Loker : " + loker_hewan.get(i).getNomor_loker());
                    System.out.println("Jenis Hewan : " + loker_hewan.get(i).getJenis_hewan());
                    System.out.println("Nama Hewan  : " + loker_hewan.get(i).getNama_hewan());
                    System.out.println("Jumlah Hari : " + loker_hewan.get(i).getJumlahhari());
                    System.out.println("Harga       : Rp." + loker_hewan.get(i).getHarga());
                    System.out.println("Tanggal     : " + loker_hewan.get(i).getTanggal());
                    System.out.println("\n");
                }
                
            }
        }
        
    }

    @Override
    public void read(LokerBarang barang1) {
        if (loker_barang.size()==0){
            System.out.println("Data loker barang kosong");
        }
        else{
            for (int i=0; i <  loker_barang.size(); i++){
                if (loker_barang.get(i).getId_user().equals(Main.idLogin)){
                    System.out.println("ID User     : " + loker_barang.get(i).getId_user());
                    System.out.println("Nomor Loker : " + loker_barang.get(i).getNomor_loker());
                    System.out.println("Nama Barang : " + loker_barang.get(i).getNamabarang());
                    System.out.println("Berat Barang: " + loker_barang.get(i).getBerat() + " KG");
                    System.out.println("Jumlah Hari : " + loker_barang.get(i).getJumlahhari());
                    System.out.println("Harga       : Rp." + loker_barang.get(i).getHarga());
                    System.out.println("Tanggal     : " + loker_barang.get(i).getTanggal());
                    System.out.println("\n");
                }
                
            }
        }
    }

    @Override
    public void update(LokerHewan hewan1) throws IOException{
        read(hewan1);
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin diubah: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_hewan.size(); i++){
            if (idx == loker_hewan.get(i).getNomor_loker() && loker_hewan.get(i).getId_user().equals(Main.idLogin)){
                System.out.print("Masukkan tanggal: ");
                String tanggal = br.readLine();
                System.out.print("Masukkan jumlah hari penitipan: ");
                int jumlah_hari = Integer.parseInt(br.readLine());
                System.out.print("Masukkan jenis hewan: ");
                String jenis_hewan = br.readLine();
                System.out.print("Masukkan nama hewan: ");
                String nama_hewan = br.readLine();
                int harga = 20000*jumlah_hari;
                LokerHewan hewan = new LokerHewan(tanggal,harga,jumlah_hari,idx,jenis_hewan,nama_hewan, Main.idLogin);
                loker_hewan.set(i, hewan);
                kondisi = 1;
                hewan.edit();
                break;
            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal diubah");
        }
        
    }

    @Override
    public void update(LokerBarang barang1) throws IOException{
        read(barang1);
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin diubah: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_barang.size(); i++){
            if (idx == loker_barang.get(i).getNomor_loker() &&  loker_barang.get(i).getId_user().equals(Main.idLogin)){
                System.out.print("Masukkan tanggal: ");
                String tanggal = br.readLine();
                System.out.print("Masukkan jumlah hari penitipan: ");
                int jumlah_hari = Integer.parseInt(br.readLine());
                System.out.print("Masukkan nama barang: ");
                String nama_barang = br.readLine();
                System.out.print("Masukkan berat barang (KG): ");
                int berat = Integer.parseInt(br.readLine()) ;
                int harga = berat*2000*jumlah_hari;
                LokerBarang barang = new LokerBarang(tanggal,harga,jumlah_hari,idx,nama_barang,berat, Main.idLogin);
                loker_barang.set(i, barang);
                kondisi = 1;
                barang.edit();
                break;
            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal diubah");
        }
        
    }
}
