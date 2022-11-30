/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import Views.QuanLySanPham;
import Views.ViewBanHang;
import Views.ViewDangNhap;
import Views.ViewSanPham;
import Views.ViewQuanLySanPham;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Application {
    public static void main(String[] args) throws SQLException {
        new QuanLySanPham().setVisible(true);
    }
}
