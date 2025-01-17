public class CanBo {

    private int maCanBo;
    private String Hoten;
    private String donViCongTac;
    private double heSoLuong;
    private double phuCap;

    private static double luongCoBan = 1750000;

    public CanBo(int maCanBo,String hoten, String donViCongTac, double heSoLuong, double phuCap) {
        this.maCanBo = maCanBo;
        this.Hoten = hoten;
        this.donViCongTac = donViCongTac;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
        //this.luongCoBan = luongCoBan;
    }
    public CanBo() {

    }

    public int getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(int maCanBo) {
        this.maCanBo = maCanBo;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getDonViCongTac() {
        return donViCongTac;
    }

    public void setDonViCongTac(String donViCongTac) {
        this.donViCongTac = donViCongTac;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public static double getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(double luongCoBan) {
        CanBo.luongCoBan = luongCoBan;
    }

    public double tinhLuong() {
        return 0.0;
    }

    public String inTTin() {
        return null;
    }
}
