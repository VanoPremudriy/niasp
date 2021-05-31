package pr141.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pr141.models.Bank;
import pr141.repositories.BankRepo;

import java.util.UUID;

@RestController
public class BankController {
    @Autowired
    public BankRepo bankRepo;

    @GetMapping("/bank")
    public Bank getBank(){
        return new Bank("Sber", "hell");
    }

    @GetMapping("/getBank/{id}")
    public Bank get(@PathVariable UUID id){
        return bankRepo.banks.get(id);
    }

    @PostMapping("/setBank")
    public Bank setBank(@RequestBody Bank bank){
        UUID uuid = UUID.randomUUID();
        bankRepo.banks.put(uuid, bank);
        System.out.println(uuid);
        return bankRepo.banks.get(uuid);
    }

    @DeleteMapping("/deleteBank/{id}")
    public String deleteBank(@PathVariable UUID id){
        bankRepo.banks.remove(id);
        return "deleted";
    }

}