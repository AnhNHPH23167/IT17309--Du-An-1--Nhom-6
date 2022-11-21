package ViewModel;

public class ViewModelSanPham {

    private String Ten;

    public ViewModelSanPham() {
    }

    public ViewModelSanPham(String Ten) {
        this.Ten = Ten;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return "SanPham{" + "Ten=" + Ten + '}';
    }



}
