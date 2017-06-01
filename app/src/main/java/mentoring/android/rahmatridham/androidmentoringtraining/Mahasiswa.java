package mentoring.android.rahmatridham.androidmentoringtraining;

/**
 * Created by rahmatridham on 6/1/2017.
 */

public class Mahasiswa {
    private String nama,nim,jenisKelamin,alamat,noTelpon;

    public Mahasiswa(String nama, String nim, String jenisKelamin, String alamat, String noTelpon) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.noTelpon = noTelpon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }
}
