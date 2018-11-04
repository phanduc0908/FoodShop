/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Phan Van Duc
 */
public class ProductPaging {

    public ArrayList<SanPham> pagging(int pageSize, int pageIndex) throws Exception {
        Connection conn = new DBContext().getConnection();
        ArrayList<SanPham> products = new ArrayList<>();

        String sql = "select * from (\n"
                + "    select ROW_NUMBER() over (order by ID ASC) as rn, *\n"
                + "    from SanPham\n"
                + ") as x\n"
                + "where rn between (?-1)*? + 1 "
                + "and ?*?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageIndex);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                
                sp.setSid(rs.getString("sid"));
                sp.setSname(rs.getString("sname"));
                sp.setQuantity(rs.getInt("quantity"));
                sp.setPrice(rs.getDouble("price"));
                sp.setPicture(rs.getString("picture"));
                sp.setDescription(rs.getString("description"));
                sp.setStatus(rs.getInt("status"));
                sp.setHid(rs.getInt("hid"));
                
                products.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
