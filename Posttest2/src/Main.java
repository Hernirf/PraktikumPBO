import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;





public class Main {
    static int loker_nomor = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<LokerData> data_loker = new ArrayList<LokerData>();
    public static void main(String[] args) throws IOException {
        while(true){
            System.out.println(" ");
            System.out.println("        SELAMAT DATANG");
            System.out.println("    PROGRAM LOKER SERBAGUNA");
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Loker");
            System.out.println("2. Tampilkan Data Loker");
            System.out.println("3. Update Data Loker");
            System.out.println("4. Hapus Data Loker");
            System.out.println("5. Keluar Program");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    addLoker();
                    break;
                case 2:
                    readLoker();
                    break;
                case 3:
                   upLoker();
                    break;
                case 4:
                     delLoker();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
    }

    public static void addLoker() throws IOException{
        loker_nomor += 1;
        int lokerNomor = loker_nomor;
        System.out.print("Masukkan nama: ");
        String namaa = br.readLine();
        System.out.print("Masukkan nomor HP: ");
        String nomorHPP = br.readLine();
        System.out.print("Masukkan nama baramg: ");
        String nama_ttp = br.readLine();
        System.out.print("Masukkan tanggal: ");
        String tanggal = br.readLine();
        LokerData loker = new LokerData(lokerNomor, namaa, nama_ttp, nomorHPP, tanggal);
        data_loker.add(loker);
    }

    public static void readLoker() throws IOException{
        if (data_loker.size()==0){
            System.out.println("Data loker kosong");
        }
        else{
            for (int i=0; i <  data_loker.size(); i++){
                System.out.println("Nama        : " + data_loker.get(i).getNama());
                System.out.println("Nomor HP    : " + data_loker.get(i).getNomorHP());
                System.out.println("Nomor Loker : " + data_loker.get(i).getNomor());
                System.out.println("Nama Barang : " + data_loker.get(i).getNama_barang());
                System.out.println("Tanggal     : " + data_loker.get(i).getTanggal());
                System.out.println("\n");
            }
        }
    }

    public static void upLoker() throws IOException{
        readLoker();
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin diubah: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  data_loker.size(); i++){
            if (idx == data_loker.get(i).getNomor()){
                System.out.print("Masukkan nama: ");
                String namaa = br.readLine();
                System.out.print("Masukkan nomor HP: ");
                String nomorHPP = br.readLine();
                System.out.print("Masukkan nama baramg: ");
                String nama_ttp = br.readLine();
                System.out.print("Masukkan tanggal: ");
                String tanggal = br.readLine();
                data_loker.get(i).setNama(namaa);
                data_loker.get(i).setNomorHP(nomorHPP);
                data_loker.get(i).setNama_barang(nama_ttp);
                data_loker.get(i).setTanggal(tanggal);
                kondisi = 1;
                System.out.println("Data loker berhasil diubah");
                break;
            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal diubah");
        }

        
    }

    public static void delLoker() throws IOException{
        readLoker();
        int kondisi = 0;
        System.out.print("Masukkan nomor loker yang ingin dihapus: ");
        int idx = Integer.parseInt(br.readLine());
        for (int i=0; i <  data_loker.size(); i++){
            if (idx == data_loker.get(i).getNomor()){
                System.out.println("Nama        : " + data_loker.get(i).getNama());
                System.out.println("Nomor HP    : " + data_loker.get(i).getNomorHP());
                System.out.println("Nomor Loker : " + data_loker.get(i).getNomor());
                System.out.println("Nama Barang : " + data_loker.get(i).getNama_barang());
                System.out.println("Tanggal     : " + data_loker.get(i).getTanggal());
                System.out.print("Apakah tetap ingin menghapus data loker? (0/1) ");
                int pil = Integer.parseInt(br.readLine());
                if (pil == 1){
                    data_loker.remove(i);
                    kondisi = 1;
                    System.out.println("Data loker berhasil dihapus");

                }
                else{
                    System.out.println("Data loker gagal dihapus");
                    break;
                }

            }
        }
        if (kondisi == 0){
            System.out.println("Data loker gagal dihapus");

        }
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
