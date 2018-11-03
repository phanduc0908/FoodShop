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
public class HoaDon {
    private String hid;
    private String date;
    private int cid;
    private String Rcname, Raddress, Rphone;
    private double total;
    private int status;

    public HoaDon() {
    }

    public HoaDon(String hid, String date, int cid, String Rcname, String Raddress, String Rphone, double total, int status) {
        this.hid = hid;
        this.date = date;
        this.cid = cid;
        this.Rcname = Rcname;
        this.Raddress = Raddress;
        this.Rphone = Rphone;
        this.total = total;
        this.status = status;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getRcname() {
        return Rcname;
    }

    public void setRcname(String Rcname) {
        this.Rcname = Rcname;
    }

    public String getRaddress() {
        return Raddress;
    }

    public void setRaddress(String Raddress) {
        this.Raddress = Raddress;
    }

    public String getRphone() {
        return Rphone;
    }

    public void setRphone(String Rphone) {
        this.Rphone = Rphone;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
