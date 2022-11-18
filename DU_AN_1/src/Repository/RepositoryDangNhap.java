/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utilites.DBConnect;
import ViewModel.ViewModelTaiKhoan;
import java.util.ArrayList;
import java.sql.*;

public class RepositoryDangNhap {

    public static ArrayList<ViewModelTaiKhoan> getTK() throws SQLException {
        ArrayList<ViewModelTaiKhoan> list = new ArrayList<>();
        try {
            Connection conn = DBConnect.getConnection();

            String sql = "SELECT TOP (100) [MaTK]\n"
                    + "      ,[TenTK]\n"
                    + "      ,[Matkhau]\n"
                    + "      ,[Chucvu]\n"
                    + "  FROM [QuanLyBanQuanAo].[dbo].[TaiKhoan]";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String MaTK = rs.getString(1);
                String TenTK = rs.getString(2);
                String MatKhau = rs.getString(3);
                String ChucVu = rs.getString(4);
                ViewModelTaiKhoan taikhoan = new ViewModelTaiKhoan(MaTK, TenTK, MatKhau, ChucVu);
                list.add(taikhoan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return list;
    }

    public void update(String ma, ViewModelTaiKhoan tk) {
        try {
            String sql = " update TaiKhoan set Matkhau = ? where MaTK = ?";
            Connection conn = DBConnect.getConnection();         
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tk.getMatKhau());
            ps.setString(2, ma);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(getTK());
    }
}
