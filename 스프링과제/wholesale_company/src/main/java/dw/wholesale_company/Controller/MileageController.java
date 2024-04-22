package dw.wholesale_company.Controller;

import dw.wholesale_company.Model.Mileage;
import dw.wholesale_company.Service.MileageService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MileageController {
    MileageService mileageService;

    public MileageController(MileageService mileageService) {
        this.mileageService = mileageService;
    }

    @GetMapping("/mileages")
    public List<Mileage> getAllMileage(){return mileageService.getAllMileage();}
}
