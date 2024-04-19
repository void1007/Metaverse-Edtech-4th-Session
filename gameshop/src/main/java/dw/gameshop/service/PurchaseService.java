package dw.gameshop.service;

import dw.gameshop.exception.ResourceNotFoundException;
import dw.gameshop.model.Purchase;
import dw.gameshop.model.User;
import dw.gameshop.model.UserRepository;
import dw.gameshop.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PurchaseService {
    @Autowired
    PurchaseRepository  purchaseRepository;
    @Autowired
    UserRepository userRepository;

    public Purchase savePurchase(Purchase purchase){
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> getAllPurchases(){
        return purchaseRepository.findAll();
    }

    public List<Purchase> getPurchaseListByUser(String userId){
        //유저아이디로 유저 객체 찾기
        Optional<User> userOptional = userRepository.findByUserId(userId);
        if (userOptional.isEmpty()){
            throw new ResourceNotFoundException("User", "ID", userId);
        }
        return purchaseRepository.findByUser(userOptional.get());
    }

}
