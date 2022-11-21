package ViewModel;

public class ViewModelTaiKhoan {

    private String TenTK;
    private String MatKhau;

    public ViewModelTaiKhoan() {
    }

    public ViewModelTaiKhoan(String TenTK, String MatKhau) {
        this.TenTK = TenTK;
        this.MatKhau = MatKhau;
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

    @Override
    public String toString() {
        return "ViewModelTaiKhoan{" + "TenTK=" + TenTK + ", MatKhau=" + MatKhau + '}';
    }

}
