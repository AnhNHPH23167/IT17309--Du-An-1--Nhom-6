/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author LamNL
 */
public class KhachHangViewModel {

    private String maKH;
    private String tenKH;
    private String diachiKH;
    private String sdtKH;

    public KhachHangViewModel() {
    }

    public KhachHangViewModel(String maKH, String tenKH, String diachiKH, String sdtKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diachiKH = diachiKH;
        this.sdtKH = sdtKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiachiKH() {
        return diachiKH;
    }

    public void setDiachiKH(String diachiKH) {
        this.diachiKH = diachiKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

}
