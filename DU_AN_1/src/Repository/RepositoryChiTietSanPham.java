/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DoMain.LoaiSP;
import DoMain.MauSac;
import DoMain.SanPham;
import DoMain.Size;
import Utilites.DBConnect;
import DoMain.ChatLieu;
import DoMain.ChiTietSanPham;
import DoMain.HoaDonCode;
import ViewModel.ViewModelChiTietSanPham;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class RepositoryChiTietSanPham {

    private static final Connection conn = DBConnect.getConnection();

    public static ArrayList<ChiTietSanPham> getCTSP() throws SQLException {
        ArrayList<ChiTietSanPham> listCTSP = new ArrayList<>();
        try {
            String sql = "select ChiTietSanPham.MaCTSP, SanPham.TenSanPham , MauSac.TenMauSac , Size.TenSize ,LoaiSP.TenLoaiSP, ChatLieu.TenChatLieu , ChiTietSanPham.SoLuong , ChiTietSanPham.GiaBan , ChiTietSanPham.Mota \n"
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
                String TenMauSac = rs.getString(3);
                String TenSize = rs.getString(4);
                String TenLoaiSP = rs.getString(5);
                String TenChatLieu = rs.getString(6);
                int Soluong = rs.getInt(7);
                double GiaBan = rs.getDouble(8);
                String MoTa = rs.getString(9);
                ChiTietSanPham view = new ChiTietSanPham(Masanpham, TenLoaiSP, TenMauSac, TenSanPham, TenSize, TenChatLieu, Soluong, GiaBan, MoTa);
                listCTSP.add(view);
            }

        } catch (SQLException e) {

            e.printStackTrace();

            throw e;

        }

        return listCTSP;
    }

    public static ArrayList<ViewModelChiTietSanPham> Search(String Ma) {
        ArrayList<ViewModelChiTietSanPham> listCTSP = new ArrayList<>();
        try {
            String sql = "	select ChiTietSanPham.MaCTSP , SanPham.TenSanPham , MauSac.TenMauSac , Size.TenSize ,LoaiSP.TenLoaiSP,ChatLieu.TenChatLieu, ChiTietSanPham.SoLuong , ChiTietSanPham.GiaBan , ChiTietSanPham.Mota \n"
                    + "		from ChiTietSanPham join SanPham on ChiTietSanPham.MaSanPham = SanPham.MaSanPham \n"
                    + "					join MauSac on ChiTietSanPham.MaMauSac = MauSac.MaMauSac\n"
                    + "					join LoaiSP on ChiTietSanPham.MaLoaiSP = LoaiSP.MaLoaiSP\n"
                    + "					join ChatLieu on ChiTietSanPham.MaChatLieu = ChatLieu.MaChatLieu\n"
                    + "					join Size on ChiTietSanPham.MaSize = Size.MaSize where MaCTSP = '001' ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(9, Ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                String TenSanPham = rs.getString(1);
                String TenMauSac = rs.getString(2);
                String TenSize = rs.getString(3);
                String TenLoaiSP = rs.getString(4);
                String TenChatLieu = rs.getString(5);
                int Soluong = rs.getInt(6);
                double GiaBan = rs.getDouble(7);
                String MoTa = rs.getString(8);
                SanPham sanPham = new SanPham("", TenSanPham);
                Size size = new Size("", TenSize);
                LoaiSP loaiSP = new LoaiSP("", TenLoaiSP);
                MauSac mauSac = new MauSac("", TenMauSac);
                ChatLieu chatlieu = new ChatLieu("", TenChatLieu);
                ViewModelChiTietSanPham view = new ViewModelChiTietSanPham("", sanPham, size, loaiSP, mauSac, chatlieu, Soluong, GiaBan, MoTa);
                listCTSP.add(view);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return listCTSP;
    }

    public static ArrayList<Size> getsize() throws SQLException {
        ArrayList<Size> listsize = new ArrayList<>();
        String sql = "select TenSize from Size";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {
            String Ten = rs.getString(1);
            Size size = new Size("", Ten);
            listsize.add(size);
        }
        return listsize;
    }

    public static ArrayList<MauSac> getMauSac() throws SQLException {
        ArrayList<MauSac> listMauSac = new ArrayList<>();
        String sql = "select MaMauSac,TenMauSac from MauSac";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {
            String Ma = rs.getString(1);
            String Ten = rs.getString(2);
            MauSac Mausac = new MauSac(Ma, Ten);
            listMauSac.add(Mausac);
        }
        return listMauSac;
    }

    public static ArrayList<SanPham> getSanPham() throws SQLException {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String sql = "select MaSanPham, TenSanPham from SanPham";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {
            String Ma = rs.getString(1);
            String Ten = rs.getString(2);
            SanPham sanpham = new SanPham(Ma, Ten);
            listSanPham.add(sanpham);
        }
        return listSanPham;
    }

    public static ArrayList<ChatLieu> getChatLieu() throws SQLException {
        ArrayList<ChatLieu> listChatLieu = new ArrayList<>();
        String sql = "select TenChatLieu from ChatLieu";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {
            String Ten = rs.getString(1);
            ChatLieu ChatLieu = new ChatLieu("", Ten);
            listChatLieu.add(ChatLieu);
        }
        return listChatLieu;
    }

    public static ArrayList<LoaiSP> getLoaiSP() throws SQLException {
        ArrayList<LoaiSP> listLoaiSP = new ArrayList<>();
        String sql = "select MaLoaiSP ,TenLoaiSP from LoaiSP";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {
            String Ma = rs.getString(1);
            String Ten = rs.getString(2);
            LoaiSP loaisp = new LoaiSP(Ma, Ten);
            listLoaiSP.add(loaisp);
        }
        return listLoaiSP;
    }

    public void insertCTSP(ViewModelChiTietSanPham CTSP) {
        try {
            String sql = "insert into ChiTietSanPham (MaCTSP, MaLoaiSP ,MaMauSac , MaSanPham , MaSize , MaChatLieu , Mota , SoLuong , GiaBan  ) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, CTSP.getMa());
            ps.setString(2, CTSP.getLoaiSP().getMaLoaiSP());
            ps.setString(3, CTSP.getMauSac().getMaMauSac());
            ps.setString(4, CTSP.getSanPham().getMaSanPham());
            ps.setString(5, CTSP.getSize().getMaSize());
            ps.setString(6, CTSP.getChatLieu().getMaChatLieu());
            ps.setString(7, CTSP.getMota());
            ps.setInt(8, CTSP.getSoluong());
            ps.setDouble(9, CTSP.getGiaban());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertSize(Size size) {
        try {
            String sql = "insert into Size (MaSize,TenSize) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, size.getMaSize());
            ps.setString(2, size.getTenSize());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertLoaiSP(LoaiSP LoaiSP) {
        try {
            String sql = "insert into LoaiSP (MaLoaiSP,TenLoaiSP) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, LoaiSP.getMaLoaiSP());
            ps.setString(2, LoaiSP.getTenLoaiSP());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertSP(SanPham sp) {
        try {
            String sql = "insert into SanPham (MaSanPham,TenSanPham) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMaSanPham());
            ps.setString(2, sp.getTenSanPham());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertMauSac(MauSac MauSac) {
        try {
            String sql = "insert into MauSac (MaMauSac,TenMauSac) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MauSac.getMaMauSac());
            ps.setString(2, MauSac.getTenMauSac());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertChatLieu(ChatLieu ChatLieu) {
        try {
            String sql = "insert into ChatLieu (MaChatLieu,TenChatLieu) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ChatLieu.getMaChatLieu());
            ps.setString(2, ChatLieu.getTenChatLieu());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSP(String Ma, SanPham sp) {
        try {
            String sql = "update SanPham set TenSanPham = ? Where MaSanPham = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getTenSanPham());
            ps.setString(2, Ma);
            ps.execute();
        } catch (Exception e) {
        }
    }

    public void deleteSP(String Ma) {
        try {
            String sql = "delete from SanPham Where MaSanPham = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Ma);
            ps.execute();
        } catch (Exception e) {
        }
    }

    public void deleteLoaiSP(String Ma) {
        try {
            String sql = "delete from LoaiSP where MaLoaiSP = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Ma);
            ps.execute();
        } catch (Exception e) {
        }
    }

    public void deleteMauSac(String Ma) {
        try {
            String sql = "delete from MauSac Where MaMauSac = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Ma);
            ps.execute();
        } catch (Exception e) {
        }
    }

    public void updateCTSP(String Ma, ViewModelChiTietSanPham ctsp) {
        try {
            String sql = "update ChiTietSanPham set Mota = ? , SoLuong = ? , GiaBan = ? where MaCTSP = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ctsp.getMota());
            ps.setInt(2, ctsp.getSoluong());
            ps.setDouble(3, ctsp.getGiaban());
            ps.setString(4, Ma);
            ps.execute();
        } catch (Exception e) {
        }
    }

    public void updateLoaiSP(String ma, LoaiSP LoaiSP) {
        try {
            String sql = "update LoaiSP set TenLoaiSP = ? where MaLoaiSP = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, LoaiSP.getTenLoaiSP());
            ps.setString(2, ma);
            ps.execute();
        } catch (Exception e) {
        }
    }

    public ArrayList<HoaDonCode> getHoaDonCode() throws SQLException {
        ArrayList<HoaDonCode> list = new ArrayList<>();
        String sql = "select MaHoaDon ,NgayTao , NgayThanhToan , NhanVien.MaNhanVien from HoaDon join NhanVien on HoaDon.MaHoaDon = NhanVien.MaNhanVien";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next() == true) {
            String MaHD = rs.getString(1);
            String NgayTao = rs.getString(2);
            String NgayThanhToan = rs.getString(3);
            String MaNV = rs.getString(4);
            HoaDonCode hf = new HoaDonCode(MaHD, NgayTao, NgayThanhToan, MaNV);
            list.add(hf);
        }
        return list;
    }

    public void updateMauSac(String ma, MauSac mauSac) {
        try {
            String sql = "update MauSac set TenMauSac = ? where MaMauSac = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mauSac.getTenMauSac());
            ps.setString(2, ma);
            ps.execute();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws SQLException {
//        System.out.println(new RepositoryChiTietSanPham().getsize());
//        System.out.println(new RepositoryChiTietSanPham().getMauSac());
//        System.out.println(new RepositoryChiTietSanPham().getCTSP());
//        System.out.println(new RepositoryChiTietSanPham().getCTSP());
//        System.out.println(new RepositoryChiTietSanPham().getChatLieu());
//        System.out.println(new RepositoryChiTietSanPham().getLoaiSP());
//        System.out.println(new RepositoryChiTietSanPham().getSanPham());
        System.out.println(new RepositoryChiTietSanPham().getHoaDonCode().toString());

    }
}
