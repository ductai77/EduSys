
package com.edusys.entity;


public class Nhanvien {
   String Manv;
   String Matkhau;
   String Hoten;
   Boolean vaitro;

    public Nhanvien() {
    }

    public Nhanvien(String Manv, String Matkhau, String Hoten, Boolean vaitro) {
        this.Manv = Manv;
        this.Matkhau = Matkhau;
        this.Hoten = Hoten;
        this.vaitro = vaitro;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Boolean getVaitro() {
        return vaitro;
    }

    public void setVaitro(Boolean vaitro) {
        this.vaitro = vaitro;
    }

    @Override
    public String toString() {
        return this.Hoten;
    }
    
   
}
