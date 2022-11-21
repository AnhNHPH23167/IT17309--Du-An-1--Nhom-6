package ViewModel;

public class ViewModelChiTietSanPham {

    private String Ma;
    private ViewModelSanPham SanPham;
    private ViewModelSize Size;
    private ViewModelLoaiSP loaiSP;
    private ViewModelMauSac MauSac;
    private int Soluong;
    private double Giaban;
    private String Mota;

    public ViewModelChiTietSanPham() {
    }

    public ViewModelChiTietSanPham(String Ma, ViewModelSanPham SanPham, ViewModelSize Size, ViewModelLoaiSP loaiSP, ViewModelMauSac MauSac, int Soluong, double Giaban, String Mota) {
        this.Ma = Ma;
        this.SanPham = SanPham;
        this.Size = Size;
        this.loaiSP = loaiSP;
        this.MauSac = MauSac;
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

    public ViewModelSanPham getSanPham() {
        return SanPham;
    }

    public void setSanPham(ViewModelSanPham SanPham) {
        this.SanPham = SanPham;
    }

    public ViewModelSize getSize() {
        return Size;
    }

    public void setSize(ViewModelSize Size) {
        this.Size = Size;
    }

    public ViewModelLoaiSP getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(ViewModelLoaiSP loaiSP) {
        this.loaiSP = loaiSP;
    }

    public ViewModelMauSac getMauSac() {
        return MauSac;
    }

    public void setMauSac(ViewModelMauSac MauSac) {
        this.MauSac = MauSac;
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
        return "ViewModelChiTietSanPham{" + "Ma=" + Ma + ", SanPham=" + SanPham + ", Size=" + Size + ", loaiSP=" + loaiSP + ", MauSac=" + MauSac + ", Soluong=" + Soluong + ", Giaban=" + Giaban + ", Mota=" + Mota + '}';
    }

  

   

}
