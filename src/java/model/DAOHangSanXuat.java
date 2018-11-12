/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.HangSanXuat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NhatTQ
 */
public class DAOHangSanXuat {

    DBConnection dbConn;
    Connection conn;

    public DAOHangSanXuat(DBConnection dbConn) throws Exception {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }

    
    public int addHangSanXuat(HangSanXuat obj) {
        int n = 0;
        String query = "insert into HangSanXuat (hname, website)"
                + " values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, obj.getHname());
            ps.setString(2, obj.getWebsite());
            n = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return n;
    }

    public int updateHangSanXuat(HangSanXuat obj) {
        int n = 0;
        String query = "update HangSanXuat set hname = ?, website = ?, status = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, obj.getHname());
            ps.setString(2, obj.getWebsite());
            ps.setInt(3, obj.getStatus());
            n = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return n;
    }

    public int changeStatus(String hname, int status) {
        int n = 0;
        String query = "update HangSanXuat set status = " + (status == 1 ? 0 : 1) + " where hname = " + hname;
        return n;
    }

    public int removeHangSanXuat(int id) {
        int n = 0;
        String query = "Select *from HangSanXuat as s join Sanpham as b"
                + " on a.hid = b.sid";
        ResultSet rs = dbConn.getData(query);
        try {
            if (rs.next()) {
                changeStatus(rs.getString("hname"), rs.getInt("status"));
            } else {
                String sqlDelete = "delete from HangSanXuat where hid =" + id;
                Statement st = conn.createStatement();
                st.executeUpdate(sqlDelete);
            }
        } catch (Exception e) {
        }
        return n;
    }
}
