
package com.edusys.DAO;

import com.edusys.entity.Chuyende;
import com.edusys.entity.Nhanvien;
import com.edusys.utils.jDBChelper;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;


public class ChuyendeDAO extends EduSysDAO<Chuyende, String>{
       String INSERT_SQL ="INSERT INTO Chuyende(MaCD,TenCD,Thoiluong,Hocphi,Hinh,Mota) VALUES(?,?,?,?,?,?)";
       String UPDATE_SQL="UPDATE Chuyende SET TenCD =?, Hocphi=?, Thoiluong=?, Hinh=?,Mota=? WHERE MaCD =?";
       String DELETE_SQL="DELETE FROM Chuyende WHERE MaCD=?";
       String SELECT_ALL_SQL="SELECT * FROM Chuyende";
       String SELECT_BY_ID_SQL ="SELECT * FROM Chuyende WHERE MaCD=?";
    @Override
    public void insert(Chuyende entity) {
          jDBChelper.update(INSERT_SQL, entity.getMaCD(),entity.getTenCD(),entity.getThoiluong(),entity.getHocphi(),entity.getHinh(),entity.getMota());
    }

    @Override
    public void update(Chuyende entity) {
           jDBChelper.update(UPDATE_SQL ,entity.getTenCD(),entity.getThoiluong(),entity.getHocphi(),entity.getHinh(),entity.getMota(),entity.getMaCD());
    }

    @Override
    public void delete(String id) {
       jDBChelper.update(DELETE_SQL, id);
    }

    @Override
    public Chuyende selectByid(String id) {
        ArrayList<Chuyende> list = this.selectBySql(SELECT_BY_ID_SQL,id);
       if(list.isEmpty()){
           return null;
       }
       return list.get(0);
    }

    @Override
    public ArrayList<Chuyende> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected ArrayList<Chuyende> selectBySql(String sql, Object... args) {
        ArrayList<Chuyende> list = new ArrayList<>();
        try {
            ResultSet rs =jDBChelper.query(sql, args);
            while(rs.next()){
                Chuyende entity= new Chuyende();    
                entity.setMaCD(rs.getString("MaCD"));
                entity.setTenCD(rs.getString("TenCD"));
                entity.setHocphi(rs.getFloat("Hocphi"));
                entity.setThoiluong(rs.getInt("Thoiluong"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMota(rs.getString("Mota"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e); 
        }
      
    }
        public Chuyende selectByTenCD(String id) {
                List<Chuyende> list = selectBySql("Select * from ChuyenDe where TenCD = ?", id);
                if (list.isEmpty()) {
                    return null;
                } 
                return list.get(0);
            }
    
    

    
    
    

}
