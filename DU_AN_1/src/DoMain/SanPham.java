package DoMain;

public class SanPham {

    private String MaSanPham;
    private String TenSanPham;

    public SanPham() {
    }

    public SanPham(String MaSanPham, String TenSanPham) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    @Override
    public String toString() {
        return "ViewModelSanPham{" + "MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + '}';
    }
    

}
