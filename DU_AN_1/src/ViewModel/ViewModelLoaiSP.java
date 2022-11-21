/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Admin
 */
public class ViewModelLoaiSP {

    private String TenLoaiSP;

    public ViewModelLoaiSP() {
    }

    public ViewModelLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }

    @Override
    public String toString() {
        return "LoaiSP{" + "TenLoaiSP=" + TenLoaiSP + '}';
    }

}
