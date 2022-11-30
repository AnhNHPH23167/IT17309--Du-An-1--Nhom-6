/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.IMPLEMENT;

import Repository.RepositoryDangNhap;
import Service.INTERFACE.TaiKhoanInterface;
import ViewModel.ViewModelTaiKhoan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admine
 */
public class TaiKhoanIMPL implements TaiKhoanInterface {

    private RepositoryDangNhap rp = new RepositoryDangNhap();

    @Override
    public void updateTaiKhoan(String TK, ViewModelTaiKhoan taikhoan) {
        rp.update(TK, taikhoan);
    }

    @Override
    public ArrayList<ViewModelTaiKhoan> getList() {
        try {
            return rp.getTK();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
