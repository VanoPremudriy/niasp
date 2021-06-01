package app.DAO;
import app.entity.Level;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class LevelDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Level> getAll() {
        return entityManager.createQuery("from Level c order by c.id desc", Level.class).getResultList();
    }

    public Level getById(int id) {
        return entityManager.find(Level.class, id);
    }

    public Level create(Level level) {
        entityManager.persist(level);
        return level;
    }

    public void delete(int id) {
        Level level = entityManager.find(Level.class, id);
        if (level != null) {
            entityManager.remove(level);
        }
    }
}
