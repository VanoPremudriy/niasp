package app.controller;

import app.DAO.LevelDao;
import app.entity.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class LevelController {
    @Autowired
    private LevelDao levelDao;

    @GetMapping("/levels")
    public List<Level> getAllLevels() {
        return levelDao.getAll();
    }

    @GetMapping("/levels/{levelId}")
    public Level getLevelById(@PathVariable("levelId") int id) {
        return levelDao.getById(id);
    }

    @PostMapping("/levels")
    @ResponseStatus(HttpStatus.CREATED)
    public Level createLevel(@RequestBody Level country) {
        return levelDao.create(country);
    }

    @DeleteMapping("/levels/{levelId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLevel(@PathVariable("levelId") int id) {
        levelDao.delete(id);
    }
}
