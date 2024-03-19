package espm.store.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* 
 * Aqui eh a camada de regra de negocio.
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account create(Account account) {
        return accountRepository.save(new AccountModel(account)).to();
    }

    public void delete(String id) {
        accountRepository.deleteById(id);
    }

    public List<Account> findAll() {
        return null;
    }

    public Account find(String id) {
        return accountRepository.findById(id).orElse(null).to();
    }
    
}
