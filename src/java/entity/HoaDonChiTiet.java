/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Phan Van Duc
 */
public class HoaDonChiTiet {
    private String hid, sid;
    private int quantity;
    private double price;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String hid, String sid, int quantity, double price) {
        this.hid = hid;
        this.sid = sid;
        this.quantity = quantity;
        this.price = price;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
