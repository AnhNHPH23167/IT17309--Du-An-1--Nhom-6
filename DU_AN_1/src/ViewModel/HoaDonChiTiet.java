/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Admin
 */
public class HoaDonChiTiet {

    private String Ma;
    private String TeN;
    private int SoLuong;
    private double DonGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String Ma, String TeN, int SoLuong, double DonGia) {
        this.Ma = Ma;
        this.TeN = TeN;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTeN() {
        return TeN;
    }

    public void setTeN(String TeN) {
        this.TeN = TeN;
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

    public void getThanhTien(double ThanhTien) {
        ThanhTien = SoLuong * DonGia;
    }

}
