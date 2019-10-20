package Main;

public class GajiPegawai {

	private String nama;
	private String alamat;
	private int uangTransport;
	private int uangTunjangan;
	private int gajiPokok;
	private int totalGaji;

	public String getNama() {
		return this.nama;
	}

	/**
	 * 
	 * @param nama
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return this.alamat;
	}

	/**
	 * 
	 * @param alamat
	 */
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getUangTransport() {
		return this.uangTransport;
	}

	/**
	 * 
	 * @param uangTransport
	 */
	public void setUangTransport(int uangTransport) {
		this.uangTransport = uangTransport;
	}

	public int getUangTunjangan() {
		return this.uangTunjangan;
	}

	/**
	 * 
	 * @param uangTunjangan
	 */
	public void setUangTunjangan(int uangTunjangan) {
		this.uangTunjangan = uangTunjangan;
	}

	public int getGajiPokok() {
		return this.gajiPokok;
	}

	/**
	 * 
	 * @param gajiPokok
	 */
	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public int getTotalGaji() {
		return this.totalGaji;
	}

	/**
	 * 
	 * @param totalGaji
	 */
	public void setTotalGaji(int totalGaji) {
		this.totalGaji = totalGaji;
	}

	/**
	 * 
	 * @param uangTunjangan
	 * @param uangTransport
	 * @param gajiPokok
	 */
	public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
		totalGaji = uangTunjangan + uangTransport + gajiPokok;
		return totalGaji;
	}

	/**
	 * 
	 * @param nama
	 * @param alamat
	 * @param uangTunjangan
	 * @param uangTransport
	 * @param gajiPokok
	 * @param totalGaji
	 */
	public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
                                                    System.out.println("\n++++++Data Gaji Karyawan PT.ALIM RUGI+++++");
                                                     System.out.println("*****************************************************");
                                                     System.out.println("Nama Karyawan : " + nama);
                                                     System.out.println("Alamat : " + alamat);
                                                     System.out.println("Uang Transport : Rp. " + uangTransport);
                                                     System.out.println("Uang Tunjangan : Rp. " + uangTunjangan);
                                                     System.out.println("Gaji Pokok : Rp. " + gajiPokok);
                                                     totalGaji(uangTunjangan, uangTransport, gajiPokok);
                                                     System.out.println("Total Gaji : Rp. " + totalGaji);
		
	}

}