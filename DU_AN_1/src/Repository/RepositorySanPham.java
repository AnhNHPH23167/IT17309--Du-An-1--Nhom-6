/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utilites.DBConnect;
import ViewModel.ChiTietSanPham;
import ViewModel.ViewModelChiTietSanPham;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class RepositorySanPham {

    private static final Connection conn = DBConnect.getConnection();

    public static ArrayList<ChiTietSanPham> CTSP() throws SQLException {
        ArrayList<ChiTietSanPham> list = new ArrayList<>();
        String sql = "select MaCTSP,SanPham.TenSanPham,SoLuong,GiaBan from ChiTietSanPham join SanPham on ChiTietSanPham.MaSanPham = SanPham.MaSanPham";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {

            String Ma = rs.getString(1);
            String ten = rs.getString(2);
            int Soluong = rs.getInt(3);
            double GiaBan = rs.getDouble(4);
            ChiTietSanPham ctsp = new ChiTietSanPham(Ma, ten, Soluong, GiaBan);
            list.add(ctsp);
        }
        return list;
    }

    private void insertHd() {

    }

    public static void main(String[] args) {
        try {
            System.out.println(new RepositorySanPham().CTSP().toString());
        } catch (SQLException ex) {
        }
    }
}
