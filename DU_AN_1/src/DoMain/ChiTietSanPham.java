/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoMain;

/**
 *
 * @author Admin
 */
public class ChiTietSanPham {

    private String MaCTPSP;
    private String LoaiSP;
    private String MauSac;
    private String SanPham;
    private String Size;
    private String ChatLieu;
    private int SoLuong;
    private double DonGia;
    private String MoTa;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String MaCTPSP, String LoaiSP, String MauSac, String SanPham, String Size, String ChatLieu, int SoLuong, double DonGia, String MoTa) {
        this.MaCTPSP = MaCTPSP;
        this.LoaiSP = LoaiSP;
        this.MauSac = MauSac;
        this.SanPham = SanPham;
        this.Size = Size;
        this.ChatLieu = ChatLieu;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.MoTa = MoTa;
    }

    public String getMaCTPSP() {
        return MaCTPSP;
    }

    public void setMaCTPSP(String MaCTPSP) {
        this.MaCTPSP = MaCTPSP;
    }

    public String getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(String LoaiSP) {
        this.LoaiSP = LoaiSP;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getSanPham() {
        return SanPham;
    }

    public void setSanPham(String SanPham) {
        this.SanPham = SanPham;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "MaCTPSP=" + MaCTPSP + ", LoaiSP=" + LoaiSP + ", MauSac=" + MauSac + ", SanPham=" + SanPham + ", Size=" + Size + ", ChatLieu=" + ChatLieu + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", MoTa=" + MoTa + '}';
    }
}
