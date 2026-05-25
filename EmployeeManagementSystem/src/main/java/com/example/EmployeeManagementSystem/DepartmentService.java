package com.example.EmployeeManagementSystem;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
	public DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	public Optional<Department> getDepartmentById(Long id) {
		return departmentRepository.findById(id);
	}

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public void deletedepartment(Long id) {
		departmentRepository.deleteById(id);
	}
}
