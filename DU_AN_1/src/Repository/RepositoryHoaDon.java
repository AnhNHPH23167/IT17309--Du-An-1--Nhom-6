package Repository;

import Utilites.DBConnect;
import ViewModel.HoaDon;
import java.sql.*;
import java.util.ArrayList;

public class RepositoryHoaDon {

    private static final Connection conn = DBConnect.getConnection();

    public void add(HoaDon hd) throws SQLException {
        String sql = "insert into HoaDon (MaHoaDon,NgayTao,TrangThai) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, hd.getMa());
        ps.setString(2, hd.getNgayTao());
        ps.setInt(3, hd.getTrangThai());
        ps.execute();
    }

    public static ArrayList<HoaDon> getHD() throws SQLException {
        ArrayList<HoaDon> listhd = new ArrayList<>();
        String sql = "select MaHoaDon , NgayTao ,TrangThai from HoaDon \n";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {
            String Ma = rs.getString(1);
            String NgayTao = rs.getString(2);
            int TrangThai = rs.getInt(3);
            HoaDon HD = new HoaDon(Ma, NgayTao, TrangThai);
            listhd.add(HD);
        }
        return listhd;
    }

    public void updateTrangThai(String Ma, HoaDon hd) throws SQLException {
        String sql = "update HoaDon set TrangThai = ? where MaHoaDon = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, hd.getTrangThai());
        ps.setString(2, Ma);
        ps.execute();
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(new RepositoryHoaDon().getHD().toString());
    }
}
