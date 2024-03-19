package espm.store.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * Aqui eh a camada de exposicao da API. No caso no padrao REST: GET, POST, PUT, DELETE.
 */
@RestController
public class AccountResource {

    // procura por um objeto do tipo AccountService no pool de objetos e injeta aqui
    @Autowired
    private AccountService accountService;

    @PostMapping("/accounts")
    public void create(@RequestBody AccountIn in) {
        accountService.create(AccountParser.to(in));
    }

    @GetMapping("/accounts")
    public List<AccountOut> get() {
        return accountService.findAll().stream().map(AccountParser::to).toList();
    }

    @GetMapping("/accounts/{id}")
    public AccountOut get(@PathVariable String id) {
        return AccountParser.to(accountService.find(id));
    }

    @DeleteMapping("/accounts/{id}")
    public void delete(@PathVariable String id) {
        accountService.delete(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Account microservice!";
    }
    
}
