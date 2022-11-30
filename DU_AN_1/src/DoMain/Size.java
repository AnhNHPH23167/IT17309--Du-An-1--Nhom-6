/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoMain;

/**
 *
 * @author Admin
 */
public class Size {

    private String MaSize;
    private String TenSize;

    public Size() {
    }

    public Size(String MaSize, String TenSize) {
        this.MaSize = MaSize;
        this.TenSize = TenSize;
    }

    public String getMaSize() {
        return MaSize;
    }

    public void setMaSize(String MaSize) {
        this.MaSize = MaSize;
    }

    public String getTenSize() {
        return TenSize;
    }

    public void setTenSize(String TenSize) {
        this.TenSize = TenSize;
    }

    @Override
    public String toString() {
        return "ViewModelSize{" + "MaSize=" + MaSize + ", TenSize=" + TenSize + '}';
    }

    
}
