/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private String Ma;
    private String NgayTao;
    private int TrangThai;

    public HoaDon() {
    }

    public HoaDon(String Ma, String NgayTao, int TrangThai) {
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.TrangThai = TrangThai;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String trangthai() {
        String TrangThaiCTT = "Chưa thanh toán";
        
        String TrangThaiDTT = "Đã thanh toán";
        if (TrangThai == 0) {
            return TrangThaiCTT;
        } else {
            return TrangThaiDTT;
        }
    }

    @Override
    public String toString() {
        return "HoaDon{" + "Ma=" + Ma + ", NgayTao=" + NgayTao + ", TrangThai=" + TrangThai + '}';
    }

}
