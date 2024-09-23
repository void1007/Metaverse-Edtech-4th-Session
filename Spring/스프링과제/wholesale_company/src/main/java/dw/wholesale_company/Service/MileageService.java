package dw.wholesale_company.Service;

import dw.wholesale_company.Model.Mileage;
import dw.wholesale_company.Repository.MileageRepository;

import java.util.List;

public class MileageService {
    MileageRepository mileageRepository;

    public MileageService(MileageRepository mileageRepository) {
        this.mileageRepository = mileageRepository;
    }

    public List<Mileage> getAllMileage(){return mileageRepository.findAll();}
}
