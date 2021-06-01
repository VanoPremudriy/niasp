package app.controller;

import app.DAO.GameDao;
import app.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class GameController {

    @Autowired
    private GameDao gameDao;

    @GetMapping("/games")
    public List<Game> getAllGames() {
        return gameDao.getAll();
    }


    @GetMapping("/games/{gameId}")
    public Game getGameById(@PathVariable("bankId") int id) {
        return gameDao.getById(id);
    }

    @PostMapping("/games")
    @ResponseStatus(HttpStatus.CREATED)
    public Game createGame(@RequestBody Game country) {
        return gameDao.create(country);
    }

    @DeleteMapping("/games/{gameId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGame(@PathVariable("gameId") int id) {
        gameDao.delete(id);
    }


}
