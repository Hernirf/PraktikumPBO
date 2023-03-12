public class LokerData {
    private int nomor;
	private String nama;
	private String nama_barang;
	private String nomorHP;
	private String tanggal;

	public int getNomor() {
		return nomor;
	}

	public void setNomor(int nomor) {
		this.nomor = nomor;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNama_barang() {
		return nama_barang;
	}

	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}

	public String getNomorHP() {
		return nomorHP;
	}

	public void setNomorHP(String nomorHP) {
		this.nomorHP = nomorHP;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public LokerData(int nomor_loker, String nama, String nama_barang, String nomorHp, String tanggal){
			this.nomor = nomor_loker;
		this.nama = nama;
		this.nama_barang = nama_barang;
		this.nomorHP = nomorHp;
		this.tanggal = tanggal;
	}
}
