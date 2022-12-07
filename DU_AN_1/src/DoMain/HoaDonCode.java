
package DoMain;


public class HoaDonCode {
    private String maHD;
    private String NgayTao;
    private String NgayThanhToan;
    private String MaNhanVien;

    public HoaDonCode() {
    }

    public HoaDonCode(String maHD, String NgayTao, String NgayThanhToan, String MaNhanVien) {
        this.maHD = maHD;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    @Override
    public String toString() {
        return "HoaDonCode{" + "maHD=" + maHD + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", MaNhanVien=" + MaNhanVien + '}';
    }
    
}
