/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoMain;

/**
 *
 * @author mngha
 */
public class NhanVien {
    private String maNV;
    private String ho;
    private String tendem;
    private String ten;
    private String SDT;
    private String chucVu;
    private String Diachi;
    private int trangthai;

    public NhanVien() {
    }

    public NhanVien(String maNV, String ho, String tendem, String ten, String SDT, String chucVu, String Diachi, int trangthai) {
        this.maNV = maNV;
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.SDT = SDT;
        this.chucVu = chucVu;
        this.Diachi = Diachi;
        this.trangthai = trangthai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ten=" + ten + '}';  
                
    }
    
    
}
