package Swalayan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class coba {

    public static void main(String[] args) {
        String kategori = "Member";
        int nomor = 1;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        int list[] = new int[3];
        list[0] = 1000;
        list[1] = 3500;
        list[2] = 5000;
        ClassTransaksi transaksi[] = new ClassTransaksi[1];
        if ("Member".equals(kategori)) {
            transaksi[0] = new ClassTransaksiMember();
        } else {
            transaksi[0] = new ClassTransaksiNonMember();
        }
        transaksi[0].setListTotalBarang(list);
        System.out.println(transaksi[0].hitungSubTotal());
        System.out.println(transaksi[0].hitungDiskon());
        System.out.println(transaksi[0].hitungTotal());
        System.out.println(transaksi[0].hitungPoin());
    }
}
