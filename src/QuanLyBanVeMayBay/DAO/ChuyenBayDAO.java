/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.DAO;

import QuanLyBanVeMayBay.DTO.ChuyenBay;
import QuanLyBanVeMayBay.DTO.MayBay;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thepi314
 */
public class ChuyenBayDAO {

    

    public ArrayList<ChuyenBay> getListChuyenBay() {
        try {
            String sql = "SELECT * FROM chuyenbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<ChuyenBay> dscb = new ArrayList<>();
            while (rs.next()) {
                ChuyenBay cb = new ChuyenBay();
                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setSoLgVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));
                dscb.add(cb);
            }
            return dscb;
        } catch (SQLException e) {
        }

        return null;
    }

    public ChuyenBay getChuyenBay(int ma) {
        try {
            String sql = "SELECT * FROM chuyenbay WHERE maChuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                ChuyenBay cb = new ChuyenBay();

                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setSoLgVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));

                return cb;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<ChuyenBay> getChuyenBayTheoTuyenBay(int maTuyenBay) {
        try {
            String sql = "SELECT * FROM chuyenbay WHERE maTuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maTuyenBay);
            ResultSet rs = pre.executeQuery();
            ArrayList<ChuyenBay> dscb = new ArrayList<>();
            while (rs.next()) {
                ChuyenBay cb = new ChuyenBay();

                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setSoLgVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));

                dscb.add(cb);
            }
            return dscb;
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<ChuyenBay> getChuyenBayTheoMayBay(int maMayBay) {
        try {
            String sql = "SELECT * FROM chuyenbay WHERE maMayBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maMayBay);
            ResultSet rs = pre.executeQuery();
            ArrayList<ChuyenBay> dscb = new ArrayList<>();
            while (rs.next()) {
                ChuyenBay cb = new ChuyenBay();
                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setSoLgVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));

                dscb.add(cb);
            }
            return dscb;
        } catch (SQLException e) {
        }

        return null;
    }

    // public String getAnh(int ma) {
    // try {
    // String sql = "SELECT HinhAnh FROM ChuyenBay WHERE MaSP=?";
    // PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    // pre.setInt(1, ma);
    // ResultSet rs = pre.executeQuery();
    // if (rs.next()) {
    // return rs.getDate("HinhAnh");
    // }
    // } catch (SQLException e) {
    // }
    // return "";
    // }
    public void capNhatSoLuongVe(int maChuyenBay, int soLuongMat) {
        ChuyenBay cb = getChuyenBay(maChuyenBay);
        int soLuongVe = cb.getSoLgVeCL();
        cb.setSoLgVeCL(soLuongVe - soLuongMat);
        try {
            String sql = "UPDATE chuyenbay SET soLgVeCL=? WHERE maChuyenBay=" + maChuyenBay;
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, cb.getSoLgVeCL());
            pre.executeUpdate();
        } catch (SQLException e) {
        }

    }

    public boolean themChuyenBay(ChuyenBay cb) {
        boolean check = false;
        try {
            MayBayDAO mbDAO = new MayBayDAO();
            MayBay mb = mbDAO.getMayBay(cb.getMaMayBay());
            String sql = "INSERT INTO chuyenbay (maChuyenBay, maTuyenBay, maMayBay, soLgVeCL, ngayCatCanh, ngayHaCanh) "
                    + "VALUES (NULL,?,?,?,?,?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, cb.getMaTuyenBay());
            pre.setInt(2, cb.getMaMayBay());
            pre.setInt(3, mb.getSoLuongGhe());
            pre.setString(4, cb.getNgayCatCanh());
            pre.setString(5, cb.getNgayHaCanh());
            check = pre.executeUpdate() > 0;
            return check;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean nhapChuyenBayTuExcel(ChuyenBay cb) {
        try {
            String sql = "DELETE * FROM chuyenbay; "
                    + "INSERT INTO chuyenbay(maTuyenBay, maMayBay, soLgVeCL, ngayCatCanh, ngayHaCanh) "
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, cb.getMaTuyenBay());
            pre.setInt(2, cb.getMaMayBay());
            pre.setInt(3, cb.getSoLgVeCL());
            pre.setString(4, cb.getNgayCatCanh());
            pre.setString(5, cb.getNgayHaCanh());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean xoaChuyenBay(int maChuyenBay) {
        boolean check = false;
        try {
            String sql = "DELETE FROM chuyenbay WHERE maChuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maChuyenBay);
            check = pre.executeUpdate() > 0;
            return check;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaChuyenBay(ChuyenBay cb) {
        boolean check = false;
        try {
            String sql = "UPDATE chuyenbay SET "
                    + "maTuyenBay=?, "
                    + "maMayBay=?, soLgVeCL=?, ngayCatCanh=?, ngayHaCanh=? "
                    + "WHERE maChuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, cb.getMaTuyenBay());
            pre.setInt(2, cb.getMaMayBay());
            pre.setInt(3, cb.getSoLgVeCL());
            pre.setString(4, cb.getNgayCatCanh());
            pre.setString(5, cb.getNgayHaCanh());
            pre.setInt(6, cb.getMaChuyenBay());
            check = pre.executeUpdate() > 0;
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
