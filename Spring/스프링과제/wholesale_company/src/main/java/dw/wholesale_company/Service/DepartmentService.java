package dw.wholesale_company.Service;

import dw.wholesale_company.Model.Department;
import dw.wholesale_company.Repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {
    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartment(){return departmentRepository.findAll();}
}
