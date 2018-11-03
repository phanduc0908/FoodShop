/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DAOKhachHang {

    DBConnection dbCon;
    Connection conn;

    public DAOKhachHang(DBConnection dbcon) {
        this.dbCon = dbcon;
        conn = dbcon.getConnection();
    }

    public boolean login(String userName, String pass) {
        String sql = "Select * from KhachHang where username=? and"
                + " password = ? and status=1";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, userName);
            pre.setString(2, pass);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public int addKhachHang(KhachHang obj) {
        int n = 0;
        String sql = "Insert into KhachHang(cname,address,phone,username,password)"
                + " values(?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, obj.getCname());
            pre.setString(2, obj.getAddress());
            pre.setString(3, obj.getPhone());
            pre.setString(4, obj.getUsername());
            pre.setString(5, obj.getPassword());
            n = pre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int updateInforKhachHang(KhachHang obj) {
        int n = 0;
        String sql = "update KhachHang set cname=?,address=?,phone=?,status=? where cid=?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, obj.getCname());
            pre.setString(2, obj.getAddress());
            pre.setString(3, obj.getPhone());
            pre.setInt(4, obj.getStatus());
            pre.setInt(5, obj.getCid());
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;
    }

    public int changePassword(String userName, String oldPass, String newPass) {
        int n = 0;
        String sql = "select * from KhachHang where username='" + userName + "' "
                + " and password='" + oldPass + "'";
        ResultSet rs = dbCon.getData(sql);
        try {
            if (rs.next()) {
                String sqlUpdate = "update KhachHang set password=? where username=?";
                PreparedStatement pre = conn.prepareStatement(sqlUpdate);
                pre.setString(1, newPass);
                pre.setString(2, userName);
                n = pre.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        return n;

    }

    public int changeStatus(String userName, int status) {
        int n = 0;
        String sql = "update KhachHang set status=" + (status == 1 ? 0 : 1) + " where username='" + userName + "'";

        return n;

    }

    public int removeKhachHang(int id) {
        int n = 0;
        String sql = "Select * from KhachHang as a join HoaDon as b "
                + " on a.cid=b.cid ";
        ResultSet rs = dbCon.getData(sql);
        try {
            if (rs.next()) {
                changeStatus(rs.getString("username"), rs.getInt("status"));
            } else {
                String sqlDelete = "delete from KhachHang where cid=" + id;
                Statement state = conn.createStatement();
                state.executeUpdate(sqlDelete);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public boolean isDuplicateUser(String username){
        String query = "SELECT * FROM KhachHang WHERE username=" + username;
        ResultSet rs = dbCon.getData(query);
        try {
            if(rs.next()){
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        DBConnection dbcon = new DBConnection();
        //KhachHang kh = new KhachHang("Ngo Hai Anh", "Nam Dinh", "0983654187", "anhnhse", "123654");
        DAOKhachHang dao = new DAOKhachHang(dbcon);
        //dao.addKhachHang(kh);
        System.out.println(dao.login("haihn", "hai123"));
    }
}
