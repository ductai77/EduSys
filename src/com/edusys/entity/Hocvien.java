
package com.edusys.entity;


public class Hocvien {
    int MaHV;
    int MaKh;
    String MaNH;
    float Diem=-1;

    public Hocvien() {
    }

    public Hocvien(int MaHV, int MaKh, String MaNH) {
        this.MaHV = MaHV;
        this.MaKh = MaKh;
        this.MaNH = MaNH;
        
    }

    public int getMaHV() {
        return MaHV;
    }

    public void setMaHV(int MaHV) {
        this.MaHV = MaHV;
    }

    public int getMaKh() {
        return MaKh;
    }

    public void setMaKh(int MaKh) {
        this.MaKh = MaKh;
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float diem) {
        this.Diem = diem;
    }

    @Override
    public String toString() {
        return this.MaNH; //To change body of generated methods, choose Tools | Templates.
    }

    

   
    
    
}
