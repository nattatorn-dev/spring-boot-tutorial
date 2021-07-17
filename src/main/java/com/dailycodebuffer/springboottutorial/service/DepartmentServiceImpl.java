package com.dailycodebuffer.springboottutorial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.dailycodebuffer.springboottutorial.entity.Department;
import com.dailycodebuffer.springboottutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.springboottutorial.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  @Override
  public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
  }

  @Override
  public List<Department> fetchDepartmentList() {
    return departmentRepository.findAll();
  }

  @Override
  public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
    Optional<Department> department = departmentRepository.findById(departmentId);

    if(!department.isPresent()) {
      throw new DepartmentNotFoundException("Department Not Available");
    }

    return department.get();

  }

  @Override
  public void deleteDepartmentById(Long departmentId) {
    departmentRepository.deleteById(departmentId);
  }

  @Override
  public Department updateDepartment(Long departmentId, Department department) {
    Department existing = departmentRepository.findById(departmentId).get();

    if (Objects.nonNull(existing.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
      existing.setDepartmentName(department.getDepartmentName());
    }

    if (Objects.nonNull(existing.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
      existing.setDepartmentCode(department.getDepartmentCode());
    }

    if (Objects.nonNull(existing.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
      existing.setDepartmentAddress(department.getDepartmentAddress());
    }

    return departmentRepository.save(existing);
  }

  @Override
  public Department getDepartmentByName(String departmentName) {
    return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
  }
}
