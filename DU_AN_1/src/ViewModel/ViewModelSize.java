/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author Admin
 */
public class ViewModelSize {

    private String TenSize;

    public ViewModelSize() {
    }

    public ViewModelSize(String TenSize) {
        this.TenSize = TenSize;
    }

    public String getTenSize() {
        return TenSize;
    }

    public void setTenSize(String TenSize) {
        this.TenSize = TenSize;
    }

    @Override
    public String toString() {
        return "ViewModelSize{" + "TenSize=" + TenSize + '}';
    }

}
