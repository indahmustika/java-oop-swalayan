package Swalayan;

public class ClassSeller {

    private String username;
    private String password;
    private String nama;
    private String alamat;
    private String telepon;

    ClassSeller(String username, String password, String nama, String alamat, String telepon) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    ClassSeller(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
