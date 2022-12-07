/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoMain;

/**
 *
 * @author Admin
 */
public class LoaiSP {

    private String MaLoaiSP;
    private String TenLoaiSP;

    public LoaiSP() {
    }

    public LoaiSP(String MaLoaiSP, String TenLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
        this.TenLoaiSP = TenLoaiSP;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }

    @Override
    public String toString() {
        return "ViewModelLoaiSP{" + "MaLoaiSP=" + MaLoaiSP + ", TenLoaiSP=" + TenLoaiSP + '}';
    }

}
