package com.dailycodebuffer.springboottutorial.service;

import java.util.List;

import com.dailycodebuffer.springboottutorial.entity.Department;
import com.dailycodebuffer.springboottutorial.error.DepartmentNotFoundException;

public interface DepartmentService {
  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

  public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

  public void deleteDepartmentById(Long departmentId);

  public Department updateDepartment(Long departmentId, Department department);

  public Department getDepartmentByName(String departmentName);
}
