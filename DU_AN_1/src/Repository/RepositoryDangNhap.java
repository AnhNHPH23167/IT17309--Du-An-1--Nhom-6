/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utilites.DBConnect;
import ViewModel.ViewModelTaiKhoan;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class RepositoryDangNhap {

    public static ArrayList<ViewModelTaiKhoan> getTK() throws SQLException {
        ArrayList<ViewModelTaiKhoan> list = new ArrayList<>();
        try {
            Connection conn = DBConnect.getConnection();

            String sql = "SELECT [TaiKhoan]\n"
                    + "      ,[Matkhau]\n"
                    + "  FROM [dbo].[TaiKhoan]";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
              
                String TenTK = rs.getString(1);
                String MatKhau = rs.getString(2);

                ViewModelTaiKhoan taikhoan = new ViewModelTaiKhoan(TenTK, MatKhau);
                list.add(taikhoan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return list;
    }

<<<<<<< HEAD
    public void update(String ma, ViewModelTaiKhoan tk) {
        try {
            String sql = " update TaiKhoan set Matkhau = ? where MaTK = ?";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tk.getMatKhau());
            ps.setString(2, ma);
=======
    public void update(String TaiKhoan, ViewModelTaiKhoan tk) {
        try {
            String sql = " update TaiKhoan set Matkhau = ? where TaiKhoan = ?";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tk.getMatKhau());
            ps.setString(2, TaiKhoan);
>>>>>>> 9b3ee9e9acf9d0bd035fa00613f483825c6744bb
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SQLException {
        System.out.println(getTK());
    }
}
