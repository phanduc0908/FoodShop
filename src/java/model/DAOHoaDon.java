/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Phan Van Duc
 */
public class DAOHoaDon {
    DBConnection dbConn;
    Connection conn;

    public DAOHoaDon(DBConnection dbConn) throws Exception {
        this.dbConn = dbConn;
        conn= dbConn.getConnection();
    }
        public int updateInforHoaDon(HoaDon obj) {
        int n = 0;
        String sql = "update HoaDon set date=?,Rcname=?,Raddress=?, Rphone = ?, total = ? where hid=?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, obj.getDate());
            pre.setString(2, obj.getRcname());
            pre.setString(3, obj.getRaddress());
            pre.setString(4, obj.getRphone());
            pre.setDouble(5, obj.getTotal());
            pre.setString(6, obj.getHid());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return n;
    }
}
