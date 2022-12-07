/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Admin
 */
public class ChiTietSanPham {

    private String Ma;
    private String Ten;
    private int SoLuong;
    private double GiaBan;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String Ma, String Ten, int SoLuong, double GiaBan) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSanPhamDefault{" + "Ma=" + Ma + ", Ten=" + Ten + ", SoLuong=" + SoLuong + ", GiaBan=" + GiaBan + '}';
    }

}
