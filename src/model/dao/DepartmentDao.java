package model.dao;

import java.util.List;

import entities.Department;


public interface DepartmentDao {
    public void insert(Department obj);
    public void update(Department obj);
    public void deleteById(Integer id);
    public Department findByiId(Integer id);
    public List<Department> findAll();
    
}
