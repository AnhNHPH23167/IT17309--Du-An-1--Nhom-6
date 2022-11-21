/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author LamNL
 */
public class HoaDonChiTietViewModel {

    private String maHDCT;
    private int soLuong;
    private String Size;
    private String Kieu;
    private String donGia;
    private String TrangThai;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(String maHDCT, int soLuong, String Size, String Kieu, String donGia, String TrangThai) {
        this.maHDCT = maHDCT;
        this.soLuong = soLuong;
        this.Size = Size;
        this.Kieu = Kieu;
        this.donGia = donGia;
        this.TrangThai = TrangThai;
    }

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getKieu() {
        return Kieu;
    }

    public void setKieu(String Kieu) {
        this.Kieu = Kieu;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

}
