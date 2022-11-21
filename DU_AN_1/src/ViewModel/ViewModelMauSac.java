/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Admin
 */
public class ViewModelMauSac {

    private String TenMauSac;

    public ViewModelMauSac() {
    }

    public ViewModelMauSac(String TenMauSac) {
        this.TenMauSac = TenMauSac;
    }

    public String getTenMauSac() {
        return TenMauSac;
    }

    public void setTenMauSac(String TenMauSac) {
        this.TenMauSac = TenMauSac;
    }

    @Override
    public String toString() {
        return "MauSac{" + "TenMauSac=" + TenMauSac + '}';
    }



}
