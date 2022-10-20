
package com.edusys.DAO;

import com.edusys.entity.Nguoihoc;
import com.edusys.utils.jDBChelper;
import java.util.ArrayList;
import java.sql.ResultSet;


public class NguoihocDAO extends EduSysDAO<Nguoihoc, String>{
       String INSERT_SQL ="INSERT INTO Nguoihoc(MaNH,Hoten,Gioitinh,Ngaysinh,Dienthoai,Email,Ghichu,MaNV,NgayDK) VALUES(?,?,?,?,?,?,?,?,?)";
       String UPDATE_SQL="UPDATE Nguoihoc SET Hoten=?,Gioitinh=? ,Ngaysinh=?,Dienthoai=?,Email=?,Ghichu=?,MaNV=?,NgayDK=? WHERE MaNH =?";
       String DELETE_SQL="DELETE FROM Nguoihoc WHERE MaNH=?";
       String SELECT_ALL_SQL="SELECT * FROM Nguoihoc";
       String SELECT_BY_ID_SQL ="SELECT * FROM Nguoihoc WHERE MaNH=?";
    @Override
    public void insert(Nguoihoc entity) {
        jDBChelper.update(INSERT_SQL,entity.getMaNH(),entity.getHoten(),entity.getGioitinh(),entity.getNgaysinh(),entity.getSodt(),entity.getEmail(),
                entity.getGhichu(),entity.getManv(),entity.getNgayDK());
    }

    @Override
    public void update(Nguoihoc entity) {
        jDBChelper.update(UPDATE_SQL,entity.getHoten(),entity.getGioitinh(),entity.getNgaysinh(),entity.getSodt(),entity.getEmail(),
                entity.getGhichu(),entity.getManv(),entity.getNgayDK(),entity.getMaNH());
    }

    @Override
    public void delete(String id) {
       jDBChelper.update(DELETE_SQL, id);
    }

    @Override
    public Nguoihoc selectByid(String id) {
        ArrayList<Nguoihoc> list=this.selectBySql(SELECT_BY_ID_SQL,id);;
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public ArrayList<Nguoihoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    public ArrayList<Nguoihoc> selectBykeyword(String keyword) {
       String sql="SELECT *FROM Nguoihoc WHERE Hoten LIKE ?";
       return this.selectBySql(sql, "%"+keyword+"%");
    }

    @Override
    protected ArrayList<Nguoihoc> selectBySql(String sql, Object... args) {
       ArrayList<Nguoihoc> list= new ArrayList<>();
        try {
            ResultSet rs=jDBChelper.query(sql, args);
            while(rs.next()){
                Nguoihoc entity = new Nguoihoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setHoten(rs.getString("Hoten"));
                entity.setNgaysinh(rs.getDate("Ngaysinh"));
                entity.setGioitinh(rs.getBoolean("Gioitinh"));
                entity.setSodt(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setGhichu(rs.getString("Ghichu"));
                entity.setManv(rs.getString("MaNV"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public  ArrayList<Nguoihoc> selectNotInCourse(int makh, String keyword){
        String sql= "SELECT FROM Nguoihoc" 
                +"Where Hoten like ? AND"
                +"MaNH NOT IN (SELECT MaNH FROM Hoc vien WHERE MaKH=?) ";
        return this.selectBySql(sql, "%" +keyword+ "%",makh);
    }
    
}
