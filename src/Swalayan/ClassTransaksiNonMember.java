package Swalayan;

import java.sql.Timestamp;

public class ClassTransaksiNonMember extends ClassTransaksi {

    ClassTransaksiNonMember(int nomor, Timestamp tanggal) {
        super(nomor, tanggal);
    }

    ClassTransaksiNonMember(int nomor, Timestamp tanggal, int[] listTotalBarang) {
        super(nomor, tanggal, listTotalBarang);
    }
    ClassTransaksiNonMember(){
        
    }

    @Override
    public double hitungDiskon() {
        return this.hitungSubTotal() * 0;
    }

    @Override
    public double hitungTotal() {
        return this.hitungSubTotal();
    }

    @Override
    public int hitungPoin() {
        return 0;
    }
}
