package com.dailycodebuffer.springboottutorial.service;

import java.util.List;

import com.dailycodebuffer.springboottutorial.entity.Department;

public interface DepartmentService {
  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();
}
