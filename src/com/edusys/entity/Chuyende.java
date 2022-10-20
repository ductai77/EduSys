
package com.edusys.entity;


public class Chuyende {
   private String maCD;
   String TenCD;
   float Hocphi;
   int Thoiluong;
   String Hinh;
   String Mota;

    public Chuyende() {
    }

    public Chuyende(String maCD, String TenCD, float Hocphi, int Thoiluong, String Hinh, String Mota) {
        this.maCD = maCD;
        this.TenCD = TenCD;
        this.Hocphi = Hocphi;
        this.Thoiluong = Thoiluong;
        this.Hinh = Hinh;
        this.Mota = Mota;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String MaCD) {
        this.maCD= MaCD;
    }

    public String getTenCD() {
        return TenCD;
    }

    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
    }

    public float getHocphi() {
        return Hocphi;
    }

    public void setHocphi(float Hocphi) {
        this.Hocphi = Hocphi;
    }

    public int getThoiluong() {
        return Thoiluong;
    }

    public void setThoiluong(int Thoiluong) {
        this.Thoiluong = Thoiluong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return this.TenCD;
    }
    

    @Override
    public boolean equals(Object obj) {
        Chuyende other=(Chuyende) obj;
        return other.getMaCD().equals(this.getMaCD());
    }
   
   
}
