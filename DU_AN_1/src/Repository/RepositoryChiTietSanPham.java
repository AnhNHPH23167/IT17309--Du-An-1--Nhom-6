/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ViewModel.ViewModelLoaiSP;
import ViewModel.ViewModelMauSac;
import ViewModel.ViewModelSanPham;
import ViewModel.ViewModelSize;
import Utilites.DBConnect;
import ViewModel.ViewModelChiTietSanPham;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class RepositoryChiTietSanPham {

    public static ArrayList<ViewModelChiTietSanPham> getCTSP() throws SQLException {
        ArrayList<ViewModelChiTietSanPham> listCTSP = new ArrayList<>();
        try {
            Connection conn = DBConnect.getConnection();
            String sql = "select SanPham.MaSanPham , SanPham.TenSanPham , Size.TenSize ,LoaiSP.TenLoaiSP, MauSac.TenMauSac, ChiTietSanPham.SoLuong , ChiTietSanPham.GiaBan , ChiTietSanPham.Mota \n"
                    + "from ChiTietSanPham join SanPham on ChiTietSanPham.MaSanPham = SanPham.MaSanPham \n"
                    + "					join MauSac on ChiTietSanPham.MaMauSac = MauSac.MaMauSac\n"
                    + "					join LoaiSP on ChiTietSanPham.MaLoaiSP = LoaiSP.MaLoaiSP\n"
                    + "					join ChatLieu on ChiTietSanPham.MaChatLieu = ChatLieu.MaChatLieu\n"
                    + "					join Size on ChiTietSanPham.MaSize = Size.MaSize";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String Masanpham = rs.getString(1);
                String TenSanPham = rs.getString(2);
                String TenSize = rs.getString(3);
                String TenLoaiSP = rs.getString(4);
                String TenMauSac = rs.getString(5);
                int Soluong = rs.getInt(6);
                double GiaBan = rs.getDouble(7);
                String MoTa = rs.getString(8);
                ViewModelSanPham sanPham = new ViewModelSanPham(TenSanPham);
                ViewModelSize size = new ViewModelSize(TenSize);
                ViewModelLoaiSP loaiSP = new ViewModelLoaiSP(TenLoaiSP);
                ViewModelMauSac mauSac = new ViewModelMauSac(TenMauSac);
                ViewModelChiTietSanPham view = new ViewModelChiTietSanPham(Masanpham, sanPham, size, loaiSP, mauSac, Soluong, GiaBan, MoTa);
                listCTSP.add(view);
            }

        } catch (SQLException e) {

            e.printStackTrace();

            throw e;

        }

        return listCTSP;
    }
    public static void main(String[] args) throws SQLException {
        System.out.println(new RepositoryChiTietSanPham().getCTSP());
        
    }
}
