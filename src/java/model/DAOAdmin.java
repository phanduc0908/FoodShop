/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phan Van Duc
 */
public class DAOAdmin {

    DBConnection dbCon;
    Connection conn;

    public DAOAdmin(DBConnection dbCon) {
        this.dbCon = dbCon;
        conn = dbCon.getConnection();
    }

    public boolean login(String username, String password) {
        String sql = "Select * from admin where username=? and"
                + " password = ? and status=1";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
}
