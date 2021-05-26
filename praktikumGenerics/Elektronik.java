package praktikumGenerics;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Elektronik<T> extends Furnitur<T>{

    Elektronik(T namaBarang, int kodeBarang, double hargaBarang, int beratBarang){
        super(namaBarang, kodeBarang, hargaBarang, beratBarang);
    }

    @Override
    public void rincian() {
        DecimalFormat IDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rupiah = new DecimalFormatSymbols();
        rupiah.setCurrencySymbol("Rp");
        rupiah.setDecimalSeparator('.');
        rupiah.setGroupingSeparator(',');
        IDR.setDecimalFormatSymbols(rupiah);

        System.out.print("|==================================|\n");
        System.out.printf("|==========%-14s==========|\n", "RINCIAN BARANG");
        System.out.print("|==================================|\n");
        System.out.printf("|Kode Barang      : %-15d|\n", getKodeBarang());
        System.out.printf("|Nama Barang      : %-15s|\n", getNamaBarang());
        System.out.printf("|Jenis Barang     : %-15s|\n", "Elektronik");
        System.out.printf("|Harga Barang     : %-15s|\n", IDR.format(getBeratBarang()));
        System.out.print("|==================================|\n");
    }

    @Override
    public void listBarang() {
        DecimalFormat IDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rupiah = new DecimalFormatSymbols();
        rupiah.setCurrencySymbol("Rp");
        rupiah.setDecimalSeparator('.');
        rupiah.setGroupingSeparator(',');
        IDR.setDecimalFormatSymbols(rupiah);

        System.out.printf("|%-7s|%-20s|%-15s|%-22s|%-20s|\n", getKodeBarang(), getNamaBarang(), getBeratBarang()+" kg", "Elektronik",IDR.format(getHargaBarang()));
    }
}
