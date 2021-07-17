package com.dailycodebuffer.springboottutorial.controller;

import java.util.List;

import javax.validation.Valid;

import com.dailycodebuffer.springboottutorial.entity.Department;
import com.dailycodebuffer.springboottutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.springboottutorial.service.DepartmentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

  @PostMapping("/departments")
  public Department saveDepartment(@Valid @RequestBody Department department) {
    LOGGER.info("Inside saveDepartment of DepartmentController");
    return departmentService.saveDepartment(department);
  }

  @GetMapping("/departments")
  public List<Department> fetchDepartmentList() {
    LOGGER.info("Inside fetchDepartmentList of DepartmentController");
    return departmentService.fetchDepartmentList();
  }

  @GetMapping("/departments/{id}")
  public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException  {
    return departmentService.getDepartmentById(departmentId);
  }

  @DeleteMapping("/departments/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
    departmentService.deleteDepartmentById(departmentId);
    return "Delete Successfully";
  }

  @PutMapping("/departments/{id}")
  public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
    return departmentService.updateDepartment(departmentId, department);
  }

  @GetMapping("/departments/name/{name}")
  public Department getDepartmentByName(@PathVariable("name") String departmentName) {
    return departmentService.getDepartmentByName(departmentName);
  }
}
