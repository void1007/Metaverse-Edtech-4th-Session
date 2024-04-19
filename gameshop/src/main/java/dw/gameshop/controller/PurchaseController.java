package dw.gameshop.controller;

import dw.gameshop.model.Game;
import dw.gameshop.model.Purchase;
import dw.gameshop.model.User;
import dw.gameshop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    @PostMapping("/products/purchase")
    public Purchase savePurchase(@RequestBody Purchase purchase) {
        return purchaseService.savePurchase(purchase);
    }

    @GetMapping("/products/purchase")
    public List<Purchase> getAllPurchases(){
        return purchaseService.getAllPurchases();
    }

    @GetMapping("/products/purchase/{userId}")
    public List<Purchase> getPurchaseListById(@PathVariable String userId){
        return purchaseService.getPurchaseListByUser(userId);
    }



}
