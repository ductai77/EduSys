
package com.edusys.DAO;

import java.util.ArrayList;
import com.edusys.utils.jDBChelper;
import java.sql.*;


public class ThongkeDAO {
    private ArrayList <Object[]> getListofArrayList(String sql,String[] cols,Object...args){
        try {
            ArrayList<Object[]> list =new ArrayList<>();
            ResultSet rs =jDBChelper.query(sql,args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0;i<cols.length;i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
 
    }
    public ArrayList<Object[]> getBangdiem(Integer MaKH){
        String sql="{CALL sp_Bangdiem(?)}";
        String[] cols={"MaNH","Hoten","Diem"};
        return this.getListofArrayList(sql,cols,MaKH);
    }
    public ArrayList<Object[]> getLuongNguoiHoc(){
        String sql="{CALL sp_ThongKeNguoiHoc}";
        String[] cols={"Nam","Soluong","DauTien","CuoiCung"};
        return this.getListofArrayList(sql,cols);
    }
    public ArrayList<Object[]> getDiemChuyenDe(){
        String sql="{CALL sp_ThongKeDiem}";
        String[] cols={"ChuyenDe","SoHV","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListofArrayList(sql,cols);
    }
    public ArrayList<Object[]> getDoanhThu(Integer nam){
        String sql="{CALL sp_ThongKeDoanhThu(?)}";
        String[] cols={"ChuyenDe","SoKH","SoHV","Doanhthu","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListofArrayList(sql,cols,nam);
    }
    
}
