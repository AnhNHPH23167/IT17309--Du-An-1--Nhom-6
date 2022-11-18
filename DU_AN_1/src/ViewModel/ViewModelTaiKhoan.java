package ViewModel;

public class ViewModelTaiKhoan {

    private String MaTK;
    private String TenTK;
    private String MatKhau;
    private String ChucVu;

    public ViewModelTaiKhoan() {
    }

    public ViewModelTaiKhoan(String MaTK, String TenTK, String MatKhau, String ChucVu) {
        this.MaTK = MaTK;
        this.TenTK = TenTK;
        this.MatKhau = MatKhau;
        this.ChucVu = ChucVu;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    @Override
    public String toString() {
        return "ViewModelTaiKhoan{" + "MaTK=" + MaTK + ", TenTK=" + TenTK + ", MatKhau=" + MatKhau + ", ChucVu=" + ChucVu + '}';
    }

}
