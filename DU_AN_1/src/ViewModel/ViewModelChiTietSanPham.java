package ViewModel;

import DoMain.Size;
import DoMain.SanPham;
import DoMain.MauSac;
import DoMain.ChatLieu;
import DoMain.LoaiSP;

public class ViewModelChiTietSanPham {

    private String Ma;
    private SanPham SanPham;
    private Size Size;
    private LoaiSP loaiSP;
    private MauSac MauSac;
    private ChatLieu ChatLieu;
    private int Soluong;
    private double Giaban;
    private String Mota;

    public ViewModelChiTietSanPham() {
    }
    
    public ViewModelChiTietSanPham(String Ma, SanPham SanPham, Size Size, LoaiSP loaiSP, MauSac MauSac, ChatLieu ChatLieu, int Soluong, double Giaban, String Mota) {
        this.Ma = Ma;
        this.SanPham = SanPham;
        this.Size = Size;
        this.loaiSP = loaiSP;
        this.MauSac = MauSac;
        this.ChatLieu = ChatLieu;
        this.Soluong = Soluong;
        this.Giaban = Giaban;
        this.Mota = Mota;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public SanPham getSanPham() {
        return SanPham;
    }

    public void setSanPham(SanPham SanPham) {
        this.SanPham = SanPham;
    }

    public Size getSize() {
        return Size;
    }

    public void setSize(Size Size) {
        this.Size = Size;
    }

    public LoaiSP getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSP loaiSP) {
        this.loaiSP = loaiSP;
    }

    public MauSac getMauSac() {
        return MauSac;
    }

    public void setMauSac(MauSac MauSac) {
        this.MauSac = MauSac;
    }

    public ChatLieu getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(ChatLieu ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getGiaban() {
        return Giaban;
    }

    public void setGiaban(double Giaban) {
        this.Giaban = Giaban;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return "ViewModelChiTietSanPham{" + "Ma=" + Ma + ", SanPham=" + SanPham + ", Size=" + Size + ", loaiSP=" + loaiSP + ", MauSac=" + MauSac + ", ChatLieu=" + ChatLieu + ", Soluong=" + Soluong + ", Giaban=" + Giaban + ", Mota=" + Mota + '}';
    }
    
}
