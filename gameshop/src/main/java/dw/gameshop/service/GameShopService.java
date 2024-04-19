package dw.gameshop.service;

import dw.gameshop.model.Game;
import dw.gameshop.model.User;
import dw.gameshop.model.UserRepository;
import dw.gameshop.repository.GameShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameShopService {
    GameShopRepository gameShopRepository;
    UserRepository userRepository;

    public GameShopService(GameShopRepository gameShopRepository, UserRepository userRepository) {
        this.gameShopRepository = gameShopRepository;
        this.userRepository = userRepository;
    }



    public List<Game> getAllGames() {
        return gameShopRepository.findAll();
    }

    public Game getGameById(long id) {
        Optional<Game> gameOptional = gameShopRepository.findById(id);
        if(gameOptional.isPresent()) {
            return gameOptional.get();
        }else {
            return null;
        }
    }

    public Game updateGameById(long id, Game game) {
        Optional<Game> gameOptional = gameShopRepository.findById(id);
        if(gameOptional.isPresent()) {
            Game temp = gameOptional.get();
            temp.setTitle(game.getTitle());
            temp.setGenre(game.getGenre());
            temp.setPrice(game.getPrice());
            temp.setImage(game.getImage());
            temp.setText(game.getText());
            gameShopRepository.save(temp);
            return temp;
        }else {
            return null;
        }
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
}
