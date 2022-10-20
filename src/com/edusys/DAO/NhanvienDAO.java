package com.edusys.DAO;

import com.edusys.entity.Nhanvien;
import com.edusys.utils.jDBChelper;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author MSI GF63
 */
public class NhanvienDAO extends EduSysDAO<Nhanvien, String> {

    String INSERT_SQL = "INSERT INTO Nhanvien(Manv,Matkhau,Hoten,Vaitro) VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE Nhanvien SET Matkhau =?, Hoten=?, Vaitro=? WHERE Manv =?";
    String DELETE_SQL = "DELETE FROM Nhanvien WHERE Manv=?";
    String SELECT_ALL_SQL = "SELECT * FROM Nhanvien";
    String SELECT_BY_ID_SQL = "SELECT * FROM Nhanvien WHERE Manv=?";

    @Override
    public void insert(Nhanvien entity) {

        jDBChelper.update(INSERT_SQL, entity.getManv(), entity.getMatkhau(), entity.getHoten(), entity.getVaitro());
    }

    @Override
    public void update(Nhanvien entity) {
        jDBChelper.update(UPDATE_SQL, entity.getMatkhau(), entity.getHoten(), entity.getVaitro(), entity.getManv());
    }

    @Override
    public void delete(String id) {
        jDBChelper.update(DELETE_SQL, id);
    }

    @Override
    public Nhanvien selectByid(String id) {
        ArrayList<Nhanvien> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public ArrayList<Nhanvien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected ArrayList<Nhanvien> selectBySql(String sql, Object... args) {
        ArrayList<Nhanvien> list = new ArrayList<>();
        try {
            ResultSet rs = jDBChelper.query(sql, args);
            while (rs.next()) {
                Nhanvien entity = new Nhanvien();
                entity.setManv(rs.getString("Manv"));
                entity.setHoten(rs.getString("Hoten"));
                entity.setMatkhau(rs.getString("Matkhau"));
                entity.setVaitro(rs.getBoolean("Vaitro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
