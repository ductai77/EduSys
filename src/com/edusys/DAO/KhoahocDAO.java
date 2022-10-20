
package com.edusys.DAO;

import com.edusys.entity.Khoahoc;
import com.edusys.entity.Nhanvien;
import com.edusys.utils.jDBChelper;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class KhoahocDAO extends EduSysDAO<Khoahoc, Integer>{
       String INSERT_SQL ="INSERT INTO Khoahoc(MaKH,MaCD,Hocphi,Thoiluong,NgayKG,Ghichu,Manv,Ngaytao) VALUES(?,?,?,?,?,?,?,?)";
       String UPDATE_SQL="UPDATE Khoahoc SET MaCD =?, Hocphi=?, Thoiluong=?, NgayKG=?,Ghichu=?,Manv=?,Ngaytao=? WHERE MaKH =?";
       String DELETE_SQL="DELETE FROM Khoahoc WHERE MaKH=?";
       String SELECT_ALL_SQL="SELECT * FROM Khoahoc";
       String SELECT_BY_ID_SQL ="SELECT * FROM Khoahoc WHERE MaKH=?";
    @Override
    public void insert(Khoahoc entity) {
          jDBChelper.update(INSERT_SQL, entity.getMaKH(),entity.getMaCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getNgayKG(), entity.getGhiChu()
                                        ,entity.getMaNV(),entity.getNgayTao());
    }

    @Override
    public void update(Khoahoc entity) {
         jDBChelper.update(UPDATE_SQL,entity.getMaCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getNgayKG(), entity.getGhiChu()
                                        ,entity.getMaNV(),entity.getNgayTao(), entity.getMaKH());
    }

    @Override
    public void delete(Integer id) {
        jDBChelper.update(DELETE_SQL,id);
    }

    @Override
    public Khoahoc selectByid(Integer id) {
        ArrayList<Khoahoc> list = this.selectBySql(SELECT_BY_ID_SQL,id);
       if(list.isEmpty()){
           return null;
       }
       return list.get(0);
    }

    @Override
    public ArrayList<Khoahoc> selectAll() {
      return this.selectBySql(SELECT_ALL_SQL);
    }
    public ArrayList<Khoahoc> selectByChuyenDe(String macd){
        return selectBySql("SELECT *FROM Khoahoc WHERE MaCD=?",macd);
        
    }
    public List<Integer> selectYear() {
        String sql = "select YEAR(NgayKG) from KhoaHoc  group by YEAR(NgayKG)";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = jDBChelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    protected ArrayList<Khoahoc> selectBySql(String sql, Object... args) {
       ArrayList<Khoahoc> list = new ArrayList<>();
        try {
            ResultSet rs =jDBChelper.query(sql, args);
            while(rs.next()){
                Khoahoc entity= new Khoahoc();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaCD(rs.getString("MaCD"));
                entity.setHocPhi(rs.getFloat("Hocphi"));
                entity.setThoiLuong(rs.getInt("Thoiluong"));
                entity.setNgayKG(rs.getDate("NgayKG"));
                entity.setGhiChu(rs.getString("Ghichu"));
                entity.setMaNV(rs.getString("Manv"));
                entity.setNgayTao(rs.getDate("Ngaytao"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
 
   
    
}
