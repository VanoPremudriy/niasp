package pr141.repositories;

import org.springframework.stereotype.Repository;
import pr141.models.Bank;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class BankRepo {
    public HashMap<UUID, Bank> banks = new HashMap<>();
}
