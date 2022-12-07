/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoMain;

/**
 *
 * @author Admin
 */
public class MauSac {

    private String MaMauSac;
    private String TenMauSac;

    public MauSac() {
    }

    public MauSac(String MaMauSac, String TenMauSac) {
        this.MaMauSac = MaMauSac;
        this.TenMauSac = TenMauSac;
    }

    public String getMaMauSac() {
        return MaMauSac;
    }

    public void setMaMauSac(String MaMauSac) {
        this.MaMauSac = MaMauSac;
    }

    public String getTenMauSac() {
        return TenMauSac;
    }

    public void setTenMauSac(String TenMauSac) {
        this.TenMauSac = TenMauSac;
    }

    @Override
    public String toString() {
        return "ViewModelMauSac{" + "MaMauSac=" + MaMauSac + ", TenMauSac=" + TenMauSac + '}';
    }

}
