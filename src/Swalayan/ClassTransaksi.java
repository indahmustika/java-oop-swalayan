package Swalayan;

import java.sql.Timestamp;

public abstract class ClassTransaksi {

    private int nomor;
    private Timestamp tanggal;
    private int[] listTotalBarang;

    ClassTransaksi() {
    }

    ClassTransaksi(int nomor, Timestamp tanggal) {
        this.nomor = nomor;
        this.tanggal = tanggal;
    }

    ClassTransaksi(int nomor, Timestamp tanggal, int[] listTotalBarang) {
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.listTotalBarang = listTotalBarang;
    }

    public int hitungSubTotal() {
        int subTotal = 0;
        for (int i = 0; i < this.listTotalBarang.length; i++) {
            subTotal = subTotal + this.listTotalBarang[i];
        }
        return subTotal;
    }

    public abstract double hitungDiskon();
    
    public abstract double hitungTotal();
    
    public abstract int hitungPoin();

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public Timestamp getTanggal() {
        return tanggal;
    }

    public void setTanggal(Timestamp tanggal) {
        this.tanggal = tanggal;
    }

    public int[] getListTotalBarang() {
        return listTotalBarang;
    }

    public void setListTotalBarang(int[] listTotalBarang) {
        this.listTotalBarang = listTotalBarang;
    }
}
