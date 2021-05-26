package praktikumGenerics;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PerabotKayu<T> extends Furnitur<T>{


    PerabotKayu(T namaBarang, int kodeBarang, double hargaBarang, int beratBarang){
        super(namaBarang, kodeBarang, hargaBarang, beratBarang);
    }

    @Override
    public void listBarang() {
        DecimalFormat IDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rupiah = new DecimalFormatSymbols();
        rupiah.setCurrencySymbol("Rp");
        rupiah.setDecimalSeparator('.');
        rupiah.setGroupingSeparator(',');
        IDR.setDecimalFormatSymbols(rupiah);
        System.out.printf("|%-7s|%-20s|%-15s|%-22s|%-20s|\n", getKodeBarang(), getNamaBarang(), getBeratBarang()+" kg", "Perabot Kayu",IDR.format(getHargaBarang()));
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
        System.out.printf("|Jenis Barang     : %-15s|\n", "Perabot Kayu");
        System.out.printf("|Harga Barang     : %-15s|\n", IDR.format(getHargaBarang()));
        System.out.print("|==================================|\n");
    }
}
