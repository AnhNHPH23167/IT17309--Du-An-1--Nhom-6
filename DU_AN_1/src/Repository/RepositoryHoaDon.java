/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DoMain.HoaDon;
import Repository.RepositoryHoaDon;
import Utilites.DBConnect;
import ViewModel.HoaDonViewModel;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mngha
 */
public class RepositoryHoaDon{

    public  ArrayList<HoaDonViewModel> AllHoaDon() {
        ArrayList<HoaDonViewModel> listHD = new ArrayList<>();
        Connection conn = DBConnect.getConnection();
        if(conn != null){
        try {
            String query = "SELECT HoaDon.MaHoaDon, NhanVien.MaNhanVien, HoaDon.NgayTao, HoaDon.NgayThanhToan, HoaDon.ThanhTien, HoaDon.SDTKH, HoaDon.DiaChi, HoaDon.TrangThai\n" +
                    "FROM     HoaDon INNER JOIN\n" +
                    "                  NhanVien ON HoaDon.MaNhanVien = NhanVien.MaNhanVien";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next()){
                HoaDonViewModel hd = new HoaDonViewModel(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getDate(4),rs.getDouble(5),rs.getInt(6),rs.getString(7),rs.getInt(8));
                
            listHD.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
        return listHD;
    }
    public void insert(HoaDon hd){
        try {
            Connection conn = DBConnect.getConnection();
            String query = "INSERT INTO HoaDon "+"(MaHoaDon, MaNhanVien, NgayTao, NgayThanhToan, ThanhTien, SDTKH, DiaChi, TrangThai)"+"Values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, hd.getMaHoaDon());
            ps.setString(2, hd.getMaNhanVien());
            ps.setDate(3, new java.sql.Date(hd.getNgayTao().getTime()) );
            ps.setDate(4, new java.sql.Date(hd.getNgayThanhToan().getTime()));
            ps.setDouble(5, hd.getThanhTien());
            ps.setInt(6, hd.getSDTKH());
            ps.setString(7, hd.getDiaChi());
            ps.setInt(8, hd.getTrangThai());
            ps.execute();
            System.out.println("Thanh cong");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    public void update(String id,HoaDon hd) {
        try {
            Connection conn = DBConnect.getConnection();
            String query = "UPDATE HoaDon SET MaHoaDon=?, MaNhanVien=?, NgayTao=?, NgayThanhToan=?, ThanhTien=?, SDTKH=?, DiaChi=?, TrangThai=? WHERE MaHoaDon=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, hd.getMaHoaDon());
            ps.setString(2, hd.getMaNhanVien());
            ps.setDate(3, new java.sql.Date(hd.getNgayTao().getTime()) );
            ps.setDate(4, new java.sql.Date(hd.getNgayThanhToan().getTime()));
            ps.setDouble(5, hd.getThanhTien());
            ps.setInt(6, hd.getSDTKH());
            ps.setString(7, hd.getDiaChi());
            ps.setInt(8, hd.getTrangThai());
            
            ps.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    public void delete(String hd) {
        try {
            Connection conn = DBConnect.getConnection();
            String sql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
    }
}

