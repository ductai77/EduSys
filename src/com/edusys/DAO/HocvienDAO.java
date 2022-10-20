
package com.edusys.DAO;

import com.edusys.entity.Hocvien;
import com.edusys.entity.Nhanvien;
import com.edusys.utils.jDBChelper;
import java.util.ArrayList;
import java.sql.ResultSet;

public class HocvienDAO extends EduSysDAO<Hocvien, Integer>{
    String INSERT_SQL ="INSERT INTO Hocvien(MaKH,MaNH,Diem) VALUES(?,?,?)";
       String UPDATE_SQL="UPDATE Hocvien SET MaKH =?, MaNH=?, Diem=? WHERE MaHV =?";
       String DELETE_SQL="DELETE FROM Hocvien WHERE MaHV=?";
       String SELECT_ALL_SQL="SELECT * FROM Hocvien";
       String SELECT_BY_ID_SQL ="SELECT * FROM Hocvien WHERE MaHV=?";
    @Override
    public void insert(Hocvien entity) {
         jDBChelper.update(INSERT_SQL,entity.getMaKh(),entity.getMaNH(),entity.getDiem());
    }

    @Override
    public void update(Hocvien entity) {
        jDBChelper.update(UPDATE_SQL,entity.getMaKh(),entity.getMaNH(),entity.getDiem(), entity.getMaHV());
    }

    @Override
    public void delete(Integer id) {
        jDBChelper.update(DELETE_SQL, id);
    }

    @Override
    public Hocvien selectByid(Integer id) {
          ArrayList<Hocvien> list = this.selectBySql(SELECT_BY_ID_SQL,id);
       if(list.isEmpty()){
           return null;
       }
       return list.get(0);
    }

    @Override
    public ArrayList<Hocvien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ArrayList<Hocvien> selectBySql(String sql, Object... args) {
        ArrayList<Hocvien> list = new ArrayList<>();
        try {
            ResultSet rs =jDBChelper.query(sql, args);
            while(rs.next()){
                Hocvien entity= new Hocvien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKh(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getFloat("Diem"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Hocvien> selectByKhoahoc(int MaKH){
        String sql= "SELECT * FROM Hocvien WHERE MaKH =?";
        return this.selectBySql(sql,MaKH);
    }
    public void updatediem(Hocvien entity) {
        jDBChelper.update("update HocVien set Diem=? where MaHV=?",entity.getDiem(), entity.getMaHV());
    }
    
}
