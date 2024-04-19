package dw.gameshop.controller;

import dw.gameshop.model.Game;
import dw.gameshop.model.User;
import dw.gameshop.service.GameShopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameShopController {
    GameShopService gameShopService;

    public GameShopController(GameShopService gameShopService) {
        this.gameShopService = gameShopService;
    }

    @GetMapping("/products")
    public List<Game> getAllGames() {
        return gameShopService.getAllGames();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable long id) {
        return new ResponseEntity<>(gameShopService.getGameById(id), HttpStatus.OK) ;
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Game> updateGameById(@PathVariable long id,
                               @RequestBody Game game) {
        return new ResponseEntity<>(gameShopService.updateGameById(id, game) , HttpStatus.OK);
    }

    @PostMapping("/products/user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(gameShopService.saveUser(user),HttpStatus.OK);
    }
}
