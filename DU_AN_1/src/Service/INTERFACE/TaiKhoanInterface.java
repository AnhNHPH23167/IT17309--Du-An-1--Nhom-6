/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.INTERFACE;

import ViewModel.ViewModelTaiKhoan;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface TaiKhoanInterface {
    public ArrayList<ViewModelTaiKhoan> getList();
    public void updateTaiKhoan(String TK, ViewModelTaiKhoan taikhoan);
}
