package dw.wholesale_company.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "부서")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "부서번호",nullable = false,length = 2)
    private String DepartmentNumber;

    @Column(name = "부서명",nullable = false,length = 4)
    private String DepartmentName;

    public Department() {
        super();
    }

    public String getDepartmentNumber() {
        return DepartmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        DepartmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
