
package Swalayan;

public class ClassBarang {
    private String kode;
    private String nama;
    private int stok;
    private int harga;
    private int jumlahBeli; 
    
    ClassBarang(){
        
    }
    ClassBarang (String kode, String nama, int stok, int harga){
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    
    //method update stok setelah pembelian
    public int stokAkhir(){
        return this.stok - this.jumlahBeli;
    }
    
    //method total beli suatu barang
    public int totalBeli(){
        return this.jumlahBeli * this.harga;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    /**
     * @return the jumlahBeli
     */
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    /**
     * @param jumlahBeli the jumlahBeli to set
     */
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
}
