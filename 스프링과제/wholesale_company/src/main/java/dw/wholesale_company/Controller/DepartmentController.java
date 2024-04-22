package dw.wholesale_company.Controller;

import dw.wholesale_company.Model.Department;
import dw.wholesale_company.Service.DepartmentService;

import java.util.List;

public class DepartmentController {
    DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public List<Department> getAllDepartment(){return departmentService.getAllDepartment();}
}
