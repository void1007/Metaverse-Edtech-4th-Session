package dw.wholesale_company.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "마일리지등급")
public class Mileage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "등급명",nullable = false,length = 2)
    private String gradeName;

    @Column(name = "하한마일리지",nullable = false)
    private int Lowermileage;

    @Column(name = "상한마일리지",nullable = false)
    private int Highermileage;

    public Mileage() {
        super();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public int getLowermileage() {
        return Lowermileage;
    }

    public void setLowermileage(int lowermileage) {
        Lowermileage = lowermileage;
    }

    public int getHighermileage() {
        return Highermileage;
    }

    public void setHighermileage(int highermileage) {
        Highermileage = highermileage;
    }
}
