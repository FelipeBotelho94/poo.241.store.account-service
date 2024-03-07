package espm.store.account;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountResource {

    static private List<AccountOut> accounts = new ArrayList<>();

    @PostMapping("/accounts")
    public void create(@RequestBody AccountIn in) {
        AccountOut out = new AccountOut(UUID.randomUUID().toString(), in.name(), in.email());
        accounts.add(out);
    }

    @GetMapping("/accounts")
    public List<AccountOut> get() {
        return accounts;
    }

    @GetMapping("/accounts/{id}")
    public AccountOut get(@PathVariable String id) {
        return accounts.stream().filter(account -> account.id().equals(id)).findFirst().orElse(null);
    }

    @DeleteMapping("/accounts/{id}")
    public void delete(@PathVariable String id) {
        accounts.removeIf(account -> account.id().equals(id));
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Account microservice!";
    }
    
}
