package praktikumGenerics;

public abstract class Furnitur <T>{

    private T namaBarang;
    private double hargaBarang;
    private int kodeBarang;
    private int beratBarang;

    Furnitur(T namaBarang, int kodeBarang, double hargaBarang, int beratBarang) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.hargaBarang = hargaBarang;
        this.beratBarang = beratBarang;
    }

    public Furnitur() {

    }

    public abstract void rincian();
    public abstract void listBarang();


    public T getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(T namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getBeratBarang() {
        return beratBarang;
    }

    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }
}


