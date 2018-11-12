/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.KhachHang;
import entity.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Hiep
 */
public class DAOSanPham {

    DBConnection dbConn;
    Connection conn;

    public DAOSanPham(DBConnection dbConn) throws Exception {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }

    // Get all products name
    public ArrayList<String> listProductName() {
        ArrayList<String> list = new ArrayList<>();
        String query = "Select hname from HangSanXuat where status = 1";
        return list;
    }

    public int getCurrentQuantity(String sid) {
        int n = 0;
        String query = "Select * from SanPham where sid = '" + sid + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                n = rs.getInt("quantity");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public void UpdateQuantity(int quantity, String sid) {
        String sql = "update SanPham set quantity=" + quantity + " where sid='" + sid + "'";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);

            pre.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int AddSanPham(SanPham obj) {
        int n = 0;
        String query = "Insert into SanPham(sid,sname, quantity,price, picture,description,hid)"
                + " values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, obj.getSid());
            ps.setString(2, obj.getSname());
            ps.setInt(3, obj.getQuantity());
            ps.setDouble(4, obj.getPrice());
            ps.setString(5, obj.getPicture());
            ps.setString(6, obj.getDescription());
            ps.setInt(7, obj.getHid());
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }

    public int updateSanPham(SanPham obj) {
        int n = 0;
        String query = "update SanPham set sname = ?, quantity = ?,price = ?,picture = ?, description = ? where sid = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, obj.getSname());
            ps.setInt(2, obj.getQuantity());
            ps.setDouble(3, obj.getPrice());
            ps.setString(4, obj.getPicture());
            ps.setString(5, obj.getDescription());
            ps.setString(6, obj.getSid());
            n = ps.executeUpdate();
        } catch (Exception e) {
        }
        return n;
    }

    public int changeStatus(String sname, int status) {
        int n = 0;
        String query = "update SanPham set status = " + (status == 1 ? 0 : 1) + "where username ='" + sname + "'";
        return n;
    }

    public int removeSanPham(String sid) {
        int n = 0;
        String query = "Delete from SanPham where sid = '" + sid + "'";
        try {
            Statement st = conn.createStatement();
            n = st.executeUpdate(query);
        } catch (Exception e) {
        }
        return n;
    }
    public static void main(String[] args) {
        try {
            DBConnection dbCon = new DBConnection();
            DAOSanPham dao = new DAOSanPham(dbCon);
            System.out.println(dao.removeSanPham("sdf"));
        } catch (Exception ex) {
            Logger.getLogger(DAOSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

