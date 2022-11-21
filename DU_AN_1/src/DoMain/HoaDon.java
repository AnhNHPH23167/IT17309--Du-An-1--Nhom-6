/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoMain;

import java.util.Date;

/**
 *
 * @author mngha
 */
public class HoaDon {
    private String MaHoaDon;
    private String MaNhanVien;
    private Date NgayTao;
    private Date NgayThanhToan;
    private double ThanhTien;
    private int SDTKH;
    private String DiaChi;
    private int TrangThai;

    public HoaDon() {
    }

    public HoaDon(String MaHoaDon, String MaNhanVien, Date NgayTao, Date NgayThanhToan, double ThanhTien, int SDTKH, String DiaChi, int TrangThai) {
        this.MaHoaDon = MaHoaDon;
        this.MaNhanVien = MaNhanVien;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.ThanhTien = ThanhTien;
        this.SDTKH = SDTKH;
        this.DiaChi = DiaChi;
        this.TrangThai = TrangThai;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getSDTKH() {
        return SDTKH;
    }

    public void setSDTKH(int SDTKH) {
        this.SDTKH = SDTKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
    
}
