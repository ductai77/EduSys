
package com.edusys.DAO;

import java.util.ArrayList;


abstract public class EduSysDAO<EntityType,KeyType> {
    abstract public void insert (EntityType entity);
    abstract public void update (EntityType entity);
    abstract public void delete (KeyType id);
    abstract public EntityType selectByid(KeyType id);
    abstract public ArrayList <EntityType> selectAll();
    abstract protected ArrayList <EntityType> selectBySql(String sql, Object...args);
}
