package com.dailycodebuffer.springboottutorial.controller;

import java.util.List;

import com.dailycodebuffer.springboottutorial.entity.Department;
import com.dailycodebuffer.springboottutorial.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping("/departments")
  public Department saveDepartment(@RequestBody Department department) {
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/departments")
  public List<Department> fetchDepartmentList() {
    return departmentService.fetchDepartmentList();
  }
}
