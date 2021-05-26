package praktikumGenerics;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Formatter
        Scanner userInput = new Scanner(System.in);
        DecimalFormat IDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rupiah = new DecimalFormatSymbols();
        rupiah.setCurrencySymbol("Rp");
        rupiah.setDecimalSeparator('.');
        rupiah.setGroupingSeparator(',');
        IDR.setDecimalFormatSymbols(rupiah);

        ArrayList<Furnitur<String>> daftar = new ArrayList<>();

        daftar.add(new PerabotKayu<>("Meja", 101, 1500000, 15));
        daftar.add(new Elektronik<>("Lampu", 205, 20000, 1));
        daftar.add(new Elektronik<>("Kipas Angin", 203, 549000, 4));
        daftar.add(new PerabotKayu<>("Kursi", 104, 695000, 3));
        daftar.add(new PerabotKayu<>("Lemari", 105, 2799000, 45));
        daftar.add(new Elektronik<>("Televisi", 209, 6049000, 20));
        daftar.add(new PerabotKayu<>("Rak Buku", 107, 399999, 17));
        daftar.add(new Elektronik<>("Radio", 206, 287000, 3));
        daftar.add(new PerabotKayu<>("Tempat Tidur", 109, 2225000, 60));

        //Table
        for (int i = 0; i < 90; i++) {
            System.out.printf("=");
        }
        System.out.println();
        System.out.printf("%-26SREKAPITULASI HASIL PENJUALAN FURNITURE%26s\n", "|", "|");
        for (int i = 0; i < 90; i++) {
            System.out.printf("=");
        }
        System.out.println();
        System.out.printf("|%-7s|%-20s|%-15s|%-22s|%-20s|\n", "Kode", "Nama Barang", "Berat Barang", "Jenis Barang", "Harga");
        for (int i = 0; i < 90; i++) {
            System.out.printf("-");
        }
        System.out.println();

        //Rekapitulasi Furniture
        for (int i = 0; i < daftar.size(); i++) {
            daftar.get(i).listBarang();
        }
        for (int i = 0; i < 90; i++) {
            System.out.printf("-");
        }
        System.out.println();

        //Total
        int totalBerat = 0;
        double totalHarga = 0;
        int totalFurnitur = daftar.size();

        for (int i = 0; i < daftar.size(); i++) {
            totalBerat += daftar.get(i).getBeratBarang();
            totalHarga += daftar.get(i).getHargaBarang();
        }

        System.out.printf("|%-28s|%-15s|%-22s|%-20s|\n", "TOTAL", totalBerat + " kg", totalFurnitur + " pcs", IDR.format(totalHarga));
        for (int i = 0; i < 90; i++) {
            System.out.printf("=");
        }
        System.out.println();

        //Detail Barang
        int kodeInput;
        System.out.print("Apakah anda ingin melihat rincian barang (Y/N) : ");
        String yesno = userInput.nextLine();

        if (yesno.equalsIgnoreCase("Y")) {
            System.out.print("Masukan Kode Barang : ");
            kodeInput = userInput.nextInt();
            for (int i = 0; i < daftar.size(); i++) {
                if (daftar.get(i).getKodeBarang() == kodeInput) {
                    daftar.get(i).rincian();
                }
            }
        }
    }
}