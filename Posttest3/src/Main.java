import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;






public class Main {
    static int nomor_loker_hewan = 0;
    static int nomor_loker_barang = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<LokerBarang> loker_barang = new ArrayList<LokerBarang>();
    static ArrayList<LokerHewan> loker_hewan = new ArrayList<LokerHewan>();

    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void lokerHewan() throws IOException{
        while(true){
            System.out.println(" ");
            System.out.println("     LOKER HEWAN");
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
                    addLoker_hewan();
                    break;
                case 2:
                    readLoker_hewan();
                    break;
                case 3:
                    upLoker_hewan();
                    break;
                case 4:
                    delLoker_hewan();
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

    public static void lokerBarang() throws IOException{
        while(true){
            System.out.println(" ");
            System.out.println("     LOKER BARANG");
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
                    addLoker_barang();
                    break;
                case 2:
                    read_loker_barang();
                    break;
                case 3:
                    upLoker_barang();
                    break;
                case 4:
                    delLoker_barang();
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
    public static void menu() throws IOException {
        while(true){
            System.out.println(" ");
            System.out.println("        SELAMAT DATANG");
            System.out.println("    PROGRAM LOKER SERBAGUNA");
            System.out.println("=====================================");
            System.out.println("1. Loker Hewan");
            System.out.println("2. Loker Barang");
            System.out.println("3. Keluar Program");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    lokerHewan();
                    break;
                case 2:
                    lokerBarang();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
    }
    public static void addLoker_hewan() throws IOException{
        nomor_loker_hewan += 1;
        int lokerNomor = nomor_loker_hewan;
        System.out.print("Masukkan nama: ");
        String nama = br.readLine();
        System.out.print("Masukkan nomor HP: ");
        String nomorHP = br.readLine();
        System.out.print("Masukkan alamat: ");
        String alamat = br.readLine();
        System.out.print("Masukkan tanggal: ");
        String tanggal = br.readLine();
        System.out.print("Masukkan jumlah hari penitipan: ");
        int jumlah_hari = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jenis hewan: ");
        String jenis_hewan = br.readLine();
        System.out.print("Masukkan nama hewan: ");
        String nama_hewan = br.readLine();
        int harga = 20000*jumlah_hari;
        LokerHewan hewan = new LokerHewan(nama,nomorHP,alamat,tanggal,harga,jumlah_hari,lokerNomor,jenis_hewan,nama_hewan);
        loker_hewan.add(hewan);
    }

    public static void addLoker_barang() throws IOException{
        nomor_loker_barang += 1;
        int lokerNomor1 = nomor_loker_barang;
        System.out.print("Masukkan nama: ");
        String nama = br.readLine();
        System.out.print("Masukkan nomor HP: ");
        String nomorHP = br.readLine();
        System.out.print("Masukkan alamat: ");
        String alamat = br.readLine();
        System.out.print("Masukkan tanggal: ");
        String tanggal = br.readLine();
        System.out.print("Masukkan jumlah hari penitipan: ");
        int jumlah_hari = Integer.parseInt(br.readLine());
        System.out.print("Masukkan nama barang: ");
        String nama_barang = br.readLine();
        System.out.print("Masukkan berat barang (KG): ");
        int berat = Integer.parseInt(br.readLine()) ;
        int harga = berat*2000*jumlah_hari;
        LokerBarang barang = new LokerBarang(nama,nomorHP,alamat,tanggal,harga,jumlah_hari,lokerNomor1,nama_barang,berat);
        loker_barang.add(barang);
    }

    public static void readLoker_hewan() throws IOException{
        if (loker_hewan.size()==0){
            System.out.println("Data loker hewan kosong");
        }
        else{
            for (int i=0; i <  loker_hewan.size(); i++){
                System.out.println("Nama        : " + loker_hewan.get(i).getNama());
                System.out.println("Nomor HP    : " + loker_hewan.get(i).getNomorHp());
                System.out.println("Alamat      : " + loker_hewan.get(i).getAlamat());
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

    public static void read_loker_barang() throws IOException{
        if (loker_barang.size()==0){
            System.out.println("Data loker barang kosong");
        }
        else{
            for (int i=0; i <  loker_barang.size(); i++){
                System.out.println("Nama        : " + loker_barang.get(i).getNama());
                System.out.println("Nomor HP    : " + loker_barang.get(i).getNomorHp());
                System.out.println("Alamat      : " + loker_barang.get(i).getAlamat());
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

    public static void upLoker_hewan() throws IOException{
        readLoker_hewan();
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin diubah: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_hewan.size(); i++){
            if (idx == loker_hewan.get(i).getNomor_loker()){
                System.out.print("Masukkan nama: ");
                String nama = br.readLine();
                System.out.print("Masukkan nomor HP: ");
                String nomorHP = br.readLine();
                System.out.print("Masukkan alamat: ");
                String alamat = br.readLine();
                System.out.print("Masukkan tanggal: ");
                String tanggal = br.readLine();
                System.out.print("Masukkan jumlah hari penitipan: ");
                int jumlah_hari = Integer.parseInt(br.readLine());
                System.out.print("Masukkan jenis hewan: ");
                String jenis_hewan = br.readLine();
                System.out.print("Masukkan nama hewan: ");
                String nama_hewan = br.readLine();
                int harga = 20000*jumlah_hari;
                LokerHewan hewan = new LokerHewan(nama,nomorHP,alamat,tanggal,harga,jumlah_hari,idx,jenis_hewan,nama_hewan);
                loker_hewan.set(i, hewan);
                kondisi = 1;
                System.out.println("Data loker berhasil diubah");
                break;
            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal diubah");
        }

        
    }

    public static void upLoker_barang() throws IOException{
        read_loker_barang();
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin diubah: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_barang.size(); i++){
            if (idx == loker_barang.get(i).getNomor_loker()){
                System.out.print("Masukkan nama: ");
                String nama = br.readLine();
                System.out.print("Masukkan nomor HP: ");
                String nomorHP = br.readLine();
                System.out.print("Masukkan alamat: ");
                String alamat = br.readLine();
                System.out.print("Masukkan tanggal: ");
                String tanggal = br.readLine();
                System.out.print("Masukkan jumlah hari penitipan: ");
                int jumlah_hari = Integer.parseInt(br.readLine());
                System.out.print("Masukkan nama barang: ");
                String nama_barang = br.readLine();
                System.out.print("Masukkan berat barang (KG): ");
                int berat = Integer.parseInt(br.readLine()) ;
                int harga = berat*2000*jumlah_hari;
                LokerBarang barang = new LokerBarang(nama,nomorHP,alamat,tanggal,harga,jumlah_hari,idx,nama_barang,berat);
                loker_barang.set(i, barang);
                kondisi = 1;
                System.out.println("Data loker berhasil diubah");
                break;
            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal diubah");
        }

        
    }


    public static void delLoker_hewan() throws IOException{
        readLoker_hewan();
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin dihapus: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_hewan.size(); i++){
            if (idx == loker_hewan.get(i).getNomor_loker()){
                System.out.println("Nama        : " + loker_hewan.get(i).getNama());
                System.out.println("Nomor HP    : " + loker_hewan.get(i).getNomorHp());
                System.out.println("Alamat      : " + loker_hewan.get(i).getAlamat());
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

    public static void delLoker_barang() throws IOException{
        read_loker_barang();
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin dihapus: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  loker_barang.size(); i++){
            if (idx == loker_barang.get(i).getNomor_loker()){
                System.out.println("Nama        : " + loker_barang.get(i).getNama());
                System.out.println("Nomor HP    : " + loker_barang.get(i).getNomorHp());
                System.out.println("Alamat      : " + loker_barang.get(i).getAlamat());
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
}
