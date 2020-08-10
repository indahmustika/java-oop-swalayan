package Swalayan;

import java.sql.Timestamp;

public class ClassTransaksiMember extends ClassTransaksi {

    ClassTransaksiMember(int nomor, Timestamp tanggal) {
        super(nomor, tanggal);
    }

    ClassTransaksiMember(int nomor, Timestamp tanggal, int[] listTotalBarang) {
        super(nomor, tanggal, listTotalBarang);
    }
    ClassTransaksiMember(){
        
    }

    //diskon sebesar 10%
    @Override
    public double hitungDiskon() {
        return this.hitungSubTotal() * 10 / 100;
    }

    @Override
    public double hitungTotal() {
        return this.hitungSubTotal() - this.hitungDiskon();
    }

    @Override
    public int hitungPoin() {
        return this.hitungSubTotal() / 100;
    }

}
