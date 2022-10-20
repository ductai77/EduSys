
package com.edusys.entity;

import java.util.Date;


public class Nguoihoc {
   String MaNH;
   String Hoten;
   Date Ngaysinh;
   Boolean Gioitinh;
   String Sodt;
   String Email;
   String Ghichu;
   String Manv;
   Date NgayDK;

    public Nguoihoc() {
    }

    public Nguoihoc(String MaNH, String Hoten, Date Ngaysinh, Boolean Gioitinh, String Sodt, String Email, String Ghichu, String Manv, Date NgayDK) {
        this.MaNH = MaNH;
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
        this.Sodt = Sodt;
        this.Email = Email;
        this.Ghichu = Ghichu;
        this.Manv = Manv;
        this.NgayDK = NgayDK;
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public Boolean getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(Boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getSodt() {
        return Sodt;
    }

    public void setSodt(String Sodt) {
        this.Sodt = Sodt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public Date getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    @Override
    public String toString() {
        return this.Hoten;
    }
   
   
}
