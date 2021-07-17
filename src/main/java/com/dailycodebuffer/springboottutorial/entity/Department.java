package com.dailycodebuffer.springboottutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long departmentId;
  private String departmentName;
  private String departmentAddress;
  private String departmentCode;

  public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
    this.departmentAddress = departmentAddress;
    this.departmentCode = departmentCode;
  }

  public Department() {

  }

  @Override
  public String toString() {
    return "Department: " + departmentId + departmentName + departmentAddress + departmentCode;
  }

  public Long getDepartmentId() {
    return departmentId;
  }

  public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }

  public String getDepartmentAddress() {
    return departmentAddress;
  }

  public void setDepartmentAddress(String departmentAddress) {
    this.departmentAddress = departmentAddress;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }
}
