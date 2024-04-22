package dw.wholesale_company.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "고객")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="고객번호",nullable = false,length = 100)
    private long id;

    @Column(name = "고객회사명",nullable = false,length = 100)
    private String company;

    @Column(name = "담당자명",nullable = false,length = 10)
    private String managerName;

    @Column(name = "담당자직위",nullable = false,length = 10)
    private String managerGrade;

    @Column(name = "주소",nullable = false,length = 255)
    private String address;

    @Column(name = "도시",nullable = false,length = 7)
    private String city;

    @Column(name = "지역",length = 10)
    private String region;

    @Column(name = "전화번호",nullable = false,length = 15)
    private String tel;

    @Column(name = "마일리지",nullable = false)
    private int Mileage;

    public Customer() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerGrade() {
        return managerGrade;
    }

    public void setManagerGrade(String managerGrade) {
        this.managerGrade = managerGrade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int mileage) {
        Mileage = mileage;
    }
}
