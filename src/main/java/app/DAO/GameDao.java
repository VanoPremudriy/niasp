package app.DAO;

import org.springframework.stereotype.Repository;
import app.entity.Game;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class GameDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Game> getAll() {
        return entityManager.createQuery("from Game c order by c.id desc", Game.class).getResultList();
    }

    public Game getById(int id) {
        return entityManager.find(Game.class, id);
    }

    public Game create(Game game) {
        entityManager.persist(game);
        return game;
    }

    public void delete(int id) {
        Game game = entityManager.find(Game.class, id);
        if (game != null) {
            entityManager.remove(game);
        }
    }
}