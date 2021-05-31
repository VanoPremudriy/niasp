package pr141.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pr141.models.Card;
import pr141.repositories.CardRepo;

import java.util.UUID;

@RestController
public class CardController {
    @Autowired
    public CardRepo cardRepo;

    @GetMapping("/card")
    public Card getCard(){
        return new Card("4342 4343 1321 5467", 324);
    }

    @GetMapping("/getCard/{id}")
    public Card getCard(@PathVariable UUID id){
        return cardRepo.cards.get(id);
    }

    @PostMapping("/setCard")
    public Card setCard(@RequestBody Card card){
        UUID uuid = UUID.randomUUID();
        cardRepo.cards.put(uuid, card);
        System.out.println(uuid);
        return cardRepo.cards.get(uuid);
    }

    @DeleteMapping("/deleteCard/{id}")
    public String deleteCard(@PathVariable UUID id){
        cardRepo.cards.remove(id);
        return "deleted";
    }
}