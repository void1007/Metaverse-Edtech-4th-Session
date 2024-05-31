package dw.gameshop.repository;

import dw.gameshop.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface GameShopRepository extends JpaRepository<Game, Long> {
    // Repository에서 JPQL 사용법 : @Query 어노테이션을 사용함
    @Query("select g1 from Game g1 where g1.price = (select max(g2.price) from Game g2)")
    public Game getGameWithMaxPrice();

    @Query("select g1 from Game g1 order by g1.price desc")
    public List<Game> getGameWithMaxPriceTop3();
}






