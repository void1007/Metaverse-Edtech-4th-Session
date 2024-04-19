package dw.gameshop.repository;

import dw.gameshop.model.Purchase;
import dw.gameshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
    //JPA method 명명법에 의거하여 올바를 작명을 해야 함!!!
    //스팩에 명시된 명명법을 제대로 따르기만 하면 JPA가 스팩의 규칙대로 구동됨
    List<Purchase> findByUser(User user);
}
