package pr141.repositories;

import org.springframework.stereotype.Repository;
import pr141.models.Card;

import java.util.Hashtable;
import java.util.UUID;

@Repository
public class CardRepo {
    public Hashtable<UUID, Card> cards = new Hashtable<>();
}
